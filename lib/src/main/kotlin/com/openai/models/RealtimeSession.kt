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

import com.openai.models.RealtimeResponseCreateParamsMaxResponseOutputTokens
import com.openai.models.RealtimeResponseCreateParamsToolsInner
import com.openai.models.RealtimeSessionInputAudioTranscription
import com.openai.models.RealtimeSessionModel
import com.openai.models.RealtimeSessionTurnDetection

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Realtime session object configuration.
 *
 * @param id Unique identifier for the session object. 
 * @param modalities The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
 * @param model 
 * @param instructions The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
 * @param voice The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
 * @param inputAudioFormat The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
 * @param outputAudioFormat The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
 * @param inputAudioTranscription 
 * @param turnDetection 
 * @param tools Tools (functions) available to the model.
 * @param toolChoice How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function. 
 * @param temperature Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
 * @param maxResponseOutputTokens 
 */


data class RealtimeSession (

    /* Unique identifier for the session object.  */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* The set of modalities the model can respond with. To disable audio, set this to [\"text\"].  */
    @Json(name = "modalities")
    val modalities: kotlin.collections.List<RealtimeSession.Modalities>? = null,

    @Json(name = "model")
    val model: RealtimeSessionModel? = null,

    /* The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session.  */
    @Json(name = "instructions")
    val instructions: kotlin.String? = null,

    /* The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`.  */
    @Json(name = "voice")
    val voice: RealtimeSession.Voice? = null,

    /* The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`.  */
    @Json(name = "input_audio_format")
    val inputAudioFormat: RealtimeSession.InputAudioFormat? = null,

    /* The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`.  */
    @Json(name = "output_audio_format")
    val outputAudioFormat: RealtimeSession.OutputAudioFormat? = null,

    @Json(name = "input_audio_transcription")
    val inputAudioTranscription: RealtimeSessionInputAudioTranscription? = null,

    @Json(name = "turn_detection")
    val turnDetection: RealtimeSessionTurnDetection? = null,

    /* Tools (functions) available to the model. */
    @Json(name = "tools")
    val tools: kotlin.collections.List<RealtimeResponseCreateParamsToolsInner>? = null,

    /* How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function.  */
    @Json(name = "tool_choice")
    val toolChoice: kotlin.String? = null,

    /* Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8.  */
    @Json(name = "temperature")
    val temperature: java.math.BigDecimal? = null,

    @Json(name = "max_response_output_tokens")
    val maxResponseOutputTokens: RealtimeResponseCreateParamsMaxResponseOutputTokens? = null

) {

    /**
     * The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
     *
     * Values: text,audio
     */
    @JsonClass(generateAdapter = false)
    enum class Modalities(val value: kotlin.String) {
        @Json(name = "text") text("text"),
        @Json(name = "audio") audio("audio");
    }
    /**
     * The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
     *
     * Values: alloy,ash,ballad,coral,echo,sage,shimmer,verse
     */
    @JsonClass(generateAdapter = false)
    enum class Voice(val value: kotlin.String) {
        @Json(name = "alloy") alloy("alloy"),
        @Json(name = "ash") ash("ash"),
        @Json(name = "ballad") ballad("ballad"),
        @Json(name = "coral") coral("coral"),
        @Json(name = "echo") echo("echo"),
        @Json(name = "sage") sage("sage"),
        @Json(name = "shimmer") shimmer("shimmer"),
        @Json(name = "verse") verse("verse");
    }
    /**
     * The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
     *
     * Values: pcm16,g711_ulaw,g711_alaw
     */
    @JsonClass(generateAdapter = false)
    enum class InputAudioFormat(val value: kotlin.String) {
        @Json(name = "pcm16") pcm16("pcm16"),
        @Json(name = "g711_ulaw") g711_ulaw("g711_ulaw"),
        @Json(name = "g711_alaw") g711_alaw("g711_alaw");
    }
    /**
     * The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
     *
     * Values: pcm16,g711_ulaw,g711_alaw
     */
    @JsonClass(generateAdapter = false)
    enum class OutputAudioFormat(val value: kotlin.String) {
        @Json(name = "pcm16") pcm16("pcm16"),
        @Json(name = "g711_ulaw") g711_ulaw("g711_ulaw"),
        @Json(name = "g711_alaw") g711_alaw("g711_alaw");
    }

}

