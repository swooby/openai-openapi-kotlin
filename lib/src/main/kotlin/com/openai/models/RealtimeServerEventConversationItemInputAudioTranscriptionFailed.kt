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

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  `error` events so that the client can identify the related Item. 
 *
 * @param eventId The unique ID of the server event.
 * @param type The event type, must be `conversation.item.input_audio_transcription.failed`. 
 * @param itemId The ID of the user message item.
 * @param contentIndex The index of the content part containing the audio.
 * @param error 
 */


data class RealtimeServerEventConversationItemInputAudioTranscriptionFailed (

    /* The unique ID of the server event. */
    @Json(name = "event_id")
    val eventId: kotlin.String,

    /* The event type, must be `conversation.item.input_audio_transcription.failed`.  */
    @Json(name = "type")
    val type: RealtimeServerEventConversationItemInputAudioTranscriptionFailed.Type,

    /* The ID of the user message item. */
    @Json(name = "item_id")
    val itemId: kotlin.String,

    /* The index of the content part containing the audio. */
    @Json(name = "content_index")
    val contentIndex: kotlin.Int,

    @Json(name = "error")
    val error: RealtimeServerEventConversationItemInputAudioTranscriptionFailedError

) {

    /**
     * The event type, must be `conversation.item.input_audio_transcription.failed`. 
     *
     * Values: conversationPeriodItemPeriodInput_audio_transcriptionPeriodFailed
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "conversation.item.input_audio_transcription.failed") conversationPeriodItemPeriodInput_audio_transcriptionPeriodFailed("conversation.item.input_audio_transcription.failed");
    }

}

