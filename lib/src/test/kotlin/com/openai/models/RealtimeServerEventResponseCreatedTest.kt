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

import com.openai.models.RealtimeServerEventResponseCreated
import com.openai.models.RealtimeResponse

class RealtimeServerEventResponseCreatedTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of RealtimeServerEventResponseCreated
        //val modelInstance = RealtimeServerEventResponseCreated()

        // to test the property `eventId` - The unique ID of the server event.
        should("test eventId") {
            // uncomment below to test the property
            //modelInstance.eventId shouldBe ("TODO")
        }

        // to test the property `type` - The event type, must be `response.created`.
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `response`
        should("test response") {
            // uncomment below to test the property
            //modelInstance.response shouldBe ("TODO")
        }

    }
}
