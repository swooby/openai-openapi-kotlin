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

/**
 * @param toolResources
 * @param metadata Set of 16 key-value pairs that can be attached to an object.
 *   This can be useful for storing additional information about the object in a
 *   structured format, and querying for objects via API or the dashboard. Keys
 *   are strings with a maximum length of 64 characters. Values are strings with
 *   a maximum length of 512 characters.
 */
data class ModifyThreadRequest(
    @Json(name = "tool_resources")
    val toolResources: ModifyThreadRequestToolResources? = null,

    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format, and querying for objects via API or the dashboard.   Keys are strings with a maximum length of 64 characters. Values are strings with a maximum length of 512 characters.  */
    @Json(name = "metadata")
    val metadata: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,
) {}
