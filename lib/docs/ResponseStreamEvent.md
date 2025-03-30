
# ResponseStreamEvent

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) | The type of the event. Always &#x60;response.audio.delta&#x60;.  |  |
| **delta** | **kotlin.String** | The text delta that was added.  |  |
| **outputIndex** | **kotlin.Int** | The index of the output item that the web search call is associated with.  |  |
| **code** | **kotlin.String** | The error code.  |  |
| **codeInterpreterCall** | [**CodeInterpreterToolCall**](CodeInterpreterToolCall.md) |  |  |
| **response** | [**Response**](Response.md) |  |  |
| **itemId** | **kotlin.String** | Unique ID for the output item associated with the web search call.  |  |
| **contentIndex** | **kotlin.Int** | The index of the content part that the text content is finalized.  |  |
| **part** | [**OutputContent**](OutputContent.md) |  |  |
| **message** | **kotlin.String** | The error message.  |  |
| **&#x60;param&#x60;** | **kotlin.String** | The error parameter.  |  |
| **arguments** | **kotlin.String** | The function-call arguments. |  |
| **item** | [**OutputItem**](OutputItem.md) |  |  |
| **refusal** | **kotlin.String** | The refusal text that is finalized.  |  |
| **annotationIndex** | **kotlin.Int** | The index of the annotation that was added.  |  |
| **&#x60;annotation&#x60;** | [**Annotation**](Annotation.md) |  |  |
| **text** | **kotlin.String** | The text content that is finalized.  |  |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | response.audio.delta, response.audio.done, response.audio.transcript.delta, response.audio.transcript.done, response.code_interpreter_call.code.delta, response.code_interpreter_call.code.done, response.code_interpreter_call.completed, response.code_interpreter_call.in_progress, response.code_interpreter_call.interpreting, response.completed, response.content_part.added, response.content_part.done, response.created, error, response.file_search_call.completed, response.file_search_call.in_progress, response.file_search_call.searching, response.function_call_arguments.delta, response.function_call_arguments.done, response.in_progress, response.failed, response.incomplete, response.output_item.added, response.output_item.done, response.refusal.delta, response.refusal.done, response.output_text.annotation.added, response.output_text.delta, response.output_text.done, response.web_search_call.completed, response.web_search_call.in_progress, response.web_search_call.searching |



