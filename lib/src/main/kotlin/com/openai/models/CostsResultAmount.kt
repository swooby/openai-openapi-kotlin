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
 * The monetary value in its associated currency.
 *
 * @param `value` The numeric value of the cost.
 * @param currency Lowercase ISO-4217 currency e.g. \"usd\"
 */
data class CostsResultAmount(

    /* The numeric value of the cost. */
    @Json(name = "value") val `value`: java.math.BigDecimal? = null,

    /* Lowercase ISO-4217 currency e.g. \"usd\" */
    @Json(name = "currency") val currency: kotlin.String? = null,
) {}
