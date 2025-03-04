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

class RunStepDetailsToolCallsFunctionObjectTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of
        // RunStepDetailsToolCallsFunctionObject
        // val modelInstance = RunStepDetailsToolCallsFunctionObject()

        // to test the property `id` - The ID of the tool call object.
        should("test id") {
            // uncomment below to test the property
            // modelInstance.id shouldBe ("TODO")
        }

        // to test the property `type` - The type of tool call. This is always
        // going to be `function` for this type of tool call.
        should("test type") {
            // uncomment below to test the property
            // modelInstance.type shouldBe ("TODO")
        }

        // to test the property `function`
        should("test function") {
            // uncomment below to test the property
            // modelInstance.function shouldBe ("TODO")
        }
    }
}
