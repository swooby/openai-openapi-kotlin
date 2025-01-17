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

import com.openai.models.RunStepDeltaObjectDeltaStepDetails

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The delta containing the fields that have changed on the run step.
 *
 * @param stepDetails 
 */


data class RunStepDeltaObjectDelta (

    @Json(name = "step_details")
    val stepDetails: RunStepDeltaObjectDeltaStepDetails? = null

) {


}

