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
 * The response resource.
 *
 * @param id The unique ID of the response.
 * @param `object` The object type, must be `realtime.response`.
 * @param status The final status of the response (`completed`, `cancelled`,
 *   `failed`, or `incomplete`).
 * @param statusDetails
 * @param output The list of output items generated by the response.
 * @param metadata Set of 16 key-value pairs that can be attached to an object.
 *   This can be useful for storing additional information about the object in a
 *   structured format, and querying for objects via API or the dashboard. Keys
 *   are strings with a maximum length of 64 characters. Values are strings with
 *   a maximum length of 512 characters.
 * @param usage
 * @param conversationId Which conversation the response is added to, determined
 *   by the `conversation` field in the `response.create` event. If `auto`, the
 *   response will be added to the default conversation and the value of
 *   `conversation_id` will be an id like `conv_1234`. If `none`, the response
 *   will not be added to any conversation and the value of `conversation_id`
 *   will be `null`. If responses are being triggered by server VAD, the
 *   response will be added to the default conversation, thus the
 *   `conversation_id` will be an id like `conv_1234`.
 * @param voice The voice the model used to respond. Current voice options are
 *   `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`, `shimmer` and `verse`.
 * @param modalities The set of modalities the model used to respond. If there
 *   are multiple modalities, the model will pick one, for example if
 *   `modalities` is `[\"text\", \"audio\"]`, the model could be responding in
 *   either text or audio.
 * @param outputAudioFormat The format of output audio. Options are `pcm16`,
 *   `g711_ulaw`, or `g711_alaw`.
 * @param temperature Sampling temperature for the model, limited to [0.6, 1.2].
 *   Defaults to 0.8.
 * @param maxOutputTokens
 */
data class RealtimeResponse(

    /* The unique ID of the response. */
    @Json(name = "id") val id: kotlin.String? = null,

    /* The object type, must be `realtime.response`. */
    @Json(name = "object") val `object`: RealtimeResponse.`Object`? = null,

    /* The final status of the response (`completed`, `cancelled`, `failed`, or  `incomplete`).  */
    @Json(name = "status") val status: RealtimeResponse.Status? = null,
    @Json(name = "status_details")
    val statusDetails: RealtimeResponseStatusDetails? = null,

    /* The list of output items generated by the response. */
    @Json(name = "output")
    val output: kotlin.collections.List<RealtimeConversationItem>? = null,

    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format, and querying for objects via API or the dashboard.   Keys are strings with a maximum length of 64 characters. Values are strings with a maximum length of 512 characters.  */
    @Json(name = "metadata")
    val metadata: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,
    @Json(name = "usage") val usage: RealtimeResponseUsage? = null,

    /* Which conversation the response is added to, determined by the `conversation` field in the `response.create` event. If `auto`, the response will be added to the default conversation and the value of `conversation_id` will be an id like `conv_1234`. If `none`, the response will not be added to any conversation and the value of `conversation_id` will be `null`. If responses are being triggered by server VAD, the response will be added to the default conversation, thus the `conversation_id` will be an id like `conv_1234`.  */
    @Json(name = "conversation_id") val conversationId: kotlin.String? = null,

    /* The voice the model used to respond. Current voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`.  */
    @Json(name = "voice") val voice: RealtimeResponse.Voice? = null,

    /* The set of modalities the model used to respond. If there are multiple modalities, the model will pick one, for example if `modalities` is `[\"text\", \"audio\"]`, the model could be responding in either text or audio.  */
    @Json(name = "modalities")
    val modalities: kotlin.collections.List<RealtimeResponse.Modalities>? =
        null,

    /* The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`.  */
    @Json(name = "output_audio_format")
    val outputAudioFormat: RealtimeResponse.OutputAudioFormat? = null,

    /* Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8.  */
    @Json(name = "temperature") val temperature: java.math.BigDecimal? = null,
    @Json(name = "max_output_tokens")
    val maxOutputTokens: RealtimeSessionMaxResponseOutputTokens? = null,
) {

    /**
     * The object type, must be `realtime.response`.
     *
     * Values: realtimePeriodResponse
     */
    @JsonClass(generateAdapter = false)
    enum class `Object`(val value: kotlin.String) {
        @Json(name = "realtime.response")
        realtimePeriodResponse("realtime.response")
    }

    /**
     * The final status of the response (`completed`, `cancelled`, `failed`, or
     * `incomplete`).
     *
     * Values: completed,cancelled,failed,incomplete
     */
    @JsonClass(generateAdapter = false)
    enum class Status(val value: kotlin.String) {
        @Json(name = "completed") completed("completed"),
        @Json(name = "cancelled") cancelled("cancelled"),
        @Json(name = "failed") failed("failed"),
        @Json(name = "in_progress") in_progress("in_progress"),
        @Json(name = "incomplete") incomplete("incomplete"),
    }

    /**
     * The voice the model used to respond. Current voice options are `alloy`,
     * `ash`, `ballad`, `coral`, `echo` `sage`, `shimmer` and `verse`.
     *
     * Values: alloy,ash,ballad,coral,echo,sage,shimmer,verse
     */
    @JsonClass(generateAdapter = false)
    enum class Voice(val value: kotlin.String) {
        @Json(name = "alloy") alloy("alloy"),
        @Json(name = "ash") ash("ash"),
        @Json(name = "ballad") ballad("ballad"),
        @Json(name = "coral") coral("coral"),
        @Json(name = "echo") echo("echo"),
        @Json(name = "sage") sage("sage"),
        @Json(name = "shimmer") shimmer("shimmer"),
        @Json(name = "verse") verse("verse"),
    }

    /**
     * The set of modalities the model used to respond. If there are multiple
     * modalities, the model will pick one, for example if `modalities` is
     * `[\"text\", \"audio\"]`, the model could be responding in either text or
     * audio.
     *
     * Values: text,audio
     */
    @JsonClass(generateAdapter = false)
    enum class Modalities(val value: kotlin.String) {
        @Json(name = "text") text("text"),
        @Json(name = "audio") audio("audio"),
    }

    /**
     * The format of output audio. Options are `pcm16`, `g711_ulaw`, or
     * `g711_alaw`.
     *
     * Values: pcm16,g711_ulaw,g711_alaw
     */
    @JsonClass(generateAdapter = false)
    enum class OutputAudioFormat(val value: kotlin.String) {
        @Json(name = "pcm16") pcm16("pcm16"),
        @Json(name = "g711_ulaw") g711_ulaw("g711_ulaw"),
        @Json(name = "g711_alaw") g711_alaw("g711_alaw"),
    }
}
