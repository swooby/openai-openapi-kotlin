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

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @param messages A list of messages comprising the conversation so far.
 *   Depending on the [model](/docs/models) you use, different message types
 *   (modalities) are supported, like [text](/docs/guides/text-generation),
 *   [images](/docs/guides/vision), and [audio](/docs/guides/audio).
 * @param model
 * @param store Whether or not to store the output of this chat completion
 *   request for use in our [model distillation](/docs/guides/distillation) or
 *   [evals](/docs/guides/evals) products.
 * @param reasoningEffort
 * @param metadata Set of 16 key-value pairs that can be attached to an object.
 *   This can be useful for storing additional information about the object in a
 *   structured format, and querying for objects via API or the dashboard. Keys
 *   are strings with a maximum length of 64 characters. Values are strings with
 *   a maximum length of 512 characters.
 * @param frequencyPenalty Number between -2.0 and 2.0. Positive values penalize
 *   new tokens based on their existing frequency in the text so far, decreasing
 *   the model's likelihood to repeat the same line verbatim.
 * @param logitBias Modify the likelihood of specified tokens appearing in the
 *   completion. Accepts a JSON object that maps tokens (specified by their
 *   token ID in the tokenizer) to an associated bias value from -100 to 100.
 *   Mathematically, the bias is added to the logits generated by the model
 *   prior to sampling. The exact effect will vary per model, but values between
 *   -1 and 1 should decrease or increase likelihood of selection; values like
 *   -100 or 100 should result in a ban or exclusive selection of the relevant
 *   token.
 * @param logprobs Whether to return log probabilities of the output tokens or
 *   not. If true, returns the log probabilities of each output token returned
 *   in the `content` of `message`.
 * @param topLogprobs An integer between 0 and 20 specifying the number of most
 *   likely tokens to return at each token position, each with an associated log
 *   probability. `logprobs` must be set to `true` if this parameter is used.
 * @param maxTokens The maximum number of [tokens](/tokenizer) that can be
 *   generated in the chat completion. This value can be used to control
 *   [costs](https://openai.com/api/pricing/) for text generated via API. This
 *   value is now deprecated in favor of `max_completion_tokens`, and is not
 *   compatible with [o1 series models](/docs/guides/reasoning).
 * @param maxCompletionTokens An upper bound for the number of tokens that can
 *   be generated for a completion, including visible output tokens and
 *   [reasoning tokens](/docs/guides/reasoning).
 * @param n How many chat completion choices to generate for each input message.
 *   Note that you will be charged based on the number of generated tokens
 *   across all of the choices. Keep `n` as `1` to minimize costs.
 * @param modalities Output types that you would like the model to generate for
 *   this request. Most models are capable of generating text, which is the
 *   default: `[\"text\"]` The `gpt-4o-audio-preview` model can also be used to
 *   [generate audio](/docs/guides/audio). To request that this model generate
 *   both text and audio responses, you can use: `[\"text\", \"audio\"]`
 * @param prediction
 * @param audio
 * @param presencePenalty Number between -2.0 and 2.0. Positive values penalize
 *   new tokens based on whether they appear in the text so far, increasing the
 *   model's likelihood to talk about new topics.
 * @param responseFormat
 * @param seed This feature is in Beta. If specified, our system will make a
 *   best effort to sample deterministically, such that repeated requests with
 *   the same `seed` and parameters should return the same result. Determinism
 *   is not guaranteed, and you should refer to the `system_fingerprint`
 *   response parameter to monitor changes in the backend.
 * @param serviceTier Specifies the latency tier to use for processing the
 *   request. This parameter is relevant for customers subscribed to the scale
 *   tier service: - If set to 'auto', and the Project is Scale tier enabled,
 *   the system will utilize scale tier credits until they are exhausted. - If
 *   set to 'auto', and the Project is not Scale tier enabled, the request will
 *   be processed using the default service tier with a lower uptime SLA and no
 *   latency guarantee. - If set to 'default', the request will be processed
 *   using the default service tier with a lower uptime SLA and no latency
 *   guarantee. - When not set, the default behavior is 'auto'.
 * @param stop
 * @param stream If set, partial message deltas will be sent, like in ChatGPT.
 *   Tokens will be sent as data-only
 *   [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format)
 *   as they become available, with the stream terminated by a `data: [DONE]`
 *   message.
 *   [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions).
 * @param streamOptions
 * @param temperature What sampling temperature to use, between 0 and 2. Higher
 *   values like 0.8 will make the output more random, while lower values like
 *   0.2 will make it more focused and deterministic. We generally recommend
 *   altering this or `top_p` but not both.
 * @param topP An alternative to sampling with temperature, called nucleus
 *   sampling, where the model considers the results of the tokens with top_p
 *   probability mass. So 0.1 means only the tokens comprising the top 10%
 *   probability mass are considered. We generally recommend altering this or
 *   `temperature` but not both.
 * @param tools A list of tools the model may call. Currently, only functions
 *   are supported as a tool. Use this to provide a list of functions the model
 *   may generate JSON inputs for. A max of 128 functions are supported.
 * @param toolChoice
 * @param parallelToolCalls Whether to enable
 *   [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling)
 *   during tool use.
 * @param user A unique identifier representing your end-user, which can help
 *   OpenAI to monitor and detect abuse.
 *   [Learn more](/docs/guides/safety-best-practices#end-user-ids).
 * @param functionCall
 * @param functions Deprecated in favor of `tools`. A list of functions the
 *   model may generate JSON inputs for.
 */
data class CreateChatCompletionRequest(

    /* A list of messages comprising the conversation so far. Depending on the [model](/docs/models) you use, different message types (modalities) are supported, like [text](/docs/guides/text-generation), [images](/docs/guides/vision), and [audio](/docs/guides/audio).  */
    @Json(name = "messages")
    val messages: kotlin.collections.List<ChatCompletionRequestMessage>,
    @Json(name = "model") val model: CreateChatCompletionRequestModel,

    /* Whether or not to store the output of this chat completion request for  use in our [model distillation](/docs/guides/distillation) or [evals](/docs/guides/evals) products.  */
    @Json(name = "store") val store: kotlin.Boolean? = false,
    @Json(name = "reasoning_effort")
    val reasoningEffort: ReasoningEffort? = ReasoningEffort.medium,

    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format, and querying for objects via API or the dashboard.   Keys are strings with a maximum length of 64 characters. Values are strings with a maximum length of 512 characters.  */
    @Json(name = "metadata")
    val metadata: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    /* Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  */
    @Json(name = "frequency_penalty")
    val frequencyPenalty: java.math.BigDecimal? = java.math.BigDecimal("0"),

    /* Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  */
    @Json(name = "logit_bias")
    val logitBias: kotlin.collections.Map<kotlin.String, kotlin.Int>? = null,

    /* Whether to return log probabilities of the output tokens or not. If true, returns the log probabilities of each output token returned in the `content` of `message`.  */
    @Json(name = "logprobs") val logprobs: kotlin.Boolean? = false,

    /* An integer between 0 and 20 specifying the number of most likely tokens to return at each token position, each with an associated log probability. `logprobs` must be set to `true` if this parameter is used.  */
    @Json(name = "top_logprobs") val topLogprobs: kotlin.Int? = null,

    /* The maximum number of [tokens](/tokenizer) that can be generated in the chat completion. This value can be used to control [costs](https://openai.com/api/pricing/) for text generated via API.  This value is now deprecated in favor of `max_completion_tokens`, and is not compatible with [o1 series models](/docs/guides/reasoning).  */
    @Json(name = "max_tokens")
    @Deprecated(message = "This property is deprecated.")
    val maxTokens: kotlin.Int? = null,

    /* An upper bound for the number of tokens that can be generated for a completion, including visible output tokens and [reasoning tokens](/docs/guides/reasoning).  */
    @Json(name = "max_completion_tokens")
    val maxCompletionTokens: kotlin.Int? = null,

    /* How many chat completion choices to generate for each input message. Note that you will be charged based on the number of generated tokens across all of the choices. Keep `n` as `1` to minimize costs. */
    @Json(name = "n") val n: kotlin.Int? = 1,

    /* Output types that you would like the model to generate for this request. Most models are capable of generating text, which is the default:  `[\"text\"]`  The `gpt-4o-audio-preview` model can also be used to [generate audio](/docs/guides/audio). To request that this model generate both text and audio responses, you can use:  `[\"text\", \"audio\"]`  */
    @Json(name = "modalities")
    val modalities:
        kotlin.collections.List<CreateChatCompletionRequest.Modalities>? =
        null,
    @Json(name = "prediction")
    val prediction: CreateChatCompletionRequestPrediction? = null,
    @Json(name = "audio") val audio: CreateChatCompletionRequestAudio? = null,

    /* Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  */
    @Json(name = "presence_penalty")
    val presencePenalty: java.math.BigDecimal? = java.math.BigDecimal("0"),
    @Json(name = "response_format")
    val responseFormat: CreateChatCompletionRequestResponseFormat? = null,

    /* This feature is in Beta. If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same `seed` and parameters should return the same result. Determinism is not guaranteed, and you should refer to the `system_fingerprint` response parameter to monitor changes in the backend.  */
    @Json(name = "seed") val seed: kotlin.Long? = null,

    /* Specifies the latency tier to use for processing the request. This parameter is relevant for customers subscribed to the scale tier service:   - If set to 'auto', and the Project is Scale tier enabled, the system will utilize scale tier credits until they are exhausted.   - If set to 'auto', and the Project is not Scale tier enabled, the request will be processed using the default service tier with a lower uptime SLA and no latency guarantee.   - If set to 'default', the request will be processed using the default service tier with a lower uptime SLA and no latency guarantee.   - When not set, the default behavior is 'auto'.  */
    @Json(name = "service_tier")
    val serviceTier: CreateChatCompletionRequest.ServiceTier? =
        ServiceTier.auto,
    @Json(name = "stop") val stop: CreateChatCompletionRequestStop? = null,

    /* If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions).  */
    @Json(name = "stream") val stream: kotlin.Boolean? = false,
    @Json(name = "stream_options")
    val streamOptions: ChatCompletionStreamOptions? = null,

    /* What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. We generally recommend altering this or `top_p` but not both.  */
    @Json(name = "temperature")
    val temperature: java.math.BigDecimal? = java.math.BigDecimal("1"),

    /* An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both.  */
    @Json(name = "top_p")
    val topP: java.math.BigDecimal? = java.math.BigDecimal("1"),

    /* A list of tools the model may call. Currently, only functions are supported as a tool. Use this to provide a list of functions the model may generate JSON inputs for. A max of 128 functions are supported.  */
    @Json(name = "tools")
    val tools: kotlin.collections.List<ChatCompletionTool>? = null,
    @Json(name = "tool_choice")
    val toolChoice: ChatCompletionToolChoiceOption? = null,

    /* Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. */
    @Json(name = "parallel_tool_calls")
    val parallelToolCalls: kotlin.Boolean? = true,

    /* A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  */
    @Json(name = "user") val user: kotlin.String? = null,
    @Json(name = "function_call")
    @Deprecated(message = "This property is deprecated.")
    val functionCall: CreateChatCompletionRequestFunctionCall? = null,

    /* Deprecated in favor of `tools`.  A list of functions the model may generate JSON inputs for.  */
    @Json(name = "functions")
    @Deprecated(message = "This property is deprecated.")
    val functions: kotlin.collections.List<ChatCompletionFunctions>? = null,
) {

    /**
     * Output types that you would like the model to generate for this request.
     * Most models are capable of generating text, which is the default:
     * `[\"text\"]` The `gpt-4o-audio-preview` model can also be used to
     * [generate audio](/docs/guides/audio). To request that this model generate
     * both text and audio responses, you can use: `[\"text\", \"audio\"]`
     *
     * Values: text,audio
     */
    @JsonClass(generateAdapter = false)
    enum class Modalities(val value: kotlin.String) {
        @Json(name = "text") text("text"),
        @Json(name = "audio") audio("audio"),
    }

    /**
     * Specifies the latency tier to use for processing the request. This
     * parameter is relevant for customers subscribed to the scale tier
     * service: - If set to 'auto', and the Project is Scale tier enabled, the
     * system will utilize scale tier credits until they are exhausted. - If set
     * to 'auto', and the Project is not Scale tier enabled, the request will be
     * processed using the default service tier with a lower uptime SLA and no
     * latency guarantee. - If set to 'default', the request will be processed
     * using the default service tier with a lower uptime SLA and no latency
     * guarantee. - When not set, the default behavior is 'auto'.
     *
     * Values: auto,default
     */
    @JsonClass(generateAdapter = false)
    enum class ServiceTier(val value: kotlin.String) {
        @Json(name = "auto") auto("auto"),
        @Json(name = "default") default("default"),
    }
}
