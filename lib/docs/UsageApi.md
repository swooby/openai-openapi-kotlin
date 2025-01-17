# UsageApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**usageAudioSpeeches**](UsageApi.md#usageAudioSpeeches) | **GET** /organization/usage/audio_speeches | Get audio speeches usage details for the organization. |
| [**usageAudioTranscriptions**](UsageApi.md#usageAudioTranscriptions) | **GET** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization. |
| [**usageCodeInterpreterSessions**](UsageApi.md#usageCodeInterpreterSessions) | **GET** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization. |
| [**usageCompletions**](UsageApi.md#usageCompletions) | **GET** /organization/usage/completions | Get completions usage details for the organization. |
| [**usageCosts**](UsageApi.md#usageCosts) | **GET** /organization/costs | Get costs details for the organization. |
| [**usageEmbeddings**](UsageApi.md#usageEmbeddings) | **GET** /organization/usage/embeddings | Get embeddings usage details for the organization. |
| [**usageImages**](UsageApi.md#usageImages) | **GET** /organization/usage/images | Get images usage details for the organization. |
| [**usageModerations**](UsageApi.md#usageModerations) | **GET** /organization/usage/moderations | Get moderations usage details for the organization. |
| [**usageVectorStores**](UsageApi.md#usageVectorStores) | **GET** /organization/usage/vector_stores | Get vector stores usage details for the organization. |


<a id="usageAudioSpeeches"></a>
# **usageAudioSpeeches**
> UsageResponse usageAudioSpeeches(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)

Get audio speeches usage details for the organization.

### Example
```kotlin
// Import classes:
//import com.openai.infrastructure.*
//import com.openai.models.*

val apiInstance = UsageApi()
val startTime : kotlin.Int = 56 // kotlin.Int | Start time (Unix seconds) of the query time range, inclusive.
val endTime : kotlin.Int = 56 // kotlin.Int | End time (Unix seconds) of the query time range, exclusive.
val bucketWidth : kotlin.String = bucketWidth_example // kotlin.String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
val projectIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only usage for these projects.
val userIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only usage for these users.
val apiKeyIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only usage for these API keys.
val models : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only usage for these models.
val groupBy : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
val limit : kotlin.Int = 56 // kotlin.Int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
val page : kotlin.String = page_example // kotlin.String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
try {
    val result : UsageResponse = apiInstance.usageAudioSpeeches(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsageApi#usageAudioSpeeches")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsageApi#usageAudioSpeeches")
    e.printStackTrace()
}
```

### Parameters
| **startTime** | **kotlin.Int**| Start time (Unix seconds) of the query time range, inclusive. | |
| **endTime** | **kotlin.Int**| End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucketWidth** | **kotlin.String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d] [enum: 1m, 1h, 1d] |
| **projectIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only usage for these projects. | [optional] |
| **userIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only usage for these users. | [optional] |
| **apiKeyIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only usage for these API keys. | [optional] |
| **models** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only usage for these models. | [optional] |
| **groupBy** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] [enum: project_id, user_id, api_key_id, model] |
| **limit** | **kotlin.Int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **page** | **kotlin.String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usageAudioTranscriptions"></a>
# **usageAudioTranscriptions**
> UsageResponse usageAudioTranscriptions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)

Get audio transcriptions usage details for the organization.

### Example
```kotlin
// Import classes:
//import com.openai.infrastructure.*
//import com.openai.models.*

val apiInstance = UsageApi()
val startTime : kotlin.Int = 56 // kotlin.Int | Start time (Unix seconds) of the query time range, inclusive.
val endTime : kotlin.Int = 56 // kotlin.Int | End time (Unix seconds) of the query time range, exclusive.
val bucketWidth : kotlin.String = bucketWidth_example // kotlin.String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
val projectIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only usage for these projects.
val userIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only usage for these users.
val apiKeyIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only usage for these API keys.
val models : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only usage for these models.
val groupBy : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
val limit : kotlin.Int = 56 // kotlin.Int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
val page : kotlin.String = page_example // kotlin.String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
try {
    val result : UsageResponse = apiInstance.usageAudioTranscriptions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsageApi#usageAudioTranscriptions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsageApi#usageAudioTranscriptions")
    e.printStackTrace()
}
```

### Parameters
| **startTime** | **kotlin.Int**| Start time (Unix seconds) of the query time range, inclusive. | |
| **endTime** | **kotlin.Int**| End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucketWidth** | **kotlin.String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d] [enum: 1m, 1h, 1d] |
| **projectIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only usage for these projects. | [optional] |
| **userIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only usage for these users. | [optional] |
| **apiKeyIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only usage for these API keys. | [optional] |
| **models** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only usage for these models. | [optional] |
| **groupBy** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] [enum: project_id, user_id, api_key_id, model] |
| **limit** | **kotlin.Int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **page** | **kotlin.String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usageCodeInterpreterSessions"></a>
# **usageCodeInterpreterSessions**
> UsageResponse usageCodeInterpreterSessions(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page)

Get code interpreter sessions usage details for the organization.

### Example
```kotlin
// Import classes:
//import com.openai.infrastructure.*
//import com.openai.models.*

val apiInstance = UsageApi()
val startTime : kotlin.Int = 56 // kotlin.Int | Start time (Unix seconds) of the query time range, inclusive.
val endTime : kotlin.Int = 56 // kotlin.Int | End time (Unix seconds) of the query time range, exclusive.
val bucketWidth : kotlin.String = bucketWidth_example // kotlin.String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
val projectIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only usage for these projects.
val groupBy : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Group the usage data by the specified fields. Support fields include `project_id`.
val limit : kotlin.Int = 56 // kotlin.Int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
val page : kotlin.String = page_example // kotlin.String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
try {
    val result : UsageResponse = apiInstance.usageCodeInterpreterSessions(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsageApi#usageCodeInterpreterSessions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsageApi#usageCodeInterpreterSessions")
    e.printStackTrace()
}
```

### Parameters
| **startTime** | **kotlin.Int**| Start time (Unix seconds) of the query time range, inclusive. | |
| **endTime** | **kotlin.Int**| End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucketWidth** | **kotlin.String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d] [enum: 1m, 1h, 1d] |
| **projectIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only usage for these projects. | [optional] |
| **groupBy** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional] [enum: project_id] |
| **limit** | **kotlin.Int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **page** | **kotlin.String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usageCompletions"></a>
# **usageCompletions**
> UsageResponse usageCompletions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, batch, groupBy, limit, page)

Get completions usage details for the organization.

### Example
```kotlin
// Import classes:
//import com.openai.infrastructure.*
//import com.openai.models.*

val apiInstance = UsageApi()
val startTime : kotlin.Int = 56 // kotlin.Int | Start time (Unix seconds) of the query time range, inclusive.
val endTime : kotlin.Int = 56 // kotlin.Int | End time (Unix seconds) of the query time range, exclusive.
val bucketWidth : kotlin.String = bucketWidth_example // kotlin.String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
val projectIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only usage for these projects.
val userIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only usage for these users.
val apiKeyIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only usage for these API keys.
val models : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only usage for these models.
val batch : kotlin.Boolean = true // kotlin.Boolean | If `true`, return batch jobs only. If `false`, return non-batch jobs only. By default, return both. 
val groupBy : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `batch` or any combination of them.
val limit : kotlin.Int = 56 // kotlin.Int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
val page : kotlin.String = page_example // kotlin.String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
try {
    val result : UsageResponse = apiInstance.usageCompletions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, batch, groupBy, limit, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsageApi#usageCompletions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsageApi#usageCompletions")
    e.printStackTrace()
}
```

### Parameters
| **startTime** | **kotlin.Int**| Start time (Unix seconds) of the query time range, inclusive. | |
| **endTime** | **kotlin.Int**| End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucketWidth** | **kotlin.String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d] [enum: 1m, 1h, 1d] |
| **projectIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only usage for these projects. | [optional] |
| **userIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only usage for these users. | [optional] |
| **apiKeyIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only usage for these API keys. | [optional] |
| **models** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only usage for these models. | [optional] |
| **batch** | **kotlin.Boolean**| If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both.  | [optional] |
| **groupBy** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them. | [optional] [enum: project_id, user_id, api_key_id, model, batch] |
| **limit** | **kotlin.Int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **page** | **kotlin.String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usageCosts"></a>
# **usageCosts**
> UsageResponse usageCosts(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page)

Get costs details for the organization.

### Example
```kotlin
// Import classes:
//import com.openai.infrastructure.*
//import com.openai.models.*

val apiInstance = UsageApi()
val startTime : kotlin.Int = 56 // kotlin.Int | Start time (Unix seconds) of the query time range, inclusive.
val endTime : kotlin.Int = 56 // kotlin.Int | End time (Unix seconds) of the query time range, exclusive.
val bucketWidth : kotlin.String = bucketWidth_example // kotlin.String | Width of each time bucket in response. Currently only `1d` is supported, default to `1d`.
val projectIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only costs for these projects.
val groupBy : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them.
val limit : kotlin.Int = 56 // kotlin.Int | A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. 
val page : kotlin.String = page_example // kotlin.String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
try {
    val result : UsageResponse = apiInstance.usageCosts(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsageApi#usageCosts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsageApi#usageCosts")
    e.printStackTrace()
}
```

### Parameters
| **startTime** | **kotlin.Int**| Start time (Unix seconds) of the query time range, inclusive. | |
| **endTime** | **kotlin.Int**| End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucketWidth** | **kotlin.String**| Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;. | [optional] [default to 1d] [enum: 1d] |
| **projectIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only costs for these projects. | [optional] |
| **groupBy** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them. | [optional] [enum: project_id, line_item] |
| **limit** | **kotlin.Int**| A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  | [optional] [default to 7] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **page** | **kotlin.String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usageEmbeddings"></a>
# **usageEmbeddings**
> UsageResponse usageEmbeddings(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)

Get embeddings usage details for the organization.

### Example
```kotlin
// Import classes:
//import com.openai.infrastructure.*
//import com.openai.models.*

val apiInstance = UsageApi()
val startTime : kotlin.Int = 56 // kotlin.Int | Start time (Unix seconds) of the query time range, inclusive.
val endTime : kotlin.Int = 56 // kotlin.Int | End time (Unix seconds) of the query time range, exclusive.
val bucketWidth : kotlin.String = bucketWidth_example // kotlin.String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
val projectIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only usage for these projects.
val userIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only usage for these users.
val apiKeyIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only usage for these API keys.
val models : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only usage for these models.
val groupBy : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
val limit : kotlin.Int = 56 // kotlin.Int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
val page : kotlin.String = page_example // kotlin.String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
try {
    val result : UsageResponse = apiInstance.usageEmbeddings(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsageApi#usageEmbeddings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsageApi#usageEmbeddings")
    e.printStackTrace()
}
```

### Parameters
| **startTime** | **kotlin.Int**| Start time (Unix seconds) of the query time range, inclusive. | |
| **endTime** | **kotlin.Int**| End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucketWidth** | **kotlin.String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d] [enum: 1m, 1h, 1d] |
| **projectIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only usage for these projects. | [optional] |
| **userIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only usage for these users. | [optional] |
| **apiKeyIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only usage for these API keys. | [optional] |
| **models** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only usage for these models. | [optional] |
| **groupBy** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] [enum: project_id, user_id, api_key_id, model] |
| **limit** | **kotlin.Int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **page** | **kotlin.String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usageImages"></a>
# **usageImages**
> UsageResponse usageImages(startTime, endTime, bucketWidth, sources, sizes, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)

Get images usage details for the organization.

### Example
```kotlin
// Import classes:
//import com.openai.infrastructure.*
//import com.openai.models.*

val apiInstance = UsageApi()
val startTime : kotlin.Int = 56 // kotlin.Int | Start time (Unix seconds) of the query time range, inclusive.
val endTime : kotlin.Int = 56 // kotlin.Int | End time (Unix seconds) of the query time range, exclusive.
val bucketWidth : kotlin.String = bucketWidth_example // kotlin.String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
val sources : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only usages for these sources. Possible values are `image.generation`, `image.edit`, `image.variation` or any combination of them.
val sizes : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only usages for these image sizes. Possible values are `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` or any combination of them.
val projectIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only usage for these projects.
val userIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only usage for these users.
val apiKeyIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only usage for these API keys.
val models : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only usage for these models.
val groupBy : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` or any combination of them.
val limit : kotlin.Int = 56 // kotlin.Int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
val page : kotlin.String = page_example // kotlin.String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
try {
    val result : UsageResponse = apiInstance.usageImages(startTime, endTime, bucketWidth, sources, sizes, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsageApi#usageImages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsageApi#usageImages")
    e.printStackTrace()
}
```

### Parameters
| **startTime** | **kotlin.Int**| Start time (Unix seconds) of the query time range, inclusive. | |
| **endTime** | **kotlin.Int**| End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucketWidth** | **kotlin.String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d] [enum: 1m, 1h, 1d] |
| **sources** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them. | [optional] [enum: image.generation, image.edit, image.variation] |
| **sizes** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them. | [optional] [enum: 256x256, 512x512, 1024x1024, 1792x1792, 1024x1792] |
| **projectIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only usage for these projects. | [optional] |
| **userIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only usage for these users. | [optional] |
| **apiKeyIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only usage for these API keys. | [optional] |
| **models** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only usage for these models. | [optional] |
| **groupBy** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them. | [optional] [enum: project_id, user_id, api_key_id, model, size, source] |
| **limit** | **kotlin.Int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **page** | **kotlin.String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usageModerations"></a>
# **usageModerations**
> UsageResponse usageModerations(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)

Get moderations usage details for the organization.

### Example
```kotlin
// Import classes:
//import com.openai.infrastructure.*
//import com.openai.models.*

val apiInstance = UsageApi()
val startTime : kotlin.Int = 56 // kotlin.Int | Start time (Unix seconds) of the query time range, inclusive.
val endTime : kotlin.Int = 56 // kotlin.Int | End time (Unix seconds) of the query time range, exclusive.
val bucketWidth : kotlin.String = bucketWidth_example // kotlin.String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
val projectIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only usage for these projects.
val userIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only usage for these users.
val apiKeyIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only usage for these API keys.
val models : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only usage for these models.
val groupBy : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
val limit : kotlin.Int = 56 // kotlin.Int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
val page : kotlin.String = page_example // kotlin.String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
try {
    val result : UsageResponse = apiInstance.usageModerations(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsageApi#usageModerations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsageApi#usageModerations")
    e.printStackTrace()
}
```

### Parameters
| **startTime** | **kotlin.Int**| Start time (Unix seconds) of the query time range, inclusive. | |
| **endTime** | **kotlin.Int**| End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucketWidth** | **kotlin.String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d] [enum: 1m, 1h, 1d] |
| **projectIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only usage for these projects. | [optional] |
| **userIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only usage for these users. | [optional] |
| **apiKeyIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only usage for these API keys. | [optional] |
| **models** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only usage for these models. | [optional] |
| **groupBy** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] [enum: project_id, user_id, api_key_id, model] |
| **limit** | **kotlin.Int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **page** | **kotlin.String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usageVectorStores"></a>
# **usageVectorStores**
> UsageResponse usageVectorStores(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page)

Get vector stores usage details for the organization.

### Example
```kotlin
// Import classes:
//import com.openai.infrastructure.*
//import com.openai.models.*

val apiInstance = UsageApi()
val startTime : kotlin.Int = 56 // kotlin.Int | Start time (Unix seconds) of the query time range, inclusive.
val endTime : kotlin.Int = 56 // kotlin.Int | End time (Unix seconds) of the query time range, exclusive.
val bucketWidth : kotlin.String = bucketWidth_example // kotlin.String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
val projectIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only usage for these projects.
val groupBy : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Group the usage data by the specified fields. Support fields include `project_id`.
val limit : kotlin.Int = 56 // kotlin.Int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
val page : kotlin.String = page_example // kotlin.String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
try {
    val result : UsageResponse = apiInstance.usageVectorStores(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsageApi#usageVectorStores")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsageApi#usageVectorStores")
    e.printStackTrace()
}
```

### Parameters
| **startTime** | **kotlin.Int**| Start time (Unix seconds) of the query time range, inclusive. | |
| **endTime** | **kotlin.Int**| End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucketWidth** | **kotlin.String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d] [enum: 1m, 1h, 1d] |
| **projectIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only usage for these projects. | [optional] |
| **groupBy** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional] [enum: project_id] |
| **limit** | **kotlin.Int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **page** | **kotlin.String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

