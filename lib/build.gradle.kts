import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask

plugins {
    alias(libs.plugins.kotlin.jvm)
    // id("maven-publish")
    alias(libs.plugins.spotless)
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

// Use spotless plugin to automatically format code, remove unused import, etc
// To apply changes directly to the file, run `gradlew spotlessApply`
// Ref: https://github.com/diffplug/spotless/tree/main/plugin-gradle
spotless {
    kotlin {
        ktfmt("0.54").googleStyle().configure {
            // https://github.com/diffplug/spotless/blob/main/lib/src/ktfmt/java/com/diffplug/spotless/glue/ktfmt/KtfmtFormattingOptions.java
            it.setMaxWidth(80)
            it.setBlockIndent(4)
            it.setContinuationIndent(4)
            it.setRemoveUnusedImports(true)
            it.setManageTrailingCommas(true)
        }
    }
}
