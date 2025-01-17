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

import com.openai.models.FineTuneDPOMethodHyperparameters

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Configuration for the DPO fine-tuning method.
 *
 * @param hyperparameters 
 */


data class FineTuneDPOMethod (

    @Json(name = "hyperparameters")
    val hyperparameters: FineTuneDPOMethodHyperparameters? = null

) {


}

