
# RealtimeServerEventConversationItemInputAudioTranscriptionDelta

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventId** | **kotlin.String** | The unique ID of the server event. |  |
| **type** | [**inline**](#Type) | The event type, must be &#x60;conversation.item.input_audio_transcription.delta&#x60;. |  |
| **itemId** | **kotlin.String** | The ID of the item. |  |
| **contentIndex** | **kotlin.Int** | The index of the content part in the item&#39;s content array. |  [optional] |
| **delta** | **kotlin.String** | The text delta. |  [optional] |
| **logprobs** | [**kotlin.collections.List&lt;LogProbProperties&gt;**](LogProbProperties.md) | The log probabilities of the transcription. |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | conversation.item.input_audio_transcription.delta |



