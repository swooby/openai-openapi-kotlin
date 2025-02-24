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

class RealtimeSessionCreateResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of
        // RealtimeSessionCreateResponse
        // val modelInstance = RealtimeSessionCreateResponse()

        // to test the property `clientSecret`
        should("test clientSecret") {
            // uncomment below to test the property
            // modelInstance.clientSecret shouldBe ("TODO")
        }

        // to test the property `modalities` - The set of modalities the model
        // can respond with. To disable audio, set this to [\"text\"].
        should("test modalities") {
            // uncomment below to test the property
            // modelInstance.modalities shouldBe ("TODO")
        }

        // to test the property `instructions` - The default system instructions
        // (i.e. system message) prepended to model  calls. This field allows
        // the client to guide the model on desired  responses. The model can be
        // instructed on response content and format,  (e.g. \"be extremely
        // succinct\", \"act friendly\", \"here are examples of good
        // responses\") and on audio behavior (e.g. \"talk quickly\", \"inject
        // emotion  into your voice\", \"laugh frequently\"). The instructions
        // are not guaranteed  to be followed by the model, but they provide
        // guidance to the model on the  desired behavior.  Note that the server
        // sets default instructions which will be used if this  field is not
        // set and are visible in the `session.created` event at the  start of
        // the session.
        should("test instructions") {
            // uncomment below to test the property
            // modelInstance.instructions shouldBe ("TODO")
        }

        // to test the property `voice` - The voice the model uses to respond.
        // Voice cannot be changed during the  session once the model has
        // responded with audio at least once. Current  voice options are
        // `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and
        // `verse`.
        should("test voice") {
            // uncomment below to test the property
            // modelInstance.voice shouldBe ("TODO")
        }

        // to test the property `inputAudioFormat` - The format of input audio.
        // Options are `pcm16`, `g711_ulaw`, or `g711_alaw`.
        should("test inputAudioFormat") {
            // uncomment below to test the property
            // modelInstance.inputAudioFormat shouldBe ("TODO")
        }

        // to test the property `outputAudioFormat` - The format of output
        // audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`.
        should("test outputAudioFormat") {
            // uncomment below to test the property
            // modelInstance.outputAudioFormat shouldBe ("TODO")
        }

        // to test the property `inputAudioTranscription`
        should("test inputAudioTranscription") {
            // uncomment below to test the property
            // modelInstance.inputAudioTranscription shouldBe ("TODO")
        }

        // to test the property `turnDetection`
        should("test turnDetection") {
            // uncomment below to test the property
            // modelInstance.turnDetection shouldBe ("TODO")
        }

        // to test the property `tools` - Tools (functions) available to the
        // model.
        should("test tools") {
            // uncomment below to test the property
            // modelInstance.tools shouldBe ("TODO")
        }

        // to test the property `toolChoice` - How the model chooses tools.
        // Options are `auto`, `none`, `required`, or  specify a function.
        should("test toolChoice") {
            // uncomment below to test the property
            // modelInstance.toolChoice shouldBe ("TODO")
        }

        // to test the property `temperature` - Sampling temperature for the
        // model, limited to [0.6, 1.2]. Defaults to 0.8.
        should("test temperature") {
            // uncomment below to test the property
            // modelInstance.temperature shouldBe ("TODO")
        }

        // to test the property `maxResponseOutputTokens`
        should("test maxResponseOutputTokens") {
            // uncomment below to test the property
            // modelInstance.maxResponseOutputTokens shouldBe ("TODO")
        }
    }
}
