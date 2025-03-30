# FineTuningApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**cancelFineTuningJob**](FineTuningApi.md#cancelFineTuningJob) | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job.  |
| [**createFineTuningCheckpointPermission**](FineTuningApi.md#createFineTuningCheckpointPermission) | **POST** /fine_tuning/checkpoints/{permission_id}/permissions | **NOTE:** Calling this endpoint requires an [admin API key](../admin-api-keys).  This enables organization owners to share fine-tuned models with other projects in their organization.  |
| [**createFineTuningJob**](FineTuningApi.md#createFineTuningJob) | **POST** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning)  |
| [**deleteFineTuningCheckpointPermission**](FineTuningApi.md#deleteFineTuningCheckpointPermission) | **DELETE** /fine_tuning/checkpoints/{permission_id}/permissions | **NOTE:** This endpoint requires an [admin API key](../admin-api-keys).  Organization owners can use this endpoint to delete a permission for a fine-tuned model checkpoint.  |
| [**listFineTuningCheckpointPermissions**](FineTuningApi.md#listFineTuningCheckpointPermissions) | **GET** /fine_tuning/checkpoints/{permission_id}/permissions | **NOTE:** This endpoint requires an [admin API key](../admin-api-keys).  Organization owners can use this endpoint to view all permissions for a fine-tuned model checkpoint.  |
| [**listFineTuningEvents**](FineTuningApi.md#listFineTuningEvents) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job.  |
| [**listFineTuningJobCheckpoints**](FineTuningApi.md#listFineTuningJobCheckpoints) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job.  |
| [**listPaginatedFineTuningJobs**](FineTuningApi.md#listPaginatedFineTuningJobs) | **GET** /fine_tuning/jobs | List your organization&#39;s fine-tuning jobs  |
| [**retrieveFineTuningJob**](FineTuningApi.md#retrieveFineTuningJob) | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning)  |


<a id="cancelFineTuningJob"></a>
# **cancelFineTuningJob**
> FineTuningJob cancelFineTuningJob(fineTuningJobId)

Immediately cancel a fine-tune job. 

### Example
```kotlin
// Import classes:
//import com.openai.infrastructure.*
//import com.openai.models.*

val apiInstance = FineTuningApi()
val fineTuningJobId : kotlin.String = ft-AF1WoRqd3aJAHsqc9NY7iL8F // kotlin.String | The ID of the fine-tuning job to cancel. 
try {
    val result : FineTuningJob = apiInstance.cancelFineTuningJob(fineTuningJobId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FineTuningApi#cancelFineTuningJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FineTuningApi#cancelFineTuningJob")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fineTuningJobId** | **kotlin.String**| The ID of the fine-tuning job to cancel.  | |

### Return type

[**FineTuningJob**](FineTuningJob.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="createFineTuningCheckpointPermission"></a>
# **createFineTuningCheckpointPermission**
> ListFineTuningCheckpointPermissionResponse createFineTuningCheckpointPermission(permissionId, createFineTuningCheckpointPermissionRequest)

**NOTE:** Calling this endpoint requires an [admin API key](../admin-api-keys).  This enables organization owners to share fine-tuned models with other projects in their organization. 

### Example
```kotlin
// Import classes:
//import com.openai.infrastructure.*
//import com.openai.models.*

val apiInstance = FineTuningApi()
val permissionId : kotlin.String = ft:gpt-4o-mini-2024-07-18:org:weather:B7R9VjQd // kotlin.String | The ID of the fine-tuned model checkpoint to create a permission for. 
val createFineTuningCheckpointPermissionRequest : CreateFineTuningCheckpointPermissionRequest =  // CreateFineTuningCheckpointPermissionRequest | 
try {
    val result : ListFineTuningCheckpointPermissionResponse = apiInstance.createFineTuningCheckpointPermission(permissionId, createFineTuningCheckpointPermissionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FineTuningApi#createFineTuningCheckpointPermission")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FineTuningApi#createFineTuningCheckpointPermission")
    e.printStackTrace()
}
```

### Parameters
| **permissionId** | **kotlin.String**| The ID of the fine-tuned model checkpoint to create a permission for.  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createFineTuningCheckpointPermissionRequest** | [**CreateFineTuningCheckpointPermissionRequest**](CreateFineTuningCheckpointPermissionRequest.md)|  | |

### Return type

[**ListFineTuningCheckpointPermissionResponse**](ListFineTuningCheckpointPermissionResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createFineTuningJob"></a>
# **createFineTuningJob**
> FineTuningJob createFineTuningJob(createFineTuningJobRequest)

Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Example
```kotlin
// Import classes:
//import com.openai.infrastructure.*
//import com.openai.models.*

val apiInstance = FineTuningApi()
val createFineTuningJobRequest : CreateFineTuningJobRequest =  // CreateFineTuningJobRequest | 
try {
    val result : FineTuningJob = apiInstance.createFineTuningJob(createFineTuningJobRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FineTuningApi#createFineTuningJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FineTuningApi#createFineTuningJob")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createFineTuningJobRequest** | [**CreateFineTuningJobRequest**](CreateFineTuningJobRequest.md)|  | |

### Return type

[**FineTuningJob**](FineTuningJob.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteFineTuningCheckpointPermission"></a>
# **deleteFineTuningCheckpointPermission**
> DeleteFineTuningCheckpointPermissionResponse deleteFineTuningCheckpointPermission(permissionId)

**NOTE:** This endpoint requires an [admin API key](../admin-api-keys).  Organization owners can use this endpoint to delete a permission for a fine-tuned model checkpoint. 

### Example
```kotlin
// Import classes:
//import com.openai.infrastructure.*
//import com.openai.models.*

val apiInstance = FineTuningApi()
val permissionId : kotlin.String = cp_zc4Q7MP6XxulcVzj4MZdwsAB // kotlin.String | The ID of the fine-tuned model checkpoint permission to delete. 
try {
    val result : DeleteFineTuningCheckpointPermissionResponse = apiInstance.deleteFineTuningCheckpointPermission(permissionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FineTuningApi#deleteFineTuningCheckpointPermission")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FineTuningApi#deleteFineTuningCheckpointPermission")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **permissionId** | **kotlin.String**| The ID of the fine-tuned model checkpoint permission to delete.  | |

### Return type

[**DeleteFineTuningCheckpointPermissionResponse**](DeleteFineTuningCheckpointPermissionResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listFineTuningCheckpointPermissions"></a>
# **listFineTuningCheckpointPermissions**
> ListFineTuningCheckpointPermissionResponse listFineTuningCheckpointPermissions(permissionId, projectId, after, limit, order)

**NOTE:** This endpoint requires an [admin API key](../admin-api-keys).  Organization owners can use this endpoint to view all permissions for a fine-tuned model checkpoint. 

### Example
```kotlin
// Import classes:
//import com.openai.infrastructure.*
//import com.openai.models.*

val apiInstance = FineTuningApi()
val permissionId : kotlin.String = ft-AF1WoRqd3aJAHsqc9NY7iL8F // kotlin.String | The ID of the fine-tuned model checkpoint to get permissions for. 
val projectId : kotlin.String = projectId_example // kotlin.String | The ID of the project to get permissions for.
val after : kotlin.String = after_example // kotlin.String | Identifier for the last permission ID from the previous pagination request.
val limit : kotlin.Int = 56 // kotlin.Int | Number of permissions to retrieve.
val order : kotlin.String = order_example // kotlin.String | The order in which to retrieve permissions.
try {
    val result : ListFineTuningCheckpointPermissionResponse = apiInstance.listFineTuningCheckpointPermissions(permissionId, projectId, after, limit, order)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FineTuningApi#listFineTuningCheckpointPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FineTuningApi#listFineTuningCheckpointPermissions")
    e.printStackTrace()
}
```

### Parameters
| **permissionId** | **kotlin.String**| The ID of the fine-tuned model checkpoint to get permissions for.  | |
| **projectId** | **kotlin.String**| The ID of the project to get permissions for. | [optional] |
| **after** | **kotlin.String**| Identifier for the last permission ID from the previous pagination request. | [optional] |
| **limit** | **kotlin.Int**| Number of permissions to retrieve. | [optional] [default to 10] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **order** | **kotlin.String**| The order in which to retrieve permissions. | [optional] [default to descending] [enum: ascending, descending] |

### Return type

[**ListFineTuningCheckpointPermissionResponse**](ListFineTuningCheckpointPermissionResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listFineTuningEvents"></a>
# **listFineTuningEvents**
> ListFineTuningJobEventsResponse listFineTuningEvents(fineTuningJobId, after, limit)

Get status updates for a fine-tuning job. 

### Example
```kotlin
// Import classes:
//import com.openai.infrastructure.*
//import com.openai.models.*

val apiInstance = FineTuningApi()
val fineTuningJobId : kotlin.String = ft-AF1WoRqd3aJAHsqc9NY7iL8F // kotlin.String | The ID of the fine-tuning job to get events for. 
val after : kotlin.String = after_example // kotlin.String | Identifier for the last event from the previous pagination request.
val limit : kotlin.Int = 56 // kotlin.Int | Number of events to retrieve.
try {
    val result : ListFineTuningJobEventsResponse = apiInstance.listFineTuningEvents(fineTuningJobId, after, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FineTuningApi#listFineTuningEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FineTuningApi#listFineTuningEvents")
    e.printStackTrace()
}
```

### Parameters
| **fineTuningJobId** | **kotlin.String**| The ID of the fine-tuning job to get events for.  | |
| **after** | **kotlin.String**| Identifier for the last event from the previous pagination request. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Number of events to retrieve. | [optional] [default to 20] |

### Return type

[**ListFineTuningJobEventsResponse**](ListFineTuningJobEventsResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listFineTuningJobCheckpoints"></a>
# **listFineTuningJobCheckpoints**
> ListFineTuningJobCheckpointsResponse listFineTuningJobCheckpoints(fineTuningJobId, after, limit)

List checkpoints for a fine-tuning job. 

### Example
```kotlin
// Import classes:
//import com.openai.infrastructure.*
//import com.openai.models.*

val apiInstance = FineTuningApi()
val fineTuningJobId : kotlin.String = ft-AF1WoRqd3aJAHsqc9NY7iL8F // kotlin.String | The ID of the fine-tuning job to get checkpoints for. 
val after : kotlin.String = after_example // kotlin.String | Identifier for the last checkpoint ID from the previous pagination request.
val limit : kotlin.Int = 56 // kotlin.Int | Number of checkpoints to retrieve.
try {
    val result : ListFineTuningJobCheckpointsResponse = apiInstance.listFineTuningJobCheckpoints(fineTuningJobId, after, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FineTuningApi#listFineTuningJobCheckpoints")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FineTuningApi#listFineTuningJobCheckpoints")
    e.printStackTrace()
}
```

### Parameters
| **fineTuningJobId** | **kotlin.String**| The ID of the fine-tuning job to get checkpoints for.  | |
| **after** | **kotlin.String**| Identifier for the last checkpoint ID from the previous pagination request. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Number of checkpoints to retrieve. | [optional] [default to 10] |

### Return type

[**ListFineTuningJobCheckpointsResponse**](ListFineTuningJobCheckpointsResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listPaginatedFineTuningJobs"></a>
# **listPaginatedFineTuningJobs**
> ListPaginatedFineTuningJobsResponse listPaginatedFineTuningJobs(after, limit, metadata)

List your organization&#39;s fine-tuning jobs 

### Example
```kotlin
// Import classes:
//import com.openai.infrastructure.*
//import com.openai.models.*

val apiInstance = FineTuningApi()
val after : kotlin.String = after_example // kotlin.String | Identifier for the last job from the previous pagination request.
val limit : kotlin.Int = 56 // kotlin.Int | Number of fine-tuning jobs to retrieve.
val metadata : kotlin.collections.Map<kotlin.String, kotlin.String> =  // kotlin.collections.Map<kotlin.String, kotlin.String> | Optional metadata filter. To filter, use the syntax `metadata[k]=v`. Alternatively, set `metadata=null` to indicate no metadata. 
try {
    val result : ListPaginatedFineTuningJobsResponse = apiInstance.listPaginatedFineTuningJobs(after, limit, metadata)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FineTuningApi#listPaginatedFineTuningJobs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FineTuningApi#listPaginatedFineTuningJobs")
    e.printStackTrace()
}
```

### Parameters
| **after** | **kotlin.String**| Identifier for the last job from the previous pagination request. | [optional] |
| **limit** | **kotlin.Int**| Number of fine-tuning jobs to retrieve. | [optional] [default to 20] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **metadata** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;**](kotlin.String.md)| Optional metadata filter. To filter, use the syntax &#x60;metadata[k]&#x3D;v&#x60;. Alternatively, set &#x60;metadata&#x3D;null&#x60; to indicate no metadata.  | [optional] |

### Return type

[**ListPaginatedFineTuningJobsResponse**](ListPaginatedFineTuningJobsResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="retrieveFineTuningJob"></a>
# **retrieveFineTuningJob**
> FineTuningJob retrieveFineTuningJob(fineTuningJobId)

Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Example
```kotlin
// Import classes:
//import com.openai.infrastructure.*
//import com.openai.models.*

val apiInstance = FineTuningApi()
val fineTuningJobId : kotlin.String = ft-AF1WoRqd3aJAHsqc9NY7iL8F // kotlin.String | The ID of the fine-tuning job. 
try {
    val result : FineTuningJob = apiInstance.retrieveFineTuningJob(fineTuningJobId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FineTuningApi#retrieveFineTuningJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FineTuningApi#retrieveFineTuningJob")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fineTuningJobId** | **kotlin.String**| The ID of the fine-tuning job.  | |

### Return type

[**FineTuningJob**](FineTuningJob.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

