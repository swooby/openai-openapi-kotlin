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
 * Send this event to commit the user input audio buffer, which will create a  new user message item in the conversation. This event will produce an error  if the input audio buffer is empty. When in Server VAD mode, the client does  not need to send this event, the server will commit the audio buffer  automatically.  Committing the input audio buffer will trigger input audio transcription  (if enabled in session configuration), but it will not create a response  from the model. The server will respond with an `input_audio_buffer.committed`  event. 
 *
 * @param type The event type, must be `input_audio_buffer.commit`.
 * @param eventId Optional client-generated ID used to identify this event.
 */


data class RealtimeClientEventInputAudioBufferCommit (

    /* The event type, must be `input_audio_buffer.commit`. */
    @Json(name = "type")
    val type: RealtimeClientEventInputAudioBufferCommit.Type = RealtimeClientEventInputAudioBufferCommit.Type.input_audio_bufferPeriodCommit,

    /* Optional client-generated ID used to identify this event. */
    @Json(name = "event_id")
    val eventId: kotlin.String? = null

) {

    /**
     * The event type, must be `input_audio_buffer.commit`.
     *
     * Values: input_audio_bufferPeriodCommit
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "input_audio_buffer.commit") input_audio_bufferPeriodCommit("input_audio_buffer.commit");
    }

}

