
# CreateSpeechRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **model** | [**CreateSpeechRequestModel**](CreateSpeechRequestModel.md) |  |  |
| **input** | **kotlin.String** | The text to generate audio for. The maximum length is 4096 characters. |  |
| **voice** | [**VoiceIdsShared**](VoiceIdsShared.md) |  |  |
| **instructions** | **kotlin.String** | Control the voice of your generated audio with additional instructions. Does not work with &#x60;tts-1&#x60; or &#x60;tts-1-hd&#x60;. |  [optional] |
| **responseFormat** | [**inline**](#ResponseFormat) | The format to audio in. Supported formats are &#x60;mp3&#x60;, &#x60;opus&#x60;, &#x60;aac&#x60;, &#x60;flac&#x60;, &#x60;wav&#x60;, and &#x60;pcm&#x60;. |  [optional] |
| **speed** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The speed of the generated audio. Select a value from &#x60;0.25&#x60; to &#x60;4.0&#x60;. &#x60;1.0&#x60; is the default. |  [optional] |


<a id="ResponseFormat"></a>
## Enum: response_format
| Name | Value |
| ---- | ----- |
| responseFormat | mp3, opus, aac, flac, wav, pcm |



