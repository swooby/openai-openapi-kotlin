
plugins {
    alias(libs.plugins.kotlin.jvm)
    // id("maven-publish")
}

group = "com.openai"
version = "0.0.1"

tasks.test {
    useJUnitPlatform()
}

dependencies {
    implementation(libs.moshi.kotlin)
    implementation(platform(libs.okhttp3.bom))
    implementation(libs.okhttp3)
    testImplementation(libs.kotlintest.runner.junit5)
}
