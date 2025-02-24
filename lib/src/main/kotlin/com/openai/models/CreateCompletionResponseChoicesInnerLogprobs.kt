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
 * @param textOffset
 * @param tokenLogprobs
 * @param tokens
 * @param topLogprobs
 */
data class CreateCompletionResponseChoicesInnerLogprobs(
    @Json(name = "text_offset")
    val textOffset: kotlin.collections.List<kotlin.Int>? = null,
    @Json(name = "token_logprobs")
    val tokenLogprobs: kotlin.collections.List<java.math.BigDecimal>? = null,
    @Json(name = "tokens")
    val tokens: kotlin.collections.List<kotlin.String>? = null,
    @Json(name = "top_logprobs")
    val topLogprobs:
        kotlin.collections.List<
            kotlin.collections.Map<kotlin.String, java.math.BigDecimal>
        >? =
        null,
) {}
