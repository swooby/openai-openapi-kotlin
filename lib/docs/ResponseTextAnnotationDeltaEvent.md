
# ResponseTextAnnotationDeltaEvent

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) | The type of the event. Always &#x60;response.output_text.annotation.added&#x60;.  |  |
| **itemId** | **kotlin.String** | The ID of the output item that the text annotation was added to.  |  |
| **outputIndex** | **kotlin.Int** | The index of the output item that the text annotation was added to.  |  |
| **contentIndex** | **kotlin.Int** | The index of the content part that the text annotation was added to.  |  |
| **annotationIndex** | **kotlin.Int** | The index of the annotation that was added.  |  |
| **&#x60;annotation&#x60;** | [**Annotation**](Annotation.md) |  |  |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | response.output_text.annotation.added |



