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

/** @param fileId The [file](/docs/api-reference/files) ID of the image. */
data class RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage(

    /* The [file](/docs/api-reference/files) ID of the image. */
    @Json(name = "file_id") val fileId: kotlin.String? = null
) {}
