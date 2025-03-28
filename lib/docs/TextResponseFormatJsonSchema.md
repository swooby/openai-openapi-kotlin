
# TextResponseFormatJsonSchema

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) | The type of response format being defined. Always &#x60;json_schema&#x60;. |  |
| **schema** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | The schema for the response format, described as a JSON Schema object. Learn how to build JSON schemas [here](https://json-schema.org/).  |  |
| **description** | **kotlin.String** | A description of what the response format is for, used by the model to determine how to respond in the format.  |  [optional] |
| **name** | **kotlin.String** | The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.  |  [optional] |
| **strict** | **kotlin.Boolean** | Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the &#x60;schema&#x60; field. Only a subset of JSON Schema is supported when &#x60;strict&#x60; is &#x60;true&#x60;. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs).  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | json_schema |



