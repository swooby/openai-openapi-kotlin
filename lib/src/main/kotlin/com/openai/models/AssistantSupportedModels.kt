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
 * Values:
 * o3MinusMini,o3MinusMiniMinus2025Minus01Minus31,o1,o1Minus2024Minus12Minus17,gptMinus4o,gptMinus4oMinus2024Minus11Minus20,gptMinus4oMinus2024Minus08Minus06,gptMinus4oMinus2024Minus05Minus13,gptMinus4oMinusMini,gptMinus4oMinusMiniMinus2024Minus07Minus18,gptMinus4MinusTurbo,gptMinus4MinusTurboMinus2024Minus04Minus09,gptMinus4Minus0125MinusPreview,gptMinus4MinusTurboMinusPreview,gptMinus4Minus1106MinusPreview,gptMinus4MinusVisionMinusPreview,gptMinus4,gptMinus4Minus0314,gptMinus4Minus0613,gptMinus4Minus32k,gptMinus4Minus32kMinus0314,gptMinus4Minus32kMinus0613,gptMinus3Period5MinusTurbo,gptMinus3Period5MinusTurboMinus16k,gptMinus3Period5MinusTurboMinus0613,gptMinus3Period5MinusTurboMinus1106,gptMinus3Period5MinusTurboMinus0125,gptMinus3Period5MinusTurboMinus16kMinus0613
 */
@JsonClass(generateAdapter = false)
enum class AssistantSupportedModels(val value: kotlin.String) {

    @Json(name = "o3-mini") o3MinusMini("o3-mini"),
    @Json(name = "o3-mini-2025-01-31")
    o3MinusMiniMinus2025Minus01Minus31("o3-mini-2025-01-31"),
    @Json(name = "o1") o1("o1"),
    @Json(name = "o1-2024-12-17") o1Minus2024Minus12Minus17("o1-2024-12-17"),
    @Json(name = "gpt-4o") gptMinus4o("gpt-4o"),
    @Json(name = "gpt-4o-2024-11-20")
    gptMinus4oMinus2024Minus11Minus20("gpt-4o-2024-11-20"),
    @Json(name = "gpt-4o-2024-08-06")
    gptMinus4oMinus2024Minus08Minus06("gpt-4o-2024-08-06"),
    @Json(name = "gpt-4o-2024-05-13")
    gptMinus4oMinus2024Minus05Minus13("gpt-4o-2024-05-13"),
    @Json(name = "gpt-4o-mini") gptMinus4oMinusMini("gpt-4o-mini"),
    @Json(name = "gpt-4o-mini-2024-07-18")
    gptMinus4oMinusMiniMinus2024Minus07Minus18("gpt-4o-mini-2024-07-18"),
    @Json(name = "gpt-4-turbo") gptMinus4MinusTurbo("gpt-4-turbo"),
    @Json(name = "gpt-4-turbo-2024-04-09")
    gptMinus4MinusTurboMinus2024Minus04Minus09("gpt-4-turbo-2024-04-09"),
    @Json(name = "gpt-4-0125-preview")
    gptMinus4Minus0125MinusPreview("gpt-4-0125-preview"),
    @Json(name = "gpt-4-turbo-preview")
    gptMinus4MinusTurboMinusPreview("gpt-4-turbo-preview"),
    @Json(name = "gpt-4-1106-preview")
    gptMinus4Minus1106MinusPreview("gpt-4-1106-preview"),
    @Json(name = "gpt-4-vision-preview")
    gptMinus4MinusVisionMinusPreview("gpt-4-vision-preview"),
    @Json(name = "gpt-4") gptMinus4("gpt-4"),
    @Json(name = "gpt-4-0314") gptMinus4Minus0314("gpt-4-0314"),
    @Json(name = "gpt-4-0613") gptMinus4Minus0613("gpt-4-0613"),
    @Json(name = "gpt-4-32k") gptMinus4Minus32k("gpt-4-32k"),
    @Json(name = "gpt-4-32k-0314") gptMinus4Minus32kMinus0314("gpt-4-32k-0314"),
    @Json(name = "gpt-4-32k-0613") gptMinus4Minus32kMinus0613("gpt-4-32k-0613"),
    @Json(name = "gpt-3.5-turbo") gptMinus3Period5MinusTurbo("gpt-3.5-turbo"),
    @Json(name = "gpt-3.5-turbo-16k")
    gptMinus3Period5MinusTurboMinus16k("gpt-3.5-turbo-16k"),
    @Json(name = "gpt-3.5-turbo-0613")
    gptMinus3Period5MinusTurboMinus0613("gpt-3.5-turbo-0613"),
    @Json(name = "gpt-3.5-turbo-1106")
    gptMinus3Period5MinusTurboMinus1106("gpt-3.5-turbo-1106"),
    @Json(name = "gpt-3.5-turbo-0125")
    gptMinus3Period5MinusTurboMinus0125("gpt-3.5-turbo-0125"),
    @Json(name = "gpt-3.5-turbo-16k-0613")
    gptMinus3Period5MinusTurboMinus16kMinus0613("gpt-3.5-turbo-16k-0613");

    /**
     * Override [toString()] to avoid using the enum variable name as the value,
     * and instead use the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different,
     * and ensures that the client sends the correct enum values to the server
     * always.
     */
    override fun toString(): kotlin.String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null
         * otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? =
            if (data is AssistantSupportedModels) "$data" else null

        /**
         * Returns a valid [AssistantSupportedModels] for [data], null
         * otherwise.
         */
        fun decode(data: kotlin.Any?): AssistantSupportedModels? =
            data?.let {
                val normalizedData = "$it".lowercase()
                values().firstOrNull { value ->
                    it == value || normalizedData == "$value".lowercase()
                }
            }
    }
}
