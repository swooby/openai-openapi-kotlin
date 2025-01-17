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
 * Represents an individual project.
 *
 * @param id The identifier, which can be referenced in API endpoints
 * @param `object` The object type, which is always `organization.project`
 * @param name The name of the project. This appears in reporting.
 * @param createdAt The Unix timestamp (in seconds) of when the project was created.
 * @param status `active` or `archived`
 * @param archivedAt The Unix timestamp (in seconds) of when the project was archived or `null`.
 */


data class Project (

    /* The identifier, which can be referenced in API endpoints */
    @Json(name = "id")
    val id: kotlin.String,

    /* The object type, which is always `organization.project` */
    @Json(name = "object")
    val `object`: Project.`Object`,

    /* The name of the project. This appears in reporting. */
    @Json(name = "name")
    val name: kotlin.String,

    /* The Unix timestamp (in seconds) of when the project was created. */
    @Json(name = "created_at")
    val createdAt: kotlin.Int,

    /* `active` or `archived` */
    @Json(name = "status")
    val status: Project.Status,

    /* The Unix timestamp (in seconds) of when the project was archived or `null`. */
    @Json(name = "archived_at")
    val archivedAt: kotlin.Int? = null

) {

    /**
     * The object type, which is always `organization.project`
     *
     * Values: organizationPeriodProject
     */
    @JsonClass(generateAdapter = false)
    enum class `Object`(val value: kotlin.String) {
        @Json(name = "organization.project") organizationPeriodProject("organization.project");
    }
    /**
     * `active` or `archived`
     *
     * Values: active,archived
     */
    @JsonClass(generateAdapter = false)
    enum class Status(val value: kotlin.String) {
        @Json(name = "active") active("active"),
        @Json(name = "archived") archived("archived");
    }

}
