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
 * @param userId The ID of the user.
 * @param role `owner` or `member`
 */
data class ProjectUserCreateRequest(

    /* The ID of the user. */
    @Json(name = "user_id") val userId: kotlin.String,

    /* `owner` or `member` */
    @Json(name = "role") val role: ProjectUserCreateRequest.Role,
) {

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
