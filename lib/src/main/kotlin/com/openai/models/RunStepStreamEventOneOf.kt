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

import com.openai.models.RunStepObject

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Occurs when a [run step](/docs/api-reference/run-steps/step-object) is created.
 *
 * @param event 
 * @param `data` 
 */


data class RunStepStreamEventOneOf (

    @Json(name = "event")
    val event: RunStepStreamEventOneOf.Event,

    @Json(name = "data")
    val `data`: RunStepObject

) {

    /**
     * 
     *
     * Values: threadPeriodRunPeriodStepPeriodCreated
     */
    @JsonClass(generateAdapter = false)
    enum class Event(val value: kotlin.String) {
        @Json(name = "thread.run.step.created") threadPeriodRunPeriodStepPeriodCreated("thread.run.step.created");
    }

}

