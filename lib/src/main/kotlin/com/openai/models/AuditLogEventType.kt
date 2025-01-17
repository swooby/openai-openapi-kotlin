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
 * The event type.
 *
 * Values: api_keyPeriodCreated,api_keyPeriodUpdated,api_keyPeriodDeleted,invitePeriodSent,invitePeriodAccepted,invitePeriodDeleted,loginPeriodSucceeded,loginPeriodFailed,logoutPeriodSucceeded,logoutPeriodFailed,organizationPeriodUpdated,projectPeriodCreated,projectPeriodUpdated,projectPeriodArchived,service_accountPeriodCreated,service_accountPeriodUpdated,service_accountPeriodDeleted,rate_limitPeriodUpdated,rate_limitPeriodDeleted,userPeriodAdded,userPeriodUpdated,userPeriodDeleted
 */

@JsonClass(generateAdapter = false)
enum class AuditLogEventType(val value: kotlin.String) {

    @Json(name = "api_key.created")
    api_keyPeriodCreated("api_key.created"),

    @Json(name = "api_key.updated")
    api_keyPeriodUpdated("api_key.updated"),

    @Json(name = "api_key.deleted")
    api_keyPeriodDeleted("api_key.deleted"),

    @Json(name = "invite.sent")
    invitePeriodSent("invite.sent"),

    @Json(name = "invite.accepted")
    invitePeriodAccepted("invite.accepted"),

    @Json(name = "invite.deleted")
    invitePeriodDeleted("invite.deleted"),

    @Json(name = "login.succeeded")
    loginPeriodSucceeded("login.succeeded"),

    @Json(name = "login.failed")
    loginPeriodFailed("login.failed"),

    @Json(name = "logout.succeeded")
    logoutPeriodSucceeded("logout.succeeded"),

    @Json(name = "logout.failed")
    logoutPeriodFailed("logout.failed"),

    @Json(name = "organization.updated")
    organizationPeriodUpdated("organization.updated"),

    @Json(name = "project.created")
    projectPeriodCreated("project.created"),

    @Json(name = "project.updated")
    projectPeriodUpdated("project.updated"),

    @Json(name = "project.archived")
    projectPeriodArchived("project.archived"),

    @Json(name = "service_account.created")
    service_accountPeriodCreated("service_account.created"),

    @Json(name = "service_account.updated")
    service_accountPeriodUpdated("service_account.updated"),

    @Json(name = "service_account.deleted")
    service_accountPeriodDeleted("service_account.deleted"),

    @Json(name = "rate_limit.updated")
    rate_limitPeriodUpdated("rate_limit.updated"),

    @Json(name = "rate_limit.deleted")
    rate_limitPeriodDeleted("rate_limit.deleted"),

    @Json(name = "user.added")
    userPeriodAdded("user.added"),

    @Json(name = "user.updated")
    userPeriodUpdated("user.updated"),

    @Json(name = "user.deleted")
    userPeriodDeleted("user.deleted");

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is AuditLogEventType) "$data" else null

        /**
         * Returns a valid [AuditLogEventType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): AuditLogEventType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}
