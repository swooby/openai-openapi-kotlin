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
 * @param id The service account ID.
 * @param changesRequested
 */
data class AuditLogServiceAccountUpdated(

    /* The service account ID. */
    @Json(name = "id") val id: kotlin.String? = null,
    @Json(name = "changes_requested")
    val changesRequested: AuditLogServiceAccountUpdatedChangesRequested? = null,
) {}
