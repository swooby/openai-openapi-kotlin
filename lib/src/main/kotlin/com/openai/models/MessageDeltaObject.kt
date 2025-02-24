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
 * Represents a message delta i.e. any changed fields on a message during
 * streaming.
 *
 * @param id The identifier of the message, which can be referenced in API
 *   endpoints.
 * @param `object` The object type, which is always `thread.message.delta`.
 * @param delta
 */
data class MessageDeltaObject(

    /* The identifier of the message, which can be referenced in API endpoints. */
    @Json(name = "id") val id: kotlin.String,

    /* The object type, which is always `thread.message.delta`. */
    @Json(name = "object") val `object`: MessageDeltaObject.`Object`,
    @Json(name = "delta") val delta: MessageDeltaObjectDelta,
) {

    /**
     * The object type, which is always `thread.message.delta`.
     *
     * Values: threadPeriodMessagePeriodDelta
     */
    @JsonClass(generateAdapter = false)
    enum class `Object`(val value: kotlin.String) {
        @Json(name = "thread.message.delta")
        threadPeriodMessagePeriodDelta("thread.message.delta")
    }
}
