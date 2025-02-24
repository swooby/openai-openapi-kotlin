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
 * @param id Project's public ID
 * @param role Project membership role
 */
data class InviteProjectsInner(

    /* Project's public ID */
    @Json(name = "id") val id: kotlin.String? = null,

    /* Project membership role */
    @Json(name = "role") val role: InviteProjectsInner.Role? = null,
) {

    /**
     * Project membership role
     *
     * Values: member,owner
     */
    @JsonClass(generateAdapter = false)
    enum class Role(val value: kotlin.String) {
        @Json(name = "member") member("member"),
        @Json(name = "owner") owner("owner"),
    }
}
