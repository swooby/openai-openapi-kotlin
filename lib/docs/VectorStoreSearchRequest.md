
# VectorStoreSearchRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **query** | [**VectorStoreSearchRequestQuery**](VectorStoreSearchRequestQuery.md) |  |  |
| **rewriteQuery** | **kotlin.Boolean** | Whether to rewrite the natural language query for vector search. |  [optional] |
| **maxNumResults** | **kotlin.Int** | The maximum number of results to return. This number should be between 1 and 50 inclusive. |  [optional] |
| **filters** | [**FileSearchToolFilters**](FileSearchToolFilters.md) |  |  [optional] |
| **rankingOptions** | [**VectorStoreSearchRequestRankingOptions**](VectorStoreSearchRequestRankingOptions.md) |  |  [optional] |



