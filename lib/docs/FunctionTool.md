
# FunctionTool

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) | The type of the function tool. Always &#x60;function&#x60;.  |  |
| **name** | **kotlin.String** | The name of the function to call.  |  |
| **parameters** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | A JSON schema object describing the parameters of the function.  |  |
| **strict** | **kotlin.Boolean** | Whether to enforce strict parameter validation. Default &#x60;true&#x60;.  |  |
| **description** | **kotlin.String** | A description of the function. Used by the model to determine whether or not to call the function.  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | function |



