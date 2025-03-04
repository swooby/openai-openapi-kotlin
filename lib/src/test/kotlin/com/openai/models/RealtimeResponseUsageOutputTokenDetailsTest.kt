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

class RealtimeResponseUsageOutputTokenDetailsTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of
        // RealtimeResponseUsageOutputTokenDetails
        // val modelInstance = RealtimeResponseUsageOutputTokenDetails()

        // to test the property `textTokens` - The number of text tokens used in
        // the Response.
        should("test textTokens") {
            // uncomment below to test the property
            // modelInstance.textTokens shouldBe ("TODO")
        }

        // to test the property `audioTokens` - The number of audio tokens used
        // in the Response.
        should("test audioTokens") {
            // uncomment below to test the property
            // modelInstance.audioTokens shouldBe ("TODO")
        }
    }
}
