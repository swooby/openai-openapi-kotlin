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

class RealtimeServerEventInputAudioBufferSpeechStartedTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of
        // RealtimeServerEventInputAudioBufferSpeechStarted
        // val modelInstance =
        // RealtimeServerEventInputAudioBufferSpeechStarted()

        // to test the property `eventId` - The unique ID of the server event.
        should("test eventId") {
            // uncomment below to test the property
            // modelInstance.eventId shouldBe ("TODO")
        }

        // to test the property `type` - The event type, must be
        // `input_audio_buffer.speech_started`.
        should("test type") {
            // uncomment below to test the property
            // modelInstance.type shouldBe ("TODO")
        }

        // to test the property `audioStartMs` - Milliseconds from the start of
        // all audio written to the buffer during the  session when speech was
        // first detected. This will correspond to the  beginning of audio sent
        // to the model, and thus includes the  `prefix_padding_ms` configured
        // in the Session.
        should("test audioStartMs") {
            // uncomment below to test the property
            // modelInstance.audioStartMs shouldBe ("TODO")
        }

        // to test the property `itemId` - The ID of the user message item that
        // will be created when speech stops.
        should("test itemId") {
            // uncomment below to test the property
            // modelInstance.itemId shouldBe ("TODO")
        }
    }
}
