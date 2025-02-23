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
 * Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
 *
 * @param event 
 * @param `data` 
 */


data class MessageStreamEventOneOf2 (

    @Json(name = "event")
    val event: MessageStreamEventOneOf2.Event,

    @Json(name = "data")
    val `data`: MessageDeltaObject

) {

    /**
     * 
     *
     * Values: threadPeriodMessagePeriodDelta
     */
    @JsonClass(generateAdapter = false)
    enum class Event(val value: kotlin.String) {
        @Json(name = "thread.message.delta") threadPeriodMessagePeriodDelta("thread.message.delta");
    }

}

