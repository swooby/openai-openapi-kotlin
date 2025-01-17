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

import com.openai.models.InviteProjectsInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents an individual `invite` to the organization.
 *
 * @param `object` The object type, which is always `organization.invite`
 * @param id The identifier, which can be referenced in API endpoints
 * @param email The email address of the individual to whom the invite was sent
 * @param role `owner` or `reader`
 * @param status `accepted`,`expired`, or `pending`
 * @param invitedAt The Unix timestamp (in seconds) of when the invite was sent.
 * @param expiresAt The Unix timestamp (in seconds) of when the invite expires.
 * @param acceptedAt The Unix timestamp (in seconds) of when the invite was accepted.
 * @param projects The projects that were granted membership upon acceptance of the invite.
 */


data class Invite (

    /* The object type, which is always `organization.invite` */
    @Json(name = "object")
    val `object`: Invite.`Object`,

    /* The identifier, which can be referenced in API endpoints */
    @Json(name = "id")
    val id: kotlin.String,

    /* The email address of the individual to whom the invite was sent */
    @Json(name = "email")
    val email: kotlin.String,

    /* `owner` or `reader` */
    @Json(name = "role")
    val role: Invite.Role,

    /* `accepted`,`expired`, or `pending` */
    @Json(name = "status")
    val status: Invite.Status,

    /* The Unix timestamp (in seconds) of when the invite was sent. */
    @Json(name = "invited_at")
    val invitedAt: kotlin.Int,

    /* The Unix timestamp (in seconds) of when the invite expires. */
    @Json(name = "expires_at")
    val expiresAt: kotlin.Int,

    /* The Unix timestamp (in seconds) of when the invite was accepted. */
    @Json(name = "accepted_at")
    val acceptedAt: kotlin.Int? = null,

    /* The projects that were granted membership upon acceptance of the invite. */
    @Json(name = "projects")
    val projects: kotlin.collections.List<InviteProjectsInner>? = null

) {

    /**
     * The object type, which is always `organization.invite`
     *
     * Values: organizationPeriodInvite
     */
    @JsonClass(generateAdapter = false)
    enum class `Object`(val value: kotlin.String) {
        @Json(name = "organization.invite") organizationPeriodInvite("organization.invite");
    }
    /**
     * `owner` or `reader`
     *
     * Values: owner,reader
     */
    @JsonClass(generateAdapter = false)
    enum class Role(val value: kotlin.String) {
        @Json(name = "owner") owner("owner"),
        @Json(name = "reader") reader("reader");
    }
    /**
     * `accepted`,`expired`, or `pending`
     *
     * Values: accepted,expired,pending
     */
    @JsonClass(generateAdapter = false)
    enum class Status(val value: kotlin.String) {
        @Json(name = "accepted") accepted("accepted"),
        @Json(name = "expired") expired("expired"),
        @Json(name = "pending") pending("pending");
    }

}

