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

class RunStepDetailsToolCallsCodeObjectTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of
        // RunStepDetailsToolCallsCodeObject
        // val modelInstance = RunStepDetailsToolCallsCodeObject()

        // to test the property `id` - The ID of the tool call.
        should("test id") {
            // uncomment below to test the property
            // modelInstance.id shouldBe ("TODO")
        }

        // to test the property `type` - The type of tool call. This is always
        // going to be `code_interpreter` for this type of tool call.
        should("test type") {
            // uncomment below to test the property
            // modelInstance.type shouldBe ("TODO")
        }

        // to test the property `codeInterpreter`
        should("test codeInterpreter") {
            // uncomment below to test the property
            // modelInstance.codeInterpreter shouldBe ("TODO")
        }
    }
}
