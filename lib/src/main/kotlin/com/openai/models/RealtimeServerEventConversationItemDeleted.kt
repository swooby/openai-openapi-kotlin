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
 * Returned when an item in the conversation is deleted by the client with a  `conversation.item.delete` event. This event is used to synchronize the  server's understanding of the conversation history with the client's view. 
 *
 * @param eventId The unique ID of the server event.
 * @param type The event type, must be `conversation.item.deleted`.
 * @param itemId The ID of the item that was deleted.
 */


data class RealtimeServerEventConversationItemDeleted (

    /* The unique ID of the server event. */
    @Json(name = "event_id")
    val eventId: kotlin.String,

    /* The event type, must be `conversation.item.deleted`. */
    @Json(name = "type")
    val type: RealtimeServerEventConversationItemDeleted.Type,

    /* The ID of the item that was deleted. */
    @Json(name = "item_id")
    val itemId: kotlin.String

) {

    /**
     * The event type, must be `conversation.item.deleted`.
     *
     * Values: conversationPeriodItemPeriodDeleted
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "conversation.item.deleted") conversationPeriodItemPeriodDeleted("conversation.item.deleted");
    }

}
