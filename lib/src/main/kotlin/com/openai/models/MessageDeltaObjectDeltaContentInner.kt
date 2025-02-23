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
 * @param index The index of the content part in the message.
 * @param type Always `image_file`.
 * @param imageFile 
 * @param text 
 * @param refusal 
 * @param imageUrl 
 */


data class MessageDeltaObjectDeltaContentInner (

    /* The index of the content part in the message. */
    @Json(name = "index")
    val index: kotlin.Int,

    /* Always `image_file`. */
    @Json(name = "type")
    val type: MessageDeltaObjectDeltaContentInner.Type,

    @Json(name = "image_file")
    val imageFile: MessageDeltaContentImageFileObjectImageFile? = null,

    @Json(name = "text")
    val text: MessageDeltaContentTextObjectText? = null,

    @Json(name = "refusal")
    val refusal: kotlin.String? = null,

    @Json(name = "image_url")
    val imageUrl: MessageDeltaContentImageUrlObjectImageUrl? = null

) {

    /**
     * Always `image_file`.
     *
     * Values: image_file,text,refusal,image_url
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "image_file") image_file("image_file"),
        @Json(name = "text") text("text"),
        @Json(name = "refusal") refusal("refusal"),
        @Json(name = "image_url") image_url("image_url");
    }

}

