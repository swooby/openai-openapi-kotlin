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

class CreateModerationResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CreateModerationResponse
        // val modelInstance = CreateModerationResponse()

        // to test the property `id` - The unique identifier for the moderation
        // request.
        should("test id") {
            // uncomment below to test the property
            // modelInstance.id shouldBe ("TODO")
        }

        // to test the property `model` - The model used to generate the
        // moderation results.
        should("test model") {
            // uncomment below to test the property
            // modelInstance.model shouldBe ("TODO")
        }

        // to test the property `results` - A list of moderation objects.
        should("test results") {
            // uncomment below to test the property
            // modelInstance.results shouldBe ("TODO")
        }
    }
}
