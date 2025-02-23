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
 * @param type The type of the integration being enabled for the fine-tuning job
 * @param wandb 
 */


data class FineTuningJobIntegrationsInner (

    /* The type of the integration being enabled for the fine-tuning job */
    @Json(name = "type")
    val type: FineTuningJobIntegrationsInner.Type,

    @Json(name = "wandb")
    val wandb: CreateFineTuningJobRequestIntegrationsInnerWandb

) {

    /**
     * The type of the integration being enabled for the fine-tuning job
     *
     * Values: wandb
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "wandb") wandb("wandb");
    }

}

