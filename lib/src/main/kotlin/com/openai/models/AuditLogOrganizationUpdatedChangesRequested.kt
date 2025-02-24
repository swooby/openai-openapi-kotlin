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
 * The payload used to update the organization settings.
 *
 * @param title The organization title.
 * @param description The organization description.
 * @param name The organization name.
 * @param settings
 */
data class AuditLogOrganizationUpdatedChangesRequested(

    /* The organization title. */
    @Json(name = "title") val title: kotlin.String? = null,

    /* The organization description. */
    @Json(name = "description") val description: kotlin.String? = null,

    /* The organization name. */
    @Json(name = "name") val name: kotlin.String? = null,
    @Json(name = "settings")
    val settings: AuditLogOrganizationUpdatedChangesRequestedSettings? = null,
) {}
