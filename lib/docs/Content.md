
# Content

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) | The type of the input item. Always &#x60;input_file&#x60;.  |  |
| **text** | **kotlin.String** | The text output from the model.  |  |
| **detail** | [**inline**](#Detail) | The detail level of the image to be sent to the model. One of &#x60;high&#x60;, &#x60;low&#x60;, or &#x60;auto&#x60;. Defaults to &#x60;auto&#x60;.  |  |
| **annotations** | [**kotlin.collections.List&lt;Annotation&gt;**](Annotation.md) | The annotations of the text output.  |  |
| **refusal** | **kotlin.String** | The refusal explanationfrom the model.  |  |
| **imageUrl** | **kotlin.String** | The URL of the image to be sent to the model. A fully qualified URL or base64 encoded image in a data URL.  |  [optional] |
| **fileId** | **kotlin.String** | The ID of the file to be sent to the model.  |  [optional] |
| **filename** | **kotlin.String** | The name of the file to be sent to the model.  |  [optional] |
| **fileData** | **kotlin.String** | The content of the file to be sent to the model.  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | input_file, refusal |


<a id="Detail"></a>
## Enum: detail
| Name | Value |
| ---- | ----- |
| detail | high, low, auto |



