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

class CreateSpeechRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CreateSpeechRequest
        // val modelInstance = CreateSpeechRequest()

        // to test the property `model`
        should("test model") {
            // uncomment below to test the property
            // modelInstance.model shouldBe ("TODO")
        }

        // to test the property `input` - The text to generate audio for. The
        // maximum length is 4096 characters.
        should("test input") {
            // uncomment below to test the property
            // modelInstance.input shouldBe ("TODO")
        }

        // to test the property `voice` - The voice to use when generating the
        // audio. Supported voices are `alloy`, `ash`, `coral`, `echo`, `fable`,
        // `onyx`, `nova`, `sage` and `shimmer`. Previews of the voices are
        // available in the [Text to speech
        // guide](/docs/guides/text-to-speech#voice-options).
        should("test voice") {
            // uncomment below to test the property
            // modelInstance.voice shouldBe ("TODO")
        }

        // to test the property `responseFormat` - The format to audio in.
        // Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
        should("test responseFormat") {
            // uncomment below to test the property
            // modelInstance.responseFormat shouldBe ("TODO")
        }

        // to test the property `speed` - The speed of the generated audio.
        // Select a value from `0.25` to `4.0`. `1.0` is the default.
        should("test speed") {
            // uncomment below to test the property
            // modelInstance.speed shouldBe ("TODO")
        }
    }
}
