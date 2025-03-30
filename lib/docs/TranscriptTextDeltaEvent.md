
# TranscriptTextDeltaEvent

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) | The type of the event. Always &#x60;transcript.text.delta&#x60;.  |  |
| **delta** | **kotlin.String** | The text delta that was additionally transcribed.  |  |
| **logprobs** | [**kotlin.collections.List&lt;LogProbProperties&gt;**](LogProbProperties.md) | The log probabilities of the delta. Only included if you [create a transcription](/docs/api-reference/audio/create-transcription) with the &#x60;include[]&#x60; parameter set to &#x60;logprobs&#x60;.  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | transcript.text.delta |



