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
 * The payload used to update the user.
 *
 * @param role The role of the user. Is either `owner` or `member`.
 */


data class AuditLogUserUpdatedChangesRequested (

    /* The role of the user. Is either `owner` or `member`. */
    @Json(name = "role")
    val role: kotlin.String? = null

) {


}
