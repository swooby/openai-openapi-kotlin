# ResponsesApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createResponse**](ResponsesApi.md#createResponse) | **POST** /responses | Creates a model response. Provide [text](/docs/guides/text) or [image](/docs/guides/images) inputs to generate [text](/docs/guides/text) or [JSON](/docs/guides/structured-outputs) outputs. Have the model call your own [custom code](/docs/guides/function-calling) or use built-in [tools](/docs/guides/tools) like [web search](/docs/guides/tools-web-search) or [file search](/docs/guides/tools-file-search) to use your own data as input for the model&#39;s response.  |
| [**deleteResponse**](ResponsesApi.md#deleteResponse) | **DELETE** /responses/{response_id} | Deletes a model response with the given ID.  |
| [**getResponse**](ResponsesApi.md#getResponse) | **GET** /responses/{response_id} | Retrieves a model response with the given ID.  |
| [**listInputItems**](ResponsesApi.md#listInputItems) | **GET** /responses/{response_id}/input_items | Returns a list of input items for a given response. |


<a id="createResponse"></a>
# **createResponse**
> Response createResponse(createResponse)

Creates a model response. Provide [text](/docs/guides/text) or [image](/docs/guides/images) inputs to generate [text](/docs/guides/text) or [JSON](/docs/guides/structured-outputs) outputs. Have the model call your own [custom code](/docs/guides/function-calling) or use built-in [tools](/docs/guides/tools) like [web search](/docs/guides/tools-web-search) or [file search](/docs/guides/tools-file-search) to use your own data as input for the model&#39;s response. 

### Example
```kotlin
// Import classes:
//import com.openai.infrastructure.*
//import com.openai.models.*

val apiInstance = ResponsesApi()
val createResponse : CreateResponse =  // CreateResponse | 
try {
    val result : Response = apiInstance.createResponse(createResponse)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResponsesApi#createResponse")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResponsesApi#createResponse")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createResponse** | [**CreateResponse**](CreateResponse.md)|  | |

### Return type

[**Response**](Response.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteResponse"></a>
# **deleteResponse**
> deleteResponse(responseId)

Deletes a model response with the given ID. 

### Example
```kotlin
// Import classes:
//import com.openai.infrastructure.*
//import com.openai.models.*

val apiInstance = ResponsesApi()
val responseId : kotlin.String = resp_677efb5139a88190b512bc3fef8e535d // kotlin.String | The ID of the response to delete.
try {
    apiInstance.deleteResponse(responseId)
} catch (e: ClientException) {
    println("4xx response calling ResponsesApi#deleteResponse")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResponsesApi#deleteResponse")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **responseId** | **kotlin.String**| The ID of the response to delete. | |

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getResponse"></a>
# **getResponse**
> Response getResponse(responseId, include)

Retrieves a model response with the given ID. 

### Example
```kotlin
// Import classes:
//import com.openai.infrastructure.*
//import com.openai.models.*

val apiInstance = ResponsesApi()
val responseId : kotlin.String = resp_677efb5139a88190b512bc3fef8e535d // kotlin.String | The ID of the response to retrieve.
val include : kotlin.collections.List<Includable> =  // kotlin.collections.List<Includable> | Specify additional output data to include in the response. Currently supported values are: - `file_search_call.results`: Include the search results of   the file search tool call. - `message.input_image.image_url`: Include image urls from the input message. - `computer_call_output.output.image_url`: Include image urls from the computer call output. 
try {
    val result : Response = apiInstance.getResponse(responseId, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResponsesApi#getResponse")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResponsesApi#getResponse")
    e.printStackTrace()
}
```

### Parameters
| **responseId** | **kotlin.String**| The ID of the response to retrieve. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | [**kotlin.collections.List&lt;Includable&gt;**](Includable.md)| Specify additional output data to include in the response. Currently supported values are: - &#x60;file_search_call.results&#x60;: Include the search results of   the file search tool call. - &#x60;message.input_image.image_url&#x60;: Include image urls from the input message. - &#x60;computer_call_output.output.image_url&#x60;: Include image urls from the computer call output.  | [optional] |

### Return type

[**Response**](Response.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listInputItems"></a>
# **listInputItems**
> ResponseItemList listInputItems(responseId, limit, order, after, before)

Returns a list of input items for a given response.

### Example
```kotlin
// Import classes:
//import com.openai.infrastructure.*
//import com.openai.models.*

val apiInstance = ResponsesApi()
val responseId : kotlin.String = responseId_example // kotlin.String | The ID of the response to retrieve input items for.
val limit : kotlin.Int = 56 // kotlin.Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
val order : kotlin.String = order_example // kotlin.String | The order to return the input items in. Default is `asc`. - `asc`: Return the input items in ascending order. - `desc`: Return the input items in descending order. 
val after : kotlin.String = after_example // kotlin.String | An item ID to list items after, used in pagination. 
val before : kotlin.String = before_example // kotlin.String | An item ID to list items before, used in pagination. 
try {
    val result : ResponseItemList = apiInstance.listInputItems(responseId, limit, order, after, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResponsesApi#listInputItems")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResponsesApi#listInputItems")
    e.printStackTrace()
}
```

### Parameters
| **responseId** | **kotlin.String**| The ID of the response to retrieve input items for. | |
| **limit** | **kotlin.Int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **order** | **kotlin.String**| The order to return the input items in. Default is &#x60;asc&#x60;. - &#x60;asc&#x60;: Return the input items in ascending order. - &#x60;desc&#x60;: Return the input items in descending order.  | [optional] [enum: asc, desc] |
| **after** | **kotlin.String**| An item ID to list items after, used in pagination.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **before** | **kotlin.String**| An item ID to list items before, used in pagination.  | [optional] |

### Return type

[**ResponseItemList**](ResponseItemList.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

