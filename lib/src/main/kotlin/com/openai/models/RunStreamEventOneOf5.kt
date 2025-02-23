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
 * Occurs when a [run](/docs/api-reference/runs/object) ends with status `incomplete`.
 *
 * @param event 
 * @param `data` 
 */


data class RunStreamEventOneOf5 (

    @Json(name = "event")
    val event: RunStreamEventOneOf5.Event,

    @Json(name = "data")
    val `data`: RunObject

) {

    /**
     * 
     *
     * Values: threadPeriodRunPeriodIncomplete
     */
    @JsonClass(generateAdapter = false)
    enum class Event(val value: kotlin.String) {
        @Json(name = "thread.run.incomplete") threadPeriodRunPeriodIncomplete("thread.run.incomplete");
    }

}

