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

class RealtimeConversationItemContentInnerTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of
        // RealtimeConversationItemContentInner
        // val modelInstance = RealtimeConversationItemContentInner()

        // to test the property `type` - The content type (`input_text`,
        // `input_audio`, `item_reference`, `text`).
        should("test type") {
            // uncomment below to test the property
            // modelInstance.type shouldBe ("TODO")
        }

        // to test the property `text` - The text content, used for `input_text`
        // and `text` content types.
        should("test text") {
            // uncomment below to test the property
            // modelInstance.text shouldBe ("TODO")
        }

        // to test the property `id` - ID of a previous conversation item to
        // reference (for `item_reference` content types in `response.create`
        // events). These can reference both client and server created items.
        should("test id") {
            // uncomment below to test the property
            // modelInstance.id shouldBe ("TODO")
        }

        // to test the property `audio` - Base64-encoded audio bytes, used for
        // `input_audio` content type.
        should("test audio") {
            // uncomment below to test the property
            // modelInstance.audio shouldBe ("TODO")
        }

        // to test the property `transcript` - The transcript of the audio, used
        // for `input_audio` content type.
        should("test transcript") {
            // uncomment below to test the property
            // modelInstance.transcript shouldBe ("TODO")
        }
    }
}
