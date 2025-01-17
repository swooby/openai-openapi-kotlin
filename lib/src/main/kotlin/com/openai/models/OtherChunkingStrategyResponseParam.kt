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
 * This is returned when the chunking strategy is unknown. Typically, this is because the file was indexed before the `chunking_strategy` concept was introduced in the API.
 *
 * @param type Always `other`.
 */


data class OtherChunkingStrategyResponseParam (

    /* Always `other`. */
    @Json(name = "type")
    val type: OtherChunkingStrategyResponseParam.Type

) {

    /**
     * Always `other`.
     *
     * Values: other
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "other") other("other");
    }

}
