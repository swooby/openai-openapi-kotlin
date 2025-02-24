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
 * The aggregated vector stores usage details of the specific time bucket.
 *
 * @param `object`
 * @param usageBytes The vector stores usage in bytes.
 * @param projectId When `group_by=project_id`, this field provides the project
 *   ID of the grouped usage result.
 */
data class UsageVectorStoresResult(
    @Json(name = "object") val `object`: UsageVectorStoresResult.`Object`,

    /* The vector stores usage in bytes. */
    @Json(name = "usage_bytes") val usageBytes: kotlin.Int,

    /* When `group_by=project_id`, this field provides the project ID of the grouped usage result. */
    @Json(name = "project_id") val projectId: kotlin.String? = null,
) {

    /** Values: organizationPeriodUsagePeriodVector_storesPeriodResult */
    @JsonClass(generateAdapter = false)
    enum class `Object`(val value: kotlin.String) {
        @Json(name = "organization.usage.vector_stores.result")
        organizationPeriodUsagePeriodVector_storesPeriodResult(
            "organization.usage.vector_stores.result"
        )
    }
}
