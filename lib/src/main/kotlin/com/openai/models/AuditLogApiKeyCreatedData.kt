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
 * The payload used to create the API key.
 *
 * @param scopes A list of scopes allowed for the API key, e.g.
 *   `[\"api.model.request\"]`
 */
data class AuditLogApiKeyCreatedData(

    /* A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]` */
    @Json(name = "scopes")
    val scopes: kotlin.collections.List<kotlin.String>? = null
) {}
