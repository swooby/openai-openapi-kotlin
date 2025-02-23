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

/**
 * The per-line object of the batch output and error files
 *
 * @param id 
 * @param customId A developer-provided per-request id that will be used to match outputs to inputs.
 * @param response 
 * @param error 
 */


data class BatchRequestOutput (

    @Json(name = "id")
    val id: kotlin.String? = null,

    /* A developer-provided per-request id that will be used to match outputs to inputs. */
    @Json(name = "custom_id")
    val customId: kotlin.String? = null,

    @Json(name = "response")
    val response: BatchRequestOutputResponse? = null,

    @Json(name = "error")
    val error: BatchRequestOutputError? = null

) {


}

