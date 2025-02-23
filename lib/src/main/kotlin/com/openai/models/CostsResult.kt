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
 * The aggregated costs details of the specific time bucket.
 *
 * @param `object` 
 * @param amount 
 * @param lineItem When `group_by=line_item`, this field provides the line item of the grouped costs result.
 * @param projectId When `group_by=project_id`, this field provides the project ID of the grouped costs result.
 */


data class CostsResult (

    @Json(name = "object")
    val `object`: CostsResult.`Object`,

    @Json(name = "amount")
    val amount: CostsResultAmount? = null,

    /* When `group_by=line_item`, this field provides the line item of the grouped costs result. */
    @Json(name = "line_item")
    val lineItem: kotlin.String? = null,

    /* When `group_by=project_id`, this field provides the project ID of the grouped costs result. */
    @Json(name = "project_id")
    val projectId: kotlin.String? = null

) {

    /**
     * 
     *
     * Values: organizationPeriodCostsPeriodResult
     */
    @JsonClass(generateAdapter = false)
    enum class `Object`(val value: kotlin.String) {
        @Json(name = "organization.costs.result") organizationPeriodCostsPeriodResult("organization.costs.result");
    }

}

