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

import com.openai.models.CompletionUsagePromptTokensDetails

class CompletionUsagePromptTokensDetailsTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CompletionUsagePromptTokensDetails
        //val modelInstance = CompletionUsagePromptTokensDetails()

        // to test the property `audioTokens` - Audio input tokens present in the prompt.
        should("test audioTokens") {
            // uncomment below to test the property
            //modelInstance.audioTokens shouldBe ("TODO")
        }

        // to test the property `cachedTokens` - Cached tokens present in the prompt.
        should("test cachedTokens") {
            // uncomment below to test the property
            //modelInstance.cachedTokens shouldBe ("TODO")
        }

    }
}