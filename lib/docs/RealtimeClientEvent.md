
# RealtimeClientEvent

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) | The event type, must be &#x60;conversation.item.create&#x60;. |  |
| **item** | [**RealtimeConversationItem**](RealtimeConversationItem.md) |  |  |
| **itemId** | **kotlin.String** | The ID of the assistant message item to truncate. Only assistant message  items can be truncated.  |  |
| **contentIndex** | **kotlin.Int** | The index of the content part to truncate. Set this to 0. |  |
| **audioEndMs** | **kotlin.Int** | Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error.  |  |
| **audio** | **kotlin.String** | Base64-encoded audio bytes. This must be in the format specified by the  &#x60;input_audio_format&#x60; field in the session configuration.  |  |
| **session** | [**RealtimeTranscriptionSessionCreateRequest**](RealtimeTranscriptionSessionCreateRequest.md) |  |  |
| **eventId** | **kotlin.String** | Optional client-generated ID used to identify this event. |  [optional] |
| **previousItemId** | **kotlin.String** | The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation. If set to &#x60;root&#x60;, the new item will be added to the beginning of the conversation. If set to an existing ID, it allows an item to be inserted mid-conversation. If the ID cannot be found, an error will be returned and the item will not be added.  |  [optional] |
| **responseId** | **kotlin.String** | A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation.  |  [optional] |
| **response** | [**RealtimeResponseCreateParams**](RealtimeResponseCreateParams.md) |  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | conversation.item.create, conversation.item.delete, conversation.item.retrieve, conversation.item.truncate, input_audio_buffer.append, input_audio_buffer.clear, input_audio_buffer.commit, response.cancel, response.create, session.update, transcription_session.update |



