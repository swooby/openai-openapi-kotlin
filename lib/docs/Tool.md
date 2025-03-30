
# Tool

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) | The type of the file search tool. Always &#x60;file_search&#x60;.  |  |
| **vectorStoreIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | The IDs of the vector stores to search.  |  |
| **name** | **kotlin.String** | The name of the function to call.  |  |
| **parameters** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | A JSON schema object describing the parameters of the function.  |  |
| **strict** | **kotlin.Boolean** | Whether to enforce strict parameter validation. Default &#x60;true&#x60;.  |  |
| **displayWidth** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The width of the computer display.  |  |
| **displayHeight** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The height of the computer display.  |  |
| **environment** | [**inline**](#Environment) | The type of computer environment to control.  |  |
| **maxNumResults** | **kotlin.Int** | The maximum number of results to return. This number should be between 1  and 50 inclusive.  |  [optional] |
| **filters** | [**FileSearchToolFilters**](FileSearchToolFilters.md) |  |  [optional] |
| **rankingOptions** | [**FileSearchToolRankingOptions**](FileSearchToolRankingOptions.md) |  |  [optional] |
| **description** | **kotlin.String** | A description of the function. Used by the model to determine whether or not to call the function.  |  [optional] |
| **userLocation** | [**WebSearchToolUserLocation**](WebSearchToolUserLocation.md) |  |  [optional] |
| **searchContextSize** | [**WebSearchContextSize**](WebSearchContextSize.md) |  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | file_search, function, computer_use_preview, web_search_preview, web_search_preview_2025_03_11 |


<a id="Environment"></a>
## Enum: environment
| Name | Value |
| ---- | ----- |
| environment | mac, windows, ubuntu, browser |



