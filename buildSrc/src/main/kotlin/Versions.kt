// SPDX-License-Identifier: MIT OR Apache-2.0

object Publish {
    const val group = "com.github.msink"
    const val user = "msink"
    object pom {
        const val url = "https://github.com/msink/kotlin-libui"
        const val connection = "scm:git:https://github.com/msink/kotlin-libui.git"
        const val devConnection = "scm:git:git@github.com:msink/kotlin-libui.git"
    }
}

object Libui {
    const val version = "alpha4.1-openfolder"
    const val repo = "https://github.com/msink/libui"
}
