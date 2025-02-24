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

class RunStepDeltaStepDetailsToolCallsFileSearchObjectTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of
        // RunStepDeltaStepDetailsToolCallsFileSearchObject
        // val modelInstance =
        // RunStepDeltaStepDetailsToolCallsFileSearchObject()

        // to test the property `index` - The index of the tool call in the tool
        // calls array.
        should("test index") {
            // uncomment below to test the property
            // modelInstance.index shouldBe ("TODO")
        }

        // to test the property `type` - The type of tool call. This is always
        // going to be `file_search` for this type of tool call.
        should("test type") {
            // uncomment below to test the property
            // modelInstance.type shouldBe ("TODO")
        }

        // to test the property `fileSearch` - For now, this is always going to
        // be an empty object.
        should("test fileSearch") {
            // uncomment below to test the property
            // modelInstance.fileSearch shouldBe ("TODO")
        }

        // to test the property `id` - The ID of the tool call object.
        should("test id") {
            // uncomment below to test the property
            // modelInstance.id shouldBe ("TODO")
        }
    }
}
