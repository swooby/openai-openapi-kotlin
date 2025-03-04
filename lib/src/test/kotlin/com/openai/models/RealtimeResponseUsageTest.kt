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

class RealtimeResponseUsageTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of RealtimeResponseUsage
        // val modelInstance = RealtimeResponseUsage()

        // to test the property `totalTokens` - The total number of tokens in
        // the Response including input and output  text and audio tokens.
        should("test totalTokens") {
            // uncomment below to test the property
            // modelInstance.totalTokens shouldBe ("TODO")
        }

        // to test the property `inputTokens` - The number of input tokens used
        // in the Response, including text and  audio tokens.
        should("test inputTokens") {
            // uncomment below to test the property
            // modelInstance.inputTokens shouldBe ("TODO")
        }

        // to test the property `outputTokens` - The number of output tokens
        // sent in the Response, including text and  audio tokens.
        should("test outputTokens") {
            // uncomment below to test the property
            // modelInstance.outputTokens shouldBe ("TODO")
        }

        // to test the property `inputTokenDetails`
        should("test inputTokenDetails") {
            // uncomment below to test the property
            // modelInstance.inputTokenDetails shouldBe ("TODO")
        }

        // to test the property `outputTokenDetails`
        should("test outputTokenDetails") {
            // uncomment below to test the property
            // modelInstance.outputTokenDetails shouldBe ("TODO")
        }
    }
}
