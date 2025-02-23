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
 * 
 *
 * @param event 
 * @param `data` 
 * @param enabled Whether to enable input audio transcription.
 */


data class ThreadStreamEvent (

    @Json(name = "event")
    val event: ThreadStreamEvent.Event,

    @Json(name = "data")
    val `data`: ThreadObject,

    /* Whether to enable input audio transcription. */
    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null

) {

    /**
     * 
     *
     * Values: threadPeriodCreated
     */
    @JsonClass(generateAdapter = false)
    enum class Event(val value: kotlin.String) {
        @Json(name = "thread.created") threadPeriodCreated("thread.created");
    }

}

