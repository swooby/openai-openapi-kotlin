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

import com.openai.models.FineTunePreferenceRequestInput
import com.openai.models.FineTunePreferenceRequestInputInput
import com.openai.models.FineTunePreferenceRequestInputPreferredCompletionInner

class FineTunePreferenceRequestInputTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of FineTunePreferenceRequestInput
        //val modelInstance = FineTunePreferenceRequestInput()

        // to test the property `input`
        should("test input") {
            // uncomment below to test the property
            //modelInstance.input shouldBe ("TODO")
        }

        // to test the property `preferredCompletion` - The preferred completion message for the output.
        should("test preferredCompletion") {
            // uncomment below to test the property
            //modelInstance.preferredCompletion shouldBe ("TODO")
        }

        // to test the property `nonPreferredCompletion` - The non-preferred completion message for the output.
        should("test nonPreferredCompletion") {
            // uncomment below to test the property
            //modelInstance.nonPreferredCompletion shouldBe ("TODO")
        }

    }
}
