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
import com.squareup.moshi.JsonClass

/**
 * Represents an individual user in a project.
 *
 * @param `object` The object type, which is always `organization.project.user`
 * @param id The identifier, which can be referenced in API endpoints
 * @param name The name of the user
 * @param email The email address of the user
 * @param role `owner` or `member`
 * @param addedAt The Unix timestamp (in seconds) of when the project was added.
 */
data class ProjectUser(

    /* The object type, which is always `organization.project.user` */
    @Json(name = "object") val `object`: ProjectUser.`Object`,

    /* The identifier, which can be referenced in API endpoints */
    @Json(name = "id") val id: kotlin.String,

    /* The name of the user */
    @Json(name = "name") val name: kotlin.String,

    /* The email address of the user */
    @Json(name = "email") val email: kotlin.String,

    /* `owner` or `member` */
    @Json(name = "role") val role: ProjectUser.Role,

    /* The Unix timestamp (in seconds) of when the project was added. */
    @Json(name = "added_at") val addedAt: kotlin.Int,
) {

    /**
     * The object type, which is always `organization.project.user`
     *
     * Values: organizationPeriodProjectPeriodUser
     */
    @JsonClass(generateAdapter = false)
    enum class `Object`(val value: kotlin.String) {
        @Json(name = "organization.project.user")
        organizationPeriodProjectPeriodUser("organization.project.user")
    }

    /**
     * `owner` or `member`
     *
     * Values: owner,member
     */
    @JsonClass(generateAdapter = false)
    enum class Role(val value: kotlin.String) {
        @Json(name = "owner") owner("owner"),
        @Json(name = "member") member("member"),
    }
}
