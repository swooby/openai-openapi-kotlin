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

class MessageDeltaContentImageUrlObjectImageUrlTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of
        // MessageDeltaContentImageUrlObjectImageUrl
        // val modelInstance = MessageDeltaContentImageUrlObjectImageUrl()

        // to test the property `url` - The URL of the image, must be a
        // supported image types: jpeg, jpg, png, gif, webp.
        should("test url") {
            // uncomment below to test the property
            // modelInstance.url shouldBe ("TODO")
        }

        // to test the property `detail` - Specifies the detail level of the
        // image. `low` uses fewer tokens, you can opt in to high resolution
        // using `high`.
        should("test detail") {
            // uncomment below to test the property
            // modelInstance.detail shouldBe ("TODO")
        }
    }
}
