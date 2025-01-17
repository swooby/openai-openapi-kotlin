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
 * The details for events with this `type`.
 *
 * @param id The rate limit ID
 */


data class AuditLogRateLimitDeleted (

    /* The rate limit ID */
    @Json(name = "id")
    val id: kotlin.String? = null

) {


}

