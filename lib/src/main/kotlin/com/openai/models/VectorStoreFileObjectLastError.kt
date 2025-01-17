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
 * The last error associated with this vector store file. Will be `null` if there are no errors.
 *
 * @param code One of `server_error` or `rate_limit_exceeded`.
 * @param message A human-readable description of the error.
 */


data class VectorStoreFileObjectLastError (

    /* One of `server_error` or `rate_limit_exceeded`. */
    @Json(name = "code")
    val code: VectorStoreFileObjectLastError.Code,

    /* A human-readable description of the error. */
    @Json(name = "message")
    val message: kotlin.String

) {

    /**
     * One of `server_error` or `rate_limit_exceeded`.
     *
     * Values: server_error,unsupported_file,invalid_file
     */
    @JsonClass(generateAdapter = false)
    enum class Code(val value: kotlin.String) {
        @Json(name = "server_error") server_error("server_error"),
        @Json(name = "unsupported_file") unsupported_file("unsupported_file"),
        @Json(name = "invalid_file") invalid_file("invalid_file");
    }

}

