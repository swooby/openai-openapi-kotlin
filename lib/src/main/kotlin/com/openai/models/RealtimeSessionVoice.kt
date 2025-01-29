package com.openai.models

import com.squareup.moshi.JsonClass

/**
 * The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`.
 *
 * Values: alloy,ash,ballad,coral,echo,sage,shimmer,verse
 */
@JsonClass(generateAdapter = false)
enum class RealtimeSessionVoice {
    alloy,
    ash,
    ballad,
    coral,
    echo,
    sage,
    shimmer,
    verse,
}
