
# FileSearchTool

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) | The type of the file search tool. Always &#x60;file_search&#x60;.  |  |
| **vectorStoreIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | The IDs of the vector stores to search.  |  |
| **maxNumResults** | **kotlin.Int** | The maximum number of results to return. This number should be between 1  and 50 inclusive.  |  [optional] |
| **filters** | [**FileSearchToolFilters**](FileSearchToolFilters.md) |  |  [optional] |
| **rankingOptions** | [**FileSearchToolRankingOptions**](FileSearchToolRankingOptions.md) |  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | file_search |



