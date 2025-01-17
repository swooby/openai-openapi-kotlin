@file:Suppress("EnumEntryName")

package com.openai.models

import com.squareup.moshi.JsonClass

/**
 * The set of modalities the model can respond with. To disable audio, set this to [\"text\"].
 *
 * Values: text,audio
 */
@JsonClass(generateAdapter = false)
enum class RealtimeSessionModalities {
    text,
    audio,
}
