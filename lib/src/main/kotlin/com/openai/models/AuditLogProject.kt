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
 * The project that the action was scoped to. Absent for actions not scoped to
 * projects.
 *
 * @param id The project ID.
 * @param name The project title.
 */
data class AuditLogProject(

    /* The project ID. */
    @Json(name = "id") val id: kotlin.String? = null,

    /* The project title. */
    @Json(name = "name") val name: kotlin.String? = null,
) {}
