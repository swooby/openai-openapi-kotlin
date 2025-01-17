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

import com.openai.models.AuditLogActorServiceAccount
import com.openai.models.AuditLogActorUser

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The API Key used to perform the audit logged action.
 *
 * @param id The tracking id of the API key.
 * @param type The type of API key. Can be either `user` or `service_account`.
 * @param user 
 * @param serviceAccount 
 */


data class AuditLogActorApiKey (

    /* The tracking id of the API key. */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* The type of API key. Can be either `user` or `service_account`. */
    @Json(name = "type")
    val type: AuditLogActorApiKey.Type? = null,

    @Json(name = "user")
    val user: AuditLogActorUser? = null,

    @Json(name = "service_account")
    val serviceAccount: AuditLogActorServiceAccount? = null

) {

    /**
     * The type of API key. Can be either `user` or `service_account`.
     *
     * Values: user,service_account
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "user") user("user"),
        @Json(name = "service_account") service_account("service_account");
    }

}
