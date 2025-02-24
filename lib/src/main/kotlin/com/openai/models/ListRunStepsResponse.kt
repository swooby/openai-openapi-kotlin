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

/**
 * @param `object`
 * @param `data`
 * @param firstId
 * @param lastId
 * @param hasMore
 */
data class ListRunStepsResponse(
    @Json(name = "object") val `object`: kotlin.String,
    @Json(name = "data") val `data`: kotlin.collections.List<RunStepObject>,
    @Json(name = "first_id") val firstId: kotlin.String,
    @Json(name = "last_id") val lastId: kotlin.String,
    @Json(name = "has_more") val hasMore: kotlin.Boolean,
) {}
