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

import com.openai.models.RealtimeServerEventError
import com.openai.models.RealtimeServerEventErrorError

class RealtimeServerEventErrorTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of RealtimeServerEventError
        //val modelInstance = RealtimeServerEventError()

        // to test the property `eventId` - The unique ID of the server event.
        should("test eventId") {
            // uncomment below to test the property
            //modelInstance.eventId shouldBe ("TODO")
        }

        // to test the property `type` - The event type, must be `error`.
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `error`
        should("test error") {
            // uncomment below to test the property
            //modelInstance.error shouldBe ("TODO")
        }

    }
}
