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
 * Returned in `server_vad` mode when the server detects the end of speech in  the audio buffer. The server will also send an `conversation.item.created`  event with the user message item that is created from the audio buffer. 
 *
 * @param eventId The unique ID of the server event.
 * @param type The event type, must be `input_audio_buffer.speech_stopped`.
 * @param audioEndMs Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  `min_silence_duration_ms` configured in the Session. 
 * @param itemId The ID of the user message item that will be created.
 */


data class RealtimeServerEventInputAudioBufferSpeechStopped (

    /* The unique ID of the server event. */
    @Json(name = "event_id")
    val eventId: kotlin.String,

    /* The event type, must be `input_audio_buffer.speech_stopped`. */
    @Json(name = "type")
    val type: RealtimeServerEventInputAudioBufferSpeechStopped.Type,

    /* Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  `min_silence_duration_ms` configured in the Session.  */
    @Json(name = "audio_end_ms")
    val audioEndMs: kotlin.Int,

    /* The ID of the user message item that will be created. */
    @Json(name = "item_id")
    val itemId: kotlin.String

) {

    /**
     * The event type, must be `input_audio_buffer.speech_stopped`.
     *
     * Values: input_audio_bufferPeriodSpeech_stopped
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "input_audio_buffer.speech_stopped") input_audio_bufferPeriodSpeech_stopped("input_audio_buffer.speech_stopped");
    }

}
