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

class ChatCompletionResponseMessageAudioTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of
        // ChatCompletionResponseMessageAudio
        // val modelInstance = ChatCompletionResponseMessageAudio()

        // to test the property `id` - Unique identifier for this audio
        // response.
        should("test id") {
            // uncomment below to test the property
            // modelInstance.id shouldBe ("TODO")
        }

        // to test the property `expiresAt` - The Unix timestamp (in seconds)
        // for when this audio response will no longer be accessible on the
        // server for use in multi-turn conversations.
        should("test expiresAt") {
            // uncomment below to test the property
            // modelInstance.expiresAt shouldBe ("TODO")
        }

        // to test the property ``data`` - Base64 encoded audio bytes generated
        // by the model, in the format specified in the request.
        should("test `data`") {
            // uncomment below to test the property
            // modelInstance.`data` shouldBe ("TODO")
        }

        // to test the property `transcript` - Transcript of the audio generated
        // by the model.
        should("test transcript") {
            // uncomment below to test the property
            // modelInstance.transcript shouldBe ("TODO")
        }
    }
}
