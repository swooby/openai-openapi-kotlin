@file:Suppress("EnumEntryName")

package com.openai.models

import com.squareup.moshi.JsonClass

/**
 * The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`.
 *
 * Values: pcm16,g711_ulaw,g711_alaw
 */
@JsonClass(generateAdapter = false)
enum class RealtimeSessionOutputAudioFormat {
    pcm16,
    g711_ulaw,
    g711_alaw
}
