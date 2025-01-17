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

import com.openai.models.SubmitToolOutputsRunRequestToolOutputsInner

class SubmitToolOutputsRunRequestToolOutputsInnerTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of SubmitToolOutputsRunRequestToolOutputsInner
        //val modelInstance = SubmitToolOutputsRunRequestToolOutputsInner()

        // to test the property `toolCallId` - The ID of the tool call in the `required_action` object within the run object the output is being submitted for.
        should("test toolCallId") {
            // uncomment below to test the property
            //modelInstance.toolCallId shouldBe ("TODO")
        }

        // to test the property `output` - The output of the tool call to be submitted to continue the run.
        should("test output") {
            // uncomment below to test the property
            //modelInstance.output shouldBe ("TODO")
        }

    }
}
