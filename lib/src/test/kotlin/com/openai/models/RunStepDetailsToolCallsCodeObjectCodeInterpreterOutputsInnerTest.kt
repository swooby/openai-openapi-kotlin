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

import com.openai.models.RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
import com.openai.models.RunStepDetailsToolCallsCodeOutputImageObject
import com.openai.models.RunStepDetailsToolCallsCodeOutputImageObjectImage
import com.openai.models.RunStepDetailsToolCallsCodeOutputLogsObject

class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
        //val modelInstance = RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner()

        // to test the property `type` - Always `logs`.
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `logs` - The text output from the Code Interpreter tool call.
        should("test logs") {
            // uncomment below to test the property
            //modelInstance.logs shouldBe ("TODO")
        }

        // to test the property `image`
        should("test image") {
            // uncomment below to test the property
            //modelInstance.image shouldBe ("TODO")
        }

    }
}
