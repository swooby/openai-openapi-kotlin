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
 * Returned when a conversation is created. Emitted right after session
 * creation.
 *
 * @param eventId The unique ID of the server event.
 * @param type The event type, must be `conversation.created`.
 * @param conversation
 */
data class RealtimeServerEventConversationCreated(

    /* The unique ID of the server event. */
    @Json(name = "event_id") val eventId: kotlin.String,

    /* The event type, must be `conversation.created`. */
    @Json(name = "type") val type: RealtimeServerEventConversationCreated.Type,
    @Json(name = "conversation")
    val conversation: RealtimeServerEventConversationCreatedConversation,
) {

    /**
     * The event type, must be `conversation.created`.
     *
     * Values: conversationPeriodCreated
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "conversation.created")
        conversationPeriodCreated("conversation.created")
    }
}
