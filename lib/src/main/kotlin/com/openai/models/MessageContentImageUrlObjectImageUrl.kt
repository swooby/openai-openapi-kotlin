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
 * @param url The external URL of the image, must be a supported image types:
 *   jpeg, jpg, png, gif, webp.
 * @param detail Specifies the detail level of the image. `low` uses fewer
 *   tokens, you can opt in to high resolution using `high`. Default value is
 *   `auto`
 */
data class MessageContentImageUrlObjectImageUrl(

    /* The external URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp. */
    @Json(name = "url") val url: java.net.URI,

    /* Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. Default value is `auto` */
    @Json(name = "detail")
    val detail: MessageContentImageUrlObjectImageUrl.Detail? = Detail.auto,
) {

    /**
     * Specifies the detail level of the image. `low` uses fewer tokens, you can
     * opt in to high resolution using `high`. Default value is `auto`
     *
     * Values: auto,low,high
     */
    @JsonClass(generateAdapter = false)
    enum class Detail(val value: kotlin.String) {
        @Json(name = "auto") auto("auto"),
        @Json(name = "low") low("low"),
        @Json(name = "high") high("high"),
    }
}
