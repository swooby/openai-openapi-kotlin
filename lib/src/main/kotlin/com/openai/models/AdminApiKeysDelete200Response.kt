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
 * @param id
 * @param `object`
 * @param deleted
 */
data class AdminApiKeysDelete200Response(
    @Json(name = "id") val id: kotlin.String? = null,
    @Json(name = "object") val `object`: kotlin.String? = null,
    @Json(name = "deleted") val deleted: kotlin.Boolean? = null,
) {}
