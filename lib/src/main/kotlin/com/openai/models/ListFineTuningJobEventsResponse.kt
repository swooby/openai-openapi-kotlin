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
 * @param `data` 
 * @param `object` 
 * @param hasMore 
 */


data class ListFineTuningJobEventsResponse (

    @Json(name = "data")
    val `data`: kotlin.collections.List<FineTuningJobEvent>,

    @Json(name = "object")
    val `object`: ListFineTuningJobEventsResponse.`Object`,

    @Json(name = "has_more")
    val hasMore: kotlin.Boolean

) {

    /**
     * 
     *
     * Values: list
     */
    @JsonClass(generateAdapter = false)
    enum class `Object`(val value: kotlin.String) {
        @Json(name = "list") list("list");
    }

}

