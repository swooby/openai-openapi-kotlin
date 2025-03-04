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

class RealtimeResponseCreateParamsTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of RealtimeResponseCreateParams
        // val modelInstance = RealtimeResponseCreateParams()

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

        // to test the property `outputAudioFormat` - The format of output
        // audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`.
        should("test outputAudioFormat") {
            // uncomment below to test the property
            // modelInstance.outputAudioFormat shouldBe ("TODO")
        }

        // to test the property `tools` - Tools (functions) available to the
        // model.
        should("test tools") {
            // uncomment below to test the property
            // modelInstance.tools shouldBe ("TODO")
        }

        // to test the property `toolChoice` - How the model chooses tools.
        // Options are `auto`, `none`, `required`, or  specify a function, like
        // `{\"type\": \"function\", \"function\": {\"name\":
        // \"my_function\"}}`.
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

        // to test the property `conversation`
        should("test conversation") {
            // uncomment below to test the property
            // modelInstance.conversation shouldBe ("TODO")
        }

        // to test the property `metadata` - Set of 16 key-value pairs that can
        // be attached to an object. This can be useful for storing additional
        // information about the object in a structured format, and querying for
        // objects via API or the dashboard.   Keys are strings with a maximum
        // length of 64 characters. Values are strings with a maximum length of
        // 512 characters.
        should("test metadata") {
            // uncomment below to test the property
            // modelInstance.metadata shouldBe ("TODO")
        }

        // to test the property `input` - Input items to include in the prompt
        // for the model. Using this field creates a new context for this
        // Response instead of using the default conversation. An empty array
        // `[]` will clear the context for this Response. Note that this can
        // include references to items from the default conversation.
        should("test input") {
            // uncomment below to test the property
            // modelInstance.input shouldBe ("TODO")
        }
    }
}
