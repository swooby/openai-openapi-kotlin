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
 * The payload used to create the project.
 *
 * @param name The project name.
 * @param title The title of the project as seen on the dashboard.
 */
data class AuditLogProjectCreatedData(

    /* The project name. */
    @Json(name = "name") val name: kotlin.String? = null,

    /* The title of the project as seen on the dashboard. */
    @Json(name = "title") val title: kotlin.String? = null,
) {}
