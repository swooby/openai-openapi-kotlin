/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.openai.models

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import com.openai.models.Image

class ImageTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of Image
        //val modelInstance = Image()

        // to test the property `b64Json` - The base64-encoded JSON of the generated image, if `response_format` is `b64_json`.
        should("test b64Json") {
            // uncomment below to test the property
            //modelInstance.b64Json shouldBe ("TODO")
        }

        // to test the property `url` - The URL of the generated image, if `response_format` is `url` (default).
        should("test url") {
            // uncomment below to test the property
            //modelInstance.url shouldBe ("TODO")
        }

        // to test the property `revisedPrompt` - The prompt that was used to generate the image, if there was any revision to the prompt.
        should("test revisedPrompt") {
            // uncomment below to test the property
            //modelInstance.revisedPrompt shouldBe ("TODO")
        }

    }
}