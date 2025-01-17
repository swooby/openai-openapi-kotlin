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

import com.openai.models.RunStepCompletionUsage

class RunStepCompletionUsageTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of RunStepCompletionUsage
        //val modelInstance = RunStepCompletionUsage()

        // to test the property `completionTokens` - Number of completion tokens used over the course of the run step.
        should("test completionTokens") {
            // uncomment below to test the property
            //modelInstance.completionTokens shouldBe ("TODO")
        }

        // to test the property `promptTokens` - Number of prompt tokens used over the course of the run step.
        should("test promptTokens") {
            // uncomment below to test the property
            //modelInstance.promptTokens shouldBe ("TODO")
        }

        // to test the property `totalTokens` - Total number of tokens used (prompt + completion).
        should("test totalTokens") {
            // uncomment below to test the property
            //modelInstance.totalTokens shouldBe ("TODO")
        }

    }
}
