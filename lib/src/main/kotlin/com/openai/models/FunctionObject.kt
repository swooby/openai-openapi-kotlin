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
 * @param name The name of the function to be called. Must be a-z, A-Z, 0-9, or
 *   contain underscores and dashes, with a maximum length of 64.
 * @param description A description of what the function does, used by the model
 *   to choose when and how to call the function.
 * @param parameters The parameters the functions accepts, described as a JSON
 *   Schema object. See the [guide](/docs/guides/function-calling) for examples,
 *   and the
 *   [JSON Schema reference](https://json-schema.org/understanding-json-schema/)
 *   for documentation about the format. Omitting `parameters` defines a
 *   function with an empty parameter list.
 * @param strict Whether to enable strict schema adherence when generating the
 *   function call. If set to true, the model will follow the exact schema
 *   defined in the `parameters` field. Only a subset of JSON Schema is
 *   supported when `strict` is `true`. Learn more about Structured Outputs in
 *   the [function calling guide](docs/guides/function-calling).
 */
data class FunctionObject(

    /* The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. */
    @Json(name = "name") val name: kotlin.String,

    /* A description of what the function does, used by the model to choose when and how to call the function. */
    @Json(name = "description") val description: kotlin.String? = null,

    /* The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list. */
    @Json(name = "parameters")
    val parameters: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    /* Whether to enable strict schema adherence when generating the function call. If set to true, the model will follow the exact schema defined in the `parameters` field. Only a subset of JSON Schema is supported when `strict` is `true`. Learn more about Structured Outputs in the [function calling guide](docs/guides/function-calling). */
    @Json(name = "strict") val strict: kotlin.Boolean? = false,
) {}
