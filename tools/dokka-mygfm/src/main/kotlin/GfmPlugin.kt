package com.github.msink.tools

import org.jetbrains.dokka.CoreExtensions
import org.jetbrains.dokka.base.DokkaBase
import org.jetbrains.dokka.base.renderers.PackageListCreator
import org.jetbrains.dokka.base.renderers.RootCreator
import org.jetbrains.dokka.base.resolvers.local.DokkaLocationProvider
import org.jetbrains.dokka.base.resolvers.local.LocationProviderFactory
import org.jetbrains.dokka.base.resolvers.shared.RecognizedLinkFormat
import org.jetbrains.dokka.gfm.CommonmarkRenderer
import org.jetbrains.dokka.gfm.GfmPlugin
import org.jetbrains.dokka.pages.ContentPage
import org.jetbrains.dokka.pages.ModulePageNode
import org.jetbrains.dokka.pages.PageNode
import org.jetbrains.dokka.pages.RootPageNode
import org.jetbrains.dokka.plugability.DokkaContext
import org.jetbrains.dokka.plugability.DokkaPlugin
import org.jetbrains.dokka.plugability.plugin
import org.jetbrains.dokka.plugability.query
import org.jetbrains.dokka.transformers.pages.PageTransformer

class MyGfmPlugin : DokkaPlugin() {

    val gfmPreprocessors by extensionPoint<PageTransformer>()

    private val dokkaBase by lazy { plugin<DokkaBase>() }
    private val gfmBase by lazy { plugin<GfmPlugin>() }

    val renderer by extending {
        (CoreExtensions.renderer
                providing { MyGfmRenderer(it) }
                override plugin<GfmPlugin>().renderer)
    }

    val locationProviderFactory by extending {
        dokkaBase.locationProviderFactory providing { context ->
            MyLocationProviderFactory(context)
        } override gfmBase.locationProvider
    }

    val rootCreator by extending {
        gfmPreprocessors with RootCreator
    }

    val packageListCreator by extending {
        gfmPreprocessors providing {
            PackageListCreator(it, RecognizedLinkFormat.DokkaGFM)
        } order { after(rootCreator) }
    }
}

class MyGfmRenderer(
    context: DokkaContext
) : CommonmarkRenderer(context) {

    override val preprocessors = context.plugin<MyGfmPlugin>().query { gfmPreprocessors }

    override fun buildPage(page: ContentPage, content: (StringBuilder, ContentPage) -> Unit): String {
        val builder = StringBuilder()
        //builder.append("---\n")
        //builder.append("title: ${page.name} -\n")
        //builder.append("---\n")
        content(builder, page)
        return builder.toString()
    }
}

class MyLocationProviderFactory(val context: DokkaContext) : LocationProviderFactory {
    override fun getLocationProvider(pageNode: RootPageNode)
        = MyLocationProvider(pageNode, context)
}

class MyLocationProvider(
    pageGraphRoot: RootPageNode,
    dokkaContext: DokkaContext
) : DokkaLocationProvider(
    pageGraphRoot = pageGraphRoot,
    dokkaContext = dokkaContext,
    extension = ".md"
) {

    override fun ancestors(node: PageNode): List<PageNode> {
        return generateSequence(node) { it.parent() }
            .filterNot { it is ModulePageNode }
            .toList()
    }

    private fun PageNode.parent() = pageGraphRoot.parentMap[this]
}
