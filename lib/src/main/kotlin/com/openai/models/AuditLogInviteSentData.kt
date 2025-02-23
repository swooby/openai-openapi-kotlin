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

/**
 * The payload used to create the invite.
 *
 * @param email The email invited to the organization.
 * @param role The role the email was invited to be. Is either `owner` or `member`.
 */


data class AuditLogInviteSentData (

    /* The email invited to the organization. */
    @Json(name = "email")
    val email: kotlin.String? = null,

    /* The role the email was invited to be. Is either `owner` or `member`. */
    @Json(name = "role")
    val role: kotlin.String? = null

) {


}

