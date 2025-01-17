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

import com.openai.models.RealtimeServerEventInputAudioBufferSpeechStopped

class RealtimeServerEventInputAudioBufferSpeechStoppedTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of RealtimeServerEventInputAudioBufferSpeechStopped
        //val modelInstance = RealtimeServerEventInputAudioBufferSpeechStopped()

        // to test the property `eventId` - The unique ID of the server event.
        should("test eventId") {
            // uncomment below to test the property
            //modelInstance.eventId shouldBe ("TODO")
        }

        // to test the property `type` - The event type, must be `input_audio_buffer.speech_stopped`.
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `audioEndMs` - Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  `min_silence_duration_ms` configured in the Session. 
        should("test audioEndMs") {
            // uncomment below to test the property
            //modelInstance.audioEndMs shouldBe ("TODO")
        }

        // to test the property `itemId` - The ID of the user message item that will be created.
        should("test itemId") {
            // uncomment below to test the property
            //modelInstance.itemId shouldBe ("TODO")
        }

    }
}
