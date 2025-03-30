
# RealtimeServerEvent

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventId** | **kotlin.String** | The unique ID of the server event. |  |
| **type** | [**inline**](#Type) | The event type, must be &#x60;conversation.created&#x60;. |  |
| **conversation** | [**RealtimeServerEventConversationCreatedConversation**](RealtimeServerEventConversationCreatedConversation.md) |  |  |
| **previousItemId** | **kotlin.String** | The ID of the preceding item after which the new item will be inserted.  |  |
| **item** | [**RealtimeConversationItem**](RealtimeConversationItem.md) |  |  |
| **itemId** | **kotlin.String** | The ID of the item. |  |
| **contentIndex** | **kotlin.Int** | The index of the content part in the item&#39;s content array. |  |
| **transcript** | **kotlin.String** | The final transcript of the audio. |  |
| **delta** | **kotlin.String** | The text delta. |  |
| **error** | [**RealtimeServerEventErrorError**](RealtimeServerEventErrorError.md) |  |  |
| **audioEndMs** | **kotlin.Int** | Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  &#x60;min_silence_duration_ms&#x60; configured in the Session.  |  |
| **audioStartMs** | **kotlin.Int** | Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  &#x60;prefix_padding_ms&#x60; configured in the Session.  |  |
| **rateLimits** | [**kotlin.collections.List&lt;RealtimeServerEventRateLimitsUpdatedRateLimitsInner&gt;**](RealtimeServerEventRateLimitsUpdatedRateLimitsInner.md) | List of rate limit information. |  |
| **responseId** | **kotlin.String** | The ID of the response. |  |
| **outputIndex** | **kotlin.Int** | The index of the output item in the response. |  |
| **part** | [**RealtimeServerEventResponseContentPartDonePart**](RealtimeServerEventResponseContentPartDonePart.md) |  |  |
| **response** | [**RealtimeResponse**](RealtimeResponse.md) |  |  |
| **callId** | **kotlin.String** | The ID of the function call. |  |
| **arguments** | **kotlin.String** | The final arguments as a JSON string. |  |
| **text** | **kotlin.String** | The final text content. |  |
| **session** | [**RealtimeTranscriptionSessionCreateResponse**](RealtimeTranscriptionSessionCreateResponse.md) |  |  |
| **logprobs** | [**kotlin.collections.List&lt;LogProbProperties&gt;**](LogProbProperties.md) | The log probabilities of the transcription. |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | conversation.created, conversation.item.created, conversation.item.deleted, conversation.item.input_audio_transcription.completed, conversation.item.input_audio_transcription.delta, conversation.item.input_audio_transcription.failed, conversation.item.retrieved, conversation.item.truncated, error, input_audio_buffer.cleared, input_audio_buffer.committed, input_audio_buffer.speech_started, input_audio_buffer.speech_stopped, rate_limits.updated, response.audio.delta, response.audio.done, response.audio_transcript.delta, response.audio_transcript.done, response.content_part.added, response.content_part.done, response.created, response.done, response.function_call_arguments.delta, response.function_call_arguments.done, response.output_item.added, response.output_item.done, response.text.delta, response.text.done, session.created, session.updated, transcription_session.updated |



