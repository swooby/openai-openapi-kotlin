
tasks.wrapper {
    gradleVersion = "8.7"
    distributionUrl = "https://services.gradle.org/distributions/gradle-$gradleVersion-all.zip"
}

buildscript {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}
