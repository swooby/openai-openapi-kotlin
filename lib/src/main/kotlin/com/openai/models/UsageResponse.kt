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
 * @param `object` 
 * @param `data` 
 * @param hasMore 
 * @param nextPage 
 */


data class UsageResponse (

    @Json(name = "object")
    val `object`: UsageResponse.`Object`,

    @Json(name = "data")
    val `data`: kotlin.collections.List<UsageTimeBucket>,

    @Json(name = "has_more")
    val hasMore: kotlin.Boolean,

    @Json(name = "next_page")
    val nextPage: kotlin.String

) {

    /**
     * 
     *
     * Values: page
     */
    @JsonClass(generateAdapter = false)
    enum class `Object`(val value: kotlin.String) {
        @Json(name = "page") page("page");
    }

}

