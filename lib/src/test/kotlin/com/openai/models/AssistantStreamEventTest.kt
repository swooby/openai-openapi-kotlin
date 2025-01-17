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

import com.openai.models.AssistantStreamEvent
import com.openai.models.DoneEvent
import com.openai.models.ErrorEvent
import com.openai.models.MessageStreamEvent
import com.openai.models.RunStepStreamEvent
import com.openai.models.RunStreamEvent
import com.openai.models.ThreadStreamEvent

class AssistantStreamEventTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of AssistantStreamEvent
        //val modelInstance = AssistantStreamEvent()

        // to test the property `event`
        should("test event") {
            // uncomment below to test the property
            //modelInstance.event shouldBe ("TODO")
        }

        // to test the property ``data``
        should("test `data`") {
            // uncomment below to test the property
            //modelInstance.`data` shouldBe ("TODO")
        }

        // to test the property `enabled` - Whether to enable input audio transcription.
        should("test enabled") {
            // uncomment below to test the property
            //modelInstance.enabled shouldBe ("TODO")
        }

    }
}