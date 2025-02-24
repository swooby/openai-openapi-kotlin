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
 * The details for events with this `type`.
 *
 * @param id The rate limit ID
 * @param changesRequested
 */
data class AuditLogRateLimitUpdated(

    /* The rate limit ID */
    @Json(name = "id") val id: kotlin.String? = null,
    @Json(name = "changes_requested")
    val changesRequested: AuditLogRateLimitUpdatedChangesRequested? = null,
) {}
