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

import com.openai.models.CreateFineTuningJobRequestIntegrationsInnerType
import com.openai.models.CreateFineTuningJobRequestIntegrationsInnerWandb

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param type 
 * @param wandb 
 */


data class CreateFineTuningJobRequestIntegrationsInner (

    @Json(name = "type")
    val type: CreateFineTuningJobRequestIntegrationsInnerType,

    @Json(name = "wandb")
    val wandb: CreateFineTuningJobRequestIntegrationsInnerWandb

) {


}

