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

import com.openai.models.RealtimeServerEventConversationCreated
import com.openai.models.RealtimeServerEventConversationCreatedConversation

class RealtimeServerEventConversationCreatedTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of RealtimeServerEventConversationCreated
        //val modelInstance = RealtimeServerEventConversationCreated()

        // to test the property `eventId` - The unique ID of the server event.
        should("test eventId") {
            // uncomment below to test the property
            //modelInstance.eventId shouldBe ("TODO")
        }

        // to test the property `type` - The event type, must be `conversation.created`.
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `conversation`
        should("test conversation") {
            // uncomment below to test the property
            //modelInstance.conversation shouldBe ("TODO")
        }

    }
}
