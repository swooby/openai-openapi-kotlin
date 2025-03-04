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

class RealtimeServerEventResponseOutputItemDoneTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of
        // RealtimeServerEventResponseOutputItemDone
        // val modelInstance = RealtimeServerEventResponseOutputItemDone()

        // to test the property `eventId` - The unique ID of the server event.
        should("test eventId") {
            // uncomment below to test the property
            // modelInstance.eventId shouldBe ("TODO")
        }

        // to test the property `type` - The event type, must be
        // `response.output_item.done`.
        should("test type") {
            // uncomment below to test the property
            // modelInstance.type shouldBe ("TODO")
        }

        // to test the property `responseId` - The ID of the Response to which
        // the item belongs.
        should("test responseId") {
            // uncomment below to test the property
            // modelInstance.responseId shouldBe ("TODO")
        }

        // to test the property `outputIndex` - The index of the output item in
        // the Response.
        should("test outputIndex") {
            // uncomment below to test the property
            // modelInstance.outputIndex shouldBe ("TODO")
        }

        // to test the property `item`
        should("test item") {
            // uncomment below to test the property
            // modelInstance.item shouldBe ("TODO")
        }
    }
}
