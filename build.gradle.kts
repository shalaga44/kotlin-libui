// SPDX-License-Identifier: MIT OR Apache-2.0
@file:Suppress("SpellCheckingInspection")

plugins {
    kotlin("multiplatform") version "1.4.0" apply false
    id("org.jetbrains.dokka") version "1.4.10-dev-53" apply false
    id("de.undercouch.download") version "4.1.1" apply false
}

allprojects {
    repositories {
        jcenter()
        mavenCentral()
        maven("https://dl.bintray.com/kotlin/kotlin-dev")
        maven("https://maven.pkg.jetbrains.space/kotlin/p/dokka/dev")
    }
}
