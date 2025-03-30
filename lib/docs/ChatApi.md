# ChatApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createChatCompletion**](ChatApi.md#createChatCompletion) | **POST** /chat/completions | **Starting a new project?** We recommend trying [Responses](/docs/api-reference/responses)  to take advantage of the latest OpenAI platform features. Compare [Chat Completions with Responses](/docs/guides/responses-vs-chat-completions?api-mode&#x3D;responses).  ---  Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning).  |
| [**deleteChatCompletion**](ChatApi.md#deleteChatCompletion) | **DELETE** /chat/completions/{completion_id} | Delete a stored chat completion. Only Chat Completions that have been created with the &#x60;store&#x60; parameter set to &#x60;true&#x60; can be deleted.  |
| [**getChatCompletion**](ChatApi.md#getChatCompletion) | **GET** /chat/completions/{completion_id} | Get a stored chat completion. Only Chat Completions that have been created with the &#x60;store&#x60; parameter set to &#x60;true&#x60; will be returned.  |
| [**getChatCompletionMessages**](ChatApi.md#getChatCompletionMessages) | **GET** /chat/completions/{completion_id}/messages | Get the messages in a stored chat completion. Only Chat Completions that have been created with the &#x60;store&#x60; parameter set to &#x60;true&#x60; will be returned.  |
| [**listChatCompletions**](ChatApi.md#listChatCompletions) | **GET** /chat/completions | List stored Chat Completions. Only Chat Completions that have been stored with the &#x60;store&#x60; parameter set to &#x60;true&#x60; will be returned.  |
| [**updateChatCompletion**](ChatApi.md#updateChatCompletion) | **POST** /chat/completions/{completion_id} | Modify a stored chat completion. Only Chat Completions that have been created with the &#x60;store&#x60; parameter set to &#x60;true&#x60; can be modified. Currently, the only supported modification is to update the &#x60;metadata&#x60; field.  |


<a id="createChatCompletion"></a>
# **createChatCompletion**
> CreateChatCompletionResponse createChatCompletion(createChatCompletionRequest)

**Starting a new project?** We recommend trying [Responses](/docs/api-reference/responses)  to take advantage of the latest OpenAI platform features. Compare [Chat Completions with Responses](/docs/guides/responses-vs-chat-completions?api-mode&#x3D;responses).  ---  Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 

### Example
```kotlin
// Import classes:
//import com.openai.infrastructure.*
//import com.openai.models.*

val apiInstance = ChatApi()
val createChatCompletionRequest : CreateChatCompletionRequest =  // CreateChatCompletionRequest | 
try {
    val result : CreateChatCompletionResponse = apiInstance.createChatCompletion(createChatCompletionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatApi#createChatCompletion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatApi#createChatCompletion")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createChatCompletionRequest** | [**CreateChatCompletionRequest**](CreateChatCompletionRequest.md)|  | |

### Return type

[**CreateChatCompletionResponse**](CreateChatCompletionResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteChatCompletion"></a>
# **deleteChatCompletion**
> ChatCompletionDeleted deleteChatCompletion(completionId)

Delete a stored chat completion. Only Chat Completions that have been created with the &#x60;store&#x60; parameter set to &#x60;true&#x60; can be deleted. 

### Example
```kotlin
// Import classes:
//import com.openai.infrastructure.*
//import com.openai.models.*

val apiInstance = ChatApi()
val completionId : kotlin.String = completionId_example // kotlin.String | The ID of the chat completion to delete.
try {
    val result : ChatCompletionDeleted = apiInstance.deleteChatCompletion(completionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatApi#deleteChatCompletion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatApi#deleteChatCompletion")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **completionId** | **kotlin.String**| The ID of the chat completion to delete. | |

### Return type

[**ChatCompletionDeleted**](ChatCompletionDeleted.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getChatCompletion"></a>
# **getChatCompletion**
> CreateChatCompletionResponse getChatCompletion(completionId)

Get a stored chat completion. Only Chat Completions that have been created with the &#x60;store&#x60; parameter set to &#x60;true&#x60; will be returned. 

### Example
```kotlin
// Import classes:
//import com.openai.infrastructure.*
//import com.openai.models.*

val apiInstance = ChatApi()
val completionId : kotlin.String = completionId_example // kotlin.String | The ID of the chat completion to retrieve.
try {
    val result : CreateChatCompletionResponse = apiInstance.getChatCompletion(completionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatApi#getChatCompletion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatApi#getChatCompletion")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **completionId** | **kotlin.String**| The ID of the chat completion to retrieve. | |

### Return type

[**CreateChatCompletionResponse**](CreateChatCompletionResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getChatCompletionMessages"></a>
# **getChatCompletionMessages**
> ChatCompletionMessageList getChatCompletionMessages(completionId, after, limit, order)

Get the messages in a stored chat completion. Only Chat Completions that have been created with the &#x60;store&#x60; parameter set to &#x60;true&#x60; will be returned. 

### Example
```kotlin
// Import classes:
//import com.openai.infrastructure.*
//import com.openai.models.*

val apiInstance = ChatApi()
val completionId : kotlin.String = completionId_example // kotlin.String | The ID of the chat completion to retrieve messages from.
val after : kotlin.String = after_example // kotlin.String | Identifier for the last message from the previous pagination request.
val limit : kotlin.Int = 56 // kotlin.Int | Number of messages to retrieve.
val order : kotlin.String = order_example // kotlin.String | Sort order for messages by timestamp. Use `asc` for ascending order or `desc` for descending order. Defaults to `asc`.
try {
    val result : ChatCompletionMessageList = apiInstance.getChatCompletionMessages(completionId, after, limit, order)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatApi#getChatCompletionMessages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatApi#getChatCompletionMessages")
    e.printStackTrace()
}
```

### Parameters
| **completionId** | **kotlin.String**| The ID of the chat completion to retrieve messages from. | |
| **after** | **kotlin.String**| Identifier for the last message from the previous pagination request. | [optional] |
| **limit** | **kotlin.Int**| Number of messages to retrieve. | [optional] [default to 20] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **order** | **kotlin.String**| Sort order for messages by timestamp. Use &#x60;asc&#x60; for ascending order or &#x60;desc&#x60; for descending order. Defaults to &#x60;asc&#x60;. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**ChatCompletionMessageList**](ChatCompletionMessageList.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listChatCompletions"></a>
# **listChatCompletions**
> ChatCompletionList listChatCompletions(model, metadata, after, limit, order)

List stored Chat Completions. Only Chat Completions that have been stored with the &#x60;store&#x60; parameter set to &#x60;true&#x60; will be returned. 

### Example
```kotlin
// Import classes:
//import com.openai.infrastructure.*
//import com.openai.models.*

val apiInstance = ChatApi()
val model : kotlin.String = model_example // kotlin.String | The model used to generate the Chat Completions.
val metadata : kotlin.collections.Map<kotlin.String, kotlin.String> =  // kotlin.collections.Map<kotlin.String, kotlin.String> | A list of metadata keys to filter the Chat Completions by. Example:  `metadata[key1]=value1&metadata[key2]=value2` 
val after : kotlin.String = after_example // kotlin.String | Identifier for the last chat completion from the previous pagination request.
val limit : kotlin.Int = 56 // kotlin.Int | Number of Chat Completions to retrieve.
val order : kotlin.String = order_example // kotlin.String | Sort order for Chat Completions by timestamp. Use `asc` for ascending order or `desc` for descending order. Defaults to `asc`.
try {
    val result : ChatCompletionList = apiInstance.listChatCompletions(model, metadata, after, limit, order)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatApi#listChatCompletions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatApi#listChatCompletions")
    e.printStackTrace()
}
```

### Parameters
| **model** | **kotlin.String**| The model used to generate the Chat Completions. | [optional] |
| **metadata** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;**](kotlin.String.md)| A list of metadata keys to filter the Chat Completions by. Example:  &#x60;metadata[key1]&#x3D;value1&amp;metadata[key2]&#x3D;value2&#x60;  | [optional] |
| **after** | **kotlin.String**| Identifier for the last chat completion from the previous pagination request. | [optional] |
| **limit** | **kotlin.Int**| Number of Chat Completions to retrieve. | [optional] [default to 20] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **order** | **kotlin.String**| Sort order for Chat Completions by timestamp. Use &#x60;asc&#x60; for ascending order or &#x60;desc&#x60; for descending order. Defaults to &#x60;asc&#x60;. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**ChatCompletionList**](ChatCompletionList.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateChatCompletion"></a>
# **updateChatCompletion**
> CreateChatCompletionResponse updateChatCompletion(completionId, updateChatCompletionRequest)

Modify a stored chat completion. Only Chat Completions that have been created with the &#x60;store&#x60; parameter set to &#x60;true&#x60; can be modified. Currently, the only supported modification is to update the &#x60;metadata&#x60; field. 

### Example
```kotlin
// Import classes:
//import com.openai.infrastructure.*
//import com.openai.models.*

val apiInstance = ChatApi()
val completionId : kotlin.String = completionId_example // kotlin.String | The ID of the chat completion to update.
val updateChatCompletionRequest : UpdateChatCompletionRequest =  // UpdateChatCompletionRequest | 
try {
    val result : CreateChatCompletionResponse = apiInstance.updateChatCompletion(completionId, updateChatCompletionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatApi#updateChatCompletion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatApi#updateChatCompletion")
    e.printStackTrace()
}
```

### Parameters
| **completionId** | **kotlin.String**| The ID of the chat completion to update. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateChatCompletionRequest** | [**UpdateChatCompletionRequest**](UpdateChatCompletionRequest.md)|  | |

### Return type

[**CreateChatCompletionResponse**](CreateChatCompletionResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

