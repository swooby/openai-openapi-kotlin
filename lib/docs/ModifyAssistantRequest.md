
# ModifyAssistantRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **model** | [**ModifyAssistantRequestModel**](ModifyAssistantRequestModel.md) |  |  [optional] |
| **reasoningEffort** | [**ReasoningEffort**](ReasoningEffort.md) |  |  [optional] |
| **name** | **kotlin.String** | The name of the assistant. The maximum length is 256 characters.  |  [optional] |
| **description** | **kotlin.String** | The description of the assistant. The maximum length is 512 characters.  |  [optional] |
| **instructions** | **kotlin.String** | The system instructions that the assistant uses. The maximum length is 256,000 characters.  |  [optional] |
| **tools** | [**kotlin.collections.List&lt;AssistantObjectToolsInner&gt;**](AssistantObjectToolsInner.md) | A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;.  |  [optional] |
| **toolResources** | [**ModifyAssistantRequestToolResources**](ModifyAssistantRequestToolResources.md) |  |  [optional] |
| **metadata** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format, and querying for objects via API or the dashboard.   Keys are strings with a maximum length of 64 characters. Values are strings with a maximum length of 512 characters.  |  [optional] |
| **temperature** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  |  [optional] |
| **topP** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.  |  [optional] |
| **responseFormat** | [**AssistantObjectResponseFormat**](AssistantObjectResponseFormat.md) |  |  [optional] |



