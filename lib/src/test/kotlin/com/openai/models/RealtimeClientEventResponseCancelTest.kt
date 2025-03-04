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

class RealtimeClientEventResponseCancelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of
        // RealtimeClientEventResponseCancel
        // val modelInstance = RealtimeClientEventResponseCancel()

        // to test the property `type` - The event type, must be
        // `response.cancel`.
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

        // to test the property `responseId` - A specific response ID to cancel
        // - if not provided, will cancel an  in-progress response in the
        // default conversation.
        should("test responseId") {
            // uncomment below to test the property
            // modelInstance.responseId shouldBe ("TODO")
        }
    }
}
