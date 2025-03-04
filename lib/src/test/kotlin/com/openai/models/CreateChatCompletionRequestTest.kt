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

class CreateChatCompletionRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CreateChatCompletionRequest
        // val modelInstance = CreateChatCompletionRequest()

        // to test the property `messages` - A list of messages comprising the
        // conversation so far. Depending on the [model](/docs/models) you use,
        // different message types (modalities) are supported, like
        // [text](/docs/guides/text-generation), [images](/docs/guides/vision),
        // and [audio](/docs/guides/audio).
        should("test messages") {
            // uncomment below to test the property
            // modelInstance.messages shouldBe ("TODO")
        }

        // to test the property `model`
        should("test model") {
            // uncomment below to test the property
            // modelInstance.model shouldBe ("TODO")
        }

        // to test the property `store` - Whether or not to store the output of
        // this chat completion request for  use in our [model
        // distillation](/docs/guides/distillation) or
        // [evals](/docs/guides/evals) products.
        should("test store") {
            // uncomment below to test the property
            // modelInstance.store shouldBe ("TODO")
        }

        // to test the property `reasoningEffort`
        should("test reasoningEffort") {
            // uncomment below to test the property
            // modelInstance.reasoningEffort shouldBe ("TODO")
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

        // to test the property `frequencyPenalty` - Number between -2.0 and
        // 2.0. Positive values penalize new tokens based on their existing
        // frequency in the text so far, decreasing the model's likelihood to
        // repeat the same line verbatim.
        should("test frequencyPenalty") {
            // uncomment below to test the property
            // modelInstance.frequencyPenalty shouldBe ("TODO")
        }

        // to test the property `logitBias` - Modify the likelihood of specified
        // tokens appearing in the completion.  Accepts a JSON object that maps
        // tokens (specified by their token ID in the tokenizer) to an
        // associated bias value from -100 to 100. Mathematically, the bias is
        // added to the logits generated by the model prior to sampling. The
        // exact effect will vary per model, but values between -1 and 1 should
        // decrease or increase likelihood of selection; values like -100 or 100
        // should result in a ban or exclusive selection of the relevant token.
        should("test logitBias") {
            // uncomment below to test the property
            // modelInstance.logitBias shouldBe ("TODO")
        }

        // to test the property `logprobs` - Whether to return log probabilities
        // of the output tokens or not. If true, returns the log probabilities
        // of each output token returned in the `content` of `message`.
        should("test logprobs") {
            // uncomment below to test the property
            // modelInstance.logprobs shouldBe ("TODO")
        }

        // to test the property `topLogprobs` - An integer between 0 and 20
        // specifying the number of most likely tokens to return at each token
        // position, each with an associated log probability. `logprobs` must be
        // set to `true` if this parameter is used.
        should("test topLogprobs") {
            // uncomment below to test the property
            // modelInstance.topLogprobs shouldBe ("TODO")
        }

        // to test the property `maxTokens` - The maximum number of
        // [tokens](/tokenizer) that can be generated in the chat completion.
        // This value can be used to control
        // [costs](https://openai.com/api/pricing/) for text generated via API.
        // This value is now deprecated in favor of `max_completion_tokens`, and
        // is not compatible with [o1 series models](/docs/guides/reasoning).
        should("test maxTokens") {
            // uncomment below to test the property
            // modelInstance.maxTokens shouldBe ("TODO")
        }

        // to test the property `maxCompletionTokens` - An upper bound for the
        // number of tokens that can be generated for a completion, including
        // visible output tokens and [reasoning tokens](/docs/guides/reasoning).
        should("test maxCompletionTokens") {
            // uncomment below to test the property
            // modelInstance.maxCompletionTokens shouldBe ("TODO")
        }

        // to test the property `n` - How many chat completion choices to
        // generate for each input message. Note that you will be charged based
        // on the number of generated tokens across all of the choices. Keep `n`
        // as `1` to minimize costs.
        should("test n") {
            // uncomment below to test the property
            // modelInstance.n shouldBe ("TODO")
        }

        // to test the property `modalities` - Output types that you would like
        // the model to generate for this request. Most models are capable of
        // generating text, which is the default:  `[\"text\"]`  The
        // `gpt-4o-audio-preview` model can also be used to [generate
        // audio](/docs/guides/audio). To request that this model generate both
        // text and audio responses, you can use:  `[\"text\", \"audio\"]`
        should("test modalities") {
            // uncomment below to test the property
            // modelInstance.modalities shouldBe ("TODO")
        }

        // to test the property `prediction`
        should("test prediction") {
            // uncomment below to test the property
            // modelInstance.prediction shouldBe ("TODO")
        }

        // to test the property `audio`
        should("test audio") {
            // uncomment below to test the property
            // modelInstance.audio shouldBe ("TODO")
        }

        // to test the property `presencePenalty` - Number between -2.0 and 2.0.
        // Positive values penalize new tokens based on whether they appear in
        // the text so far, increasing the model's likelihood to talk about new
        // topics.
        should("test presencePenalty") {
            // uncomment below to test the property
            // modelInstance.presencePenalty shouldBe ("TODO")
        }

        // to test the property `responseFormat`
        should("test responseFormat") {
            // uncomment below to test the property
            // modelInstance.responseFormat shouldBe ("TODO")
        }

        // to test the property `seed` - This feature is in Beta. If specified,
        // our system will make a best effort to sample deterministically, such
        // that repeated requests with the same `seed` and parameters should
        // return the same result. Determinism is not guaranteed, and you should
        // refer to the `system_fingerprint` response parameter to monitor
        // changes in the backend.
        should("test seed") {
            // uncomment below to test the property
            // modelInstance.seed shouldBe ("TODO")
        }

        // to test the property `serviceTier` - Specifies the latency tier to
        // use for processing the request. This parameter is relevant for
        // customers subscribed to the scale tier service:   - If set to 'auto',
        // and the Project is Scale tier enabled, the system will utilize scale
        // tier credits until they are exhausted.   - If set to 'auto', and the
        // Project is not Scale tier enabled, the request will be processed
        // using the default service tier with a lower uptime SLA and no latency
        // guarantee.   - If set to 'default', the request will be processed
        // using the default service tier with a lower uptime SLA and no latency
        // guarantee.   - When not set, the default behavior is 'auto'.
        should("test serviceTier") {
            // uncomment below to test the property
            // modelInstance.serviceTier shouldBe ("TODO")
        }

        // to test the property `stop`
        should("test stop") {
            // uncomment below to test the property
            // modelInstance.stop shouldBe ("TODO")
        }

        // to test the property `stream` - If set, partial message deltas will
        // be sent, like in ChatGPT. Tokens will be sent as data-only
        // [server-sent
        // events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions).
        should("test stream") {
            // uncomment below to test the property
            // modelInstance.stream shouldBe ("TODO")
        }

        // to test the property `streamOptions`
        should("test streamOptions") {
            // uncomment below to test the property
            // modelInstance.streamOptions shouldBe ("TODO")
        }

        // to test the property `temperature` - What sampling temperature to
        // use, between 0 and 2. Higher values like 0.8 will make the output
        // more random, while lower values like 0.2 will make it more focused
        // and deterministic. We generally recommend altering this or `top_p`
        // but not both.
        should("test temperature") {
            // uncomment below to test the property
            // modelInstance.temperature shouldBe ("TODO")
        }

        // to test the property `topP` - An alternative to sampling with
        // temperature, called nucleus sampling, where the model considers the
        // results of the tokens with top_p probability mass. So 0.1 means only
        // the tokens comprising the top 10% probability mass are considered.
        // We generally recommend altering this or `temperature` but not both.
        should("test topP") {
            // uncomment below to test the property
            // modelInstance.topP shouldBe ("TODO")
        }

        // to test the property `tools` - A list of tools the model may call.
        // Currently, only functions are supported as a tool. Use this to
        // provide a list of functions the model may generate JSON inputs for. A
        // max of 128 functions are supported.
        should("test tools") {
            // uncomment below to test the property
            // modelInstance.tools shouldBe ("TODO")
        }

        // to test the property `toolChoice`
        should("test toolChoice") {
            // uncomment below to test the property
            // modelInstance.toolChoice shouldBe ("TODO")
        }

        // to test the property `parallelToolCalls` - Whether to enable
        // [parallel function
        // calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
        should("test parallelToolCalls") {
            // uncomment below to test the property
            // modelInstance.parallelToolCalls shouldBe ("TODO")
        }

        // to test the property `user` - A unique identifier representing your
        // end-user, which can help OpenAI to monitor and detect abuse. [Learn
        // more](/docs/guides/safety-best-practices#end-user-ids).
        should("test user") {
            // uncomment below to test the property
            // modelInstance.user shouldBe ("TODO")
        }

        // to test the property `functionCall`
        should("test functionCall") {
            // uncomment below to test the property
            // modelInstance.functionCall shouldBe ("TODO")
        }

        // to test the property `functions` - Deprecated in favor of `tools`.  A
        // list of functions the model may generate JSON inputs for.
        should("test functions") {
            // uncomment below to test the property
            // modelInstance.functions shouldBe ("TODO")
        }
    }
}
