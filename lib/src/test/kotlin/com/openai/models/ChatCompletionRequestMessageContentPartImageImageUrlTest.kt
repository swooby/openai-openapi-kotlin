/**
 * Please note: This class is auto generated by OpenAPI Generator
 * (https://openapi-generator.tech). Do not edit this file manually.
 */
@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport",
)

package com.openai.models

import io.kotlintest.specs.ShouldSpec

class ChatCompletionRequestMessageContentPartImageImageUrlTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of
        // ChatCompletionRequestMessageContentPartImageImageUrl
        // val modelInstance =
        // ChatCompletionRequestMessageContentPartImageImageUrl()

        // to test the property `url` - Either a URL of the image or the base64
        // encoded image data.
        should("test url") {
            // uncomment below to test the property
            // modelInstance.url shouldBe ("TODO")
        }

        // to test the property `detail` - Specifies the detail level of the
        // image. Learn more in the [Vision
        // guide](/docs/guides/vision#low-or-high-fidelity-image-understanding).
        should("test detail") {
            // uncomment below to test the property
            // modelInstance.detail shouldBe ("TODO")
        }
    }
}
