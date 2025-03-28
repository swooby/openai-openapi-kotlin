
# CreateTranscription200Response

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **text** | **kotlin.String** | The transcribed text. |  |
| **language** | **kotlin.String** | The language of the input audio. |  |
| **duration** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The duration of the input audio. |  |
| **logprobs** | [**kotlin.collections.List&lt;LogProbProperties&gt;**](LogProbProperties.md) | The log probabilities of the tokens in the transcription. Only returned with the models &#x60;gpt-4o-transcribe&#x60; and &#x60;gpt-4o-mini-transcribe&#x60; if &#x60;logprobs&#x60; is added to the &#x60;include&#x60; array.  |  [optional] |
| **words** | [**kotlin.collections.List&lt;TranscriptionWord&gt;**](TranscriptionWord.md) | Extracted words and their corresponding timestamps. |  [optional] |
| **segments** | [**kotlin.collections.List&lt;TranscriptionSegment&gt;**](TranscriptionSegment.md) | Segments of the transcribed text and their corresponding details. |  [optional] |



