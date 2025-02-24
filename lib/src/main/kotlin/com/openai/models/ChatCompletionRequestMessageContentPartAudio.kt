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
 * Learn about [audio inputs](/docs/guides/audio).
 *
 * @param type The type of the content part. Always `input_audio`.
 * @param inputAudio
 */
data class ChatCompletionRequestMessageContentPartAudio(

    /* The type of the content part. Always `input_audio`. */
    @Json(name = "type")
    val type: ChatCompletionRequestMessageContentPartAudio.Type,
    @Json(name = "input_audio")
    val inputAudio: ChatCompletionRequestMessageContentPartAudioInputAudio,
) {

    /**
     * The type of the content part. Always `input_audio`.
     *
     * Values: input_audio
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "input_audio") input_audio("input_audio")
    }
}
