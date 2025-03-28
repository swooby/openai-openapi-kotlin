
# RealtimeTranscriptionSessionCreateRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **modalities** | [**inline**](#kotlin.collections.List&lt;Modalities&gt;) | The set of modalities the model can respond with. To disable audio, set this to [\&quot;text\&quot;].  |  [optional] |
| **inputAudioFormat** | [**inline**](#InputAudioFormat) | The format of input audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;. For &#x60;pcm16&#x60;, input audio must be 16-bit PCM at a 24kHz sample rate,  single channel (mono), and little-endian byte order.  |  [optional] |
| **inputAudioTranscription** | [**RealtimeTranscriptionSessionCreateRequestInputAudioTranscription**](RealtimeTranscriptionSessionCreateRequestInputAudioTranscription.md) |  |  [optional] |
| **turnDetection** | [**RealtimeTranscriptionSessionCreateRequestTurnDetection**](RealtimeTranscriptionSessionCreateRequestTurnDetection.md) |  |  [optional] |
| **inputAudioNoiseReduction** | [**RealtimeSessionInputAudioNoiseReduction**](RealtimeSessionInputAudioNoiseReduction.md) |  |  [optional] |
| **include** | **kotlin.collections.List&lt;kotlin.String&gt;** | The set of items to include in the transcription. Current available items are: - &#x60;item.input_audio_transcription.logprobs&#x60;  |  [optional] |


<a id="kotlin.collections.List<Modalities>"></a>
## Enum: modalities
| Name | Value |
| ---- | ----- |
| modalities | text, audio |


<a id="InputAudioFormat"></a>
## Enum: input_audio_format
| Name | Value |
| ---- | ----- |
| inputAudioFormat | pcm16, g711_ulaw, g711_alaw |



