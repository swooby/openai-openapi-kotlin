
# RealtimeTranscriptionSessionCreateResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **clientSecret** | [**RealtimeTranscriptionSessionCreateResponseClientSecret**](RealtimeTranscriptionSessionCreateResponseClientSecret.md) |  |  |
| **modalities** | [**inline**](#kotlin.collections.List&lt;Modalities&gt;) | The set of modalities the model can respond with. To disable audio, set this to [\&quot;text\&quot;].  |  [optional] |
| **inputAudioFormat** | **kotlin.String** | The format of input audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;.  |  [optional] |
| **inputAudioTranscription** | [**RealtimeTranscriptionSessionCreateResponseInputAudioTranscription**](RealtimeTranscriptionSessionCreateResponseInputAudioTranscription.md) |  |  [optional] |
| **turnDetection** | [**RealtimeSessionCreateResponseTurnDetection**](RealtimeSessionCreateResponseTurnDetection.md) |  |  [optional] |


<a id="kotlin.collections.List<Modalities>"></a>
## Enum: modalities
| Name | Value |
| ---- | ----- |
| modalities | text, audio |



