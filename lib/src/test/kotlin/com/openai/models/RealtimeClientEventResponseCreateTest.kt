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

class RealtimeClientEventResponseCreateTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of
        // RealtimeClientEventResponseCreate
        // val modelInstance = RealtimeClientEventResponseCreate()

        // to test the property `type` - The event type, must be
        // `response.create`.
        should("test type") {
            // uncomment below to test the property
            // modelInstance.type shouldBe ("TODO")
        }

        // to test the property `eventId` - Optional client-generated ID used to
        // identify this event.
        should("test eventId") {
            // uncomment below to test the property
            // modelInstance.eventId shouldBe ("TODO")
        }

        // to test the property `response`
        should("test response") {
            // uncomment below to test the property
            // modelInstance.response shouldBe ("TODO")
        }
    }
}
