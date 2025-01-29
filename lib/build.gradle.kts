import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask

plugins {
    alias(libs.plugins.kotlin.jvm)
    // id("maven-publish")
}

group = "com.openai"
version = "0.0.1"

tasks.test {
    useJUnitPlatform()
}

tasks.named<KotlinCompilationTask<*>>("compileTestKotlin").configure {
    compilerOptions {
        suppressWarnings = true
    }
}

tasks.named<KotlinCompilationTask<*>>("compileKotlin").configure {
    compilerOptions {
        suppressWarnings = true
    }
}

dependencies {
    implementation(libs.squareup.moshi.kotlin)
    implementation(platform(libs.squareup.okhttp3.bom))
    implementation(libs.squareup.okhttp3)
    testImplementation(libs.kotlintest.runner.junit5)
}
