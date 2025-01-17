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
 * 
 *
 * @param `object` The object type, which is always `organization.invite.deleted`
 * @param id 
 * @param deleted 
 */


data class InviteDeleteResponse (

    /* The object type, which is always `organization.invite.deleted` */
    @Json(name = "object")
    val `object`: InviteDeleteResponse.`Object`,

    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "deleted")
    val deleted: kotlin.Boolean

) {

    /**
     * The object type, which is always `organization.invite.deleted`
     *
     * Values: organizationPeriodInvitePeriodDeleted
     */
    @JsonClass(generateAdapter = false)
    enum class `Object`(val value: kotlin.String) {
        @Json(name = "organization.invite.deleted") organizationPeriodInvitePeriodDeleted("organization.invite.deleted");
    }

}

