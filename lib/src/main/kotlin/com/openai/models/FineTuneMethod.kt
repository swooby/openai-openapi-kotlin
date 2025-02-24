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
 * The method used for fine-tuning.
 *
 * @param type The type of method. Is either `supervised` or `dpo`.
 * @param supervised
 * @param dpo
 */
data class FineTuneMethod(

    /* The type of method. Is either `supervised` or `dpo`. */
    @Json(name = "type") val type: FineTuneMethod.Type? = null,
    @Json(name = "supervised") val supervised: FineTuneSupervisedMethod? = null,
    @Json(name = "dpo") val dpo: FineTuneDPOMethod? = null,
) {

    /**
     * The type of method. Is either `supervised` or `dpo`.
     *
     * Values: supervised,dpo
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "supervised") supervised("supervised"),
        @Json(name = "dpo") dpo("dpo"),
    }
}
