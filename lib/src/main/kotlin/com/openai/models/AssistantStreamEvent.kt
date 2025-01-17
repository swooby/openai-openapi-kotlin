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

import com.openai.models.DoneEvent
import com.openai.models.ErrorEvent
import com.openai.models.MessageStreamEvent
import com.openai.models.RunStepStreamEvent
import com.openai.models.RunStreamEvent
import com.openai.models.ThreadStreamEvent

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents an event emitted when streaming a Run.  Each event in a server-sent events stream has an `event` and `data` property:  ``` event: thread.created data: {\"id\": \"thread_123\", \"object\": \"thread\", ...} ```  We emit events whenever a new object is created, transitions to a new state, or is being streamed in parts (deltas). For example, we emit `thread.run.created` when a new run is created, `thread.run.completed` when a run completes, and so on. When an Assistant chooses to create a message during a run, we emit a `thread.message.created event`, a `thread.message.in_progress` event, many `thread.message.delta` events, and finally a `thread.message.completed` event.  We may add additional events over time, so we recommend handling unknown events gracefully in your code. See the [Assistants API quickstart](/docs/assistants/overview) to learn how to integrate the Assistants API with streaming. 
 *
 * @param event 
 * @param `data` 
 * @param enabled Whether to enable input audio transcription.
 */


data class AssistantStreamEvent (

    @Json(name = "event")
    val event: AssistantStreamEvent.Event,

    @Json(name = "data")
    val `data`: AssistantStreamEvent.`Data`,

    /* Whether to enable input audio transcription. */
    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null

) {

    /**
     * 
     *
     * Values: done
     */
    @JsonClass(generateAdapter = false)
    enum class Event(val value: kotlin.String) {
        @Json(name = "done") done("done");
    }
    /**
     * 
     *
     * Values: Left_Square_BracketDONERight_Square_Bracket
     */
    @JsonClass(generateAdapter = false)
    enum class `Data`(val value: kotlin.String) {
        @Json(name = "[DONE]") Left_Square_BracketDONERight_Square_Bracket("[DONE]");
    }

}
