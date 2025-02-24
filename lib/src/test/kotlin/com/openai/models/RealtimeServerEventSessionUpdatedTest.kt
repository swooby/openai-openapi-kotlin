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

class RealtimeServerEventSessionUpdatedTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of
        // RealtimeServerEventSessionUpdated
        // val modelInstance = RealtimeServerEventSessionUpdated()

        // to test the property `eventId` - The unique ID of the server event.
        should("test eventId") {
            // uncomment below to test the property
            // modelInstance.eventId shouldBe ("TODO")
        }

        // to test the property `type` - The event type, must be
        // `session.updated`.
        should("test type") {
            // uncomment below to test the property
            // modelInstance.type shouldBe ("TODO")
        }

        // to test the property `session`
        should("test session") {
            // uncomment below to test the property
            // modelInstance.session shouldBe ("TODO")
        }
    }
}
