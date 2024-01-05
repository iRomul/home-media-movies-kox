enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}

include(":cli-app")
include(":commons")
include(":commons-home-media")
include(":core")

rootProject.name = "home-media-movies-kox"

