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

import com.openai.models.FineTuneCompletionRequestInput

class FineTuneCompletionRequestInputTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of FineTuneCompletionRequestInput
        //val modelInstance = FineTuneCompletionRequestInput()

        // to test the property `prompt` - The input prompt for this training example.
        should("test prompt") {
            // uncomment below to test the property
            //modelInstance.prompt shouldBe ("TODO")
        }

        // to test the property `completion` - The desired completion for this training example.
        should("test completion") {
            // uncomment below to test the property
            //modelInstance.completion shouldBe ("TODO")
        }

    }
}