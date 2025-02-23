
# RealtimeSession

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | Unique identifier for the session object.  |  [optional] |
| **modalities** | [**inline**](#kotlin.collections.List&lt;Modalities&gt;) | The set of modalities the model can respond with. To disable audio, set this to [\&quot;text\&quot;].  |  [optional] |
| **model** | [**RealtimeSessionModel**](RealtimeSessionModel.md) |  |  [optional] |
| **instructions** | **kotlin.String** | The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \&quot;be extremely succinct\&quot;, \&quot;act friendly\&quot;, \&quot;here are examples of good  responses\&quot;) and on audio behavior (e.g. \&quot;talk quickly\&quot;, \&quot;inject emotion  into your voice\&quot;, \&quot;laugh frequently\&quot;). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the &#x60;session.created&#x60; event at the  start of the session.  |  [optional] |
| **voice** | [**inline**](#Voice) | The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are &#x60;alloy&#x60;, &#x60;ash&#x60;, &#x60;ballad&#x60;, &#x60;coral&#x60;, &#x60;echo&#x60; &#x60;sage&#x60;,  &#x60;shimmer&#x60; and &#x60;verse&#x60;.  |  [optional] |
| **inputAudioFormat** | [**inline**](#InputAudioFormat) | The format of input audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;. For &#x60;pcm16&#x60;, input audio must be 16-bit PCM at a 24kHz sample rate,  single channel (mono), and little-endian byte order.  |  [optional] |
| **outputAudioFormat** | [**inline**](#OutputAudioFormat) | The format of output audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;. For &#x60;pcm16&#x60;, output audio is sampled at a rate of 24kHz.  |  [optional] |
| **inputAudioTranscription** | [**RealtimeSessionInputAudioTranscription**](RealtimeSessionInputAudioTranscription.md) |  |  [optional] |
| **turnDetection** | [**RealtimeSessionTurnDetection**](RealtimeSessionTurnDetection.md) |  |  [optional] |
| **tools** | [**kotlin.collections.List&lt;RealtimeResponseCreateParamsToolsInner&gt;**](RealtimeResponseCreateParamsToolsInner.md) | Tools (functions) available to the model. |  [optional] |
| **toolChoice** | **kotlin.String** | How the model chooses tools. Options are &#x60;auto&#x60;, &#x60;none&#x60;, &#x60;required&#x60;, or  specify a function.  |  [optional] |
| **temperature** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8.  |  [optional] |
| **maxResponseOutputTokens** | [**RealtimeResponseCreateParamsMaxResponseOutputTokens**](RealtimeResponseCreateParamsMaxResponseOutputTokens.md) |  |  [optional] |


<a id="kotlin.collections.List<Modalities>"></a>
## Enum: modalities
| Name | Value |
| ---- | ----- |
| modalities | text, audio |


<a id="Voice"></a>
## Enum: voice
| Name | Value |
| ---- | ----- |
| voice | alloy, ash, ballad, coral, echo, sage, shimmer, verse |


<a id="InputAudioFormat"></a>
## Enum: input_audio_format
| Name | Value |
| ---- | ----- |
| inputAudioFormat | pcm16, g711_ulaw, g711_alaw |


<a id="OutputAudioFormat"></a>
## Enum: output_audio_format
| Name | Value |
| ---- | ----- |
| outputAudioFormat | pcm16, g711_ulaw, g711_alaw |



