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
 * 
 *
 * @param `value` The data that makes up the text.
 * @param annotations 
 */


data class MessageDeltaContentTextObjectText (

    /* The data that makes up the text. */
    @Json(name = "value")
    val `value`: kotlin.String? = null,

    @Json(name = "annotations")
    val annotations: kotlin.collections.List<MessageDeltaContentTextObjectTextAnnotationsInner>? = null

) {


}

