/**
 * Please note: This class is auto generated by OpenAPI Generator
 * (https://openapi-generator.tech). Do not edit this file manually.
 */
@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport",
)

package com.openai.apis

import com.openai.infrastructure.ApiClient
import com.openai.infrastructure.ApiResponse
import com.openai.infrastructure.ClientError
import com.openai.infrastructure.ClientException
import com.openai.infrastructure.MultiValueMap
import com.openai.infrastructure.RequestConfig
import com.openai.infrastructure.RequestMethod
import com.openai.infrastructure.ResponseType
import com.openai.infrastructure.ServerError
import com.openai.infrastructure.ServerException
import com.openai.infrastructure.Success
import com.openai.models.CreateFineTuningJobRequest
import com.openai.models.FineTuningJob
import com.openai.models.ListFineTuningJobCheckpointsResponse
import com.openai.models.ListFineTuningJobEventsResponse
import com.openai.models.ListPaginatedFineTuningJobsResponse
import java.io.IOException
import okhttp3.Call
import okhttp3.HttpUrl

class FineTuningApi(
    basePath: kotlin.String = defaultBasePath,
    client: Call.Factory = ApiClient.defaultClient,
) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties()
                .getProperty(ApiClient.baseUrlKey, "https://api.openai.com/v1")
        }
    }

    /**
     * Immediately cancel a fine-tune job.
     *
     * @param fineTuningJobId The ID of the fine-tuning job to cancel.
     * @return FineTuningJob
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational
     *   or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(
        IllegalStateException::class,
        IOException::class,
        UnsupportedOperationException::class,
        ClientException::class,
        ServerException::class,
    )
    fun cancelFineTuningJob(fineTuningJobId: kotlin.String): FineTuningJob {
        val localVarResponse =
            cancelFineTuningJobWithHttpInfo(fineTuningJobId = fineTuningJobId)

        return when (localVarResponse.responseType) {
            ResponseType.Success ->
                (localVarResponse as Success<*>).data as FineTuningJob
            ResponseType.Informational ->
                throw UnsupportedOperationException(
                    "Client does not support Informational responses."
                )
            ResponseType.Redirection ->
                throw UnsupportedOperationException(
                    "Client does not support Redirection responses."
                )
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException(
                    "Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}",
                    localVarError.statusCode,
                    localVarResponse,
                )
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException(
                    "Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}",
                    localVarError.statusCode,
                    localVarResponse,
                )
            }
        }
    }

    /**
     * Immediately cancel a fine-tune job.
     *
     * @param fineTuningJobId The ID of the fine-tuning job to cancel.
     * @return ApiResponse<FineTuningJob?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun cancelFineTuningJobWithHttpInfo(
        fineTuningJobId: kotlin.String
    ): ApiResponse<FineTuningJob?> {
        val localVariableConfig =
            cancelFineTuningJobRequestConfig(fineTuningJobId = fineTuningJobId)

        return request<Unit, FineTuningJob>(localVariableConfig)
    }

    /**
     * To obtain the request config of the operation cancelFineTuningJob
     *
     * @param fineTuningJobId The ID of the fine-tuning job to cancel.
     * @return RequestConfig
     */
    fun cancelFineTuningJobRequestConfig(
        fineTuningJobId: kotlin.String
    ): RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path =
                "/fine_tuning/jobs/{fine_tuning_job_id}/cancel"
                    .replace(
                        "{" + "fine_tuning_job_id" + "}",
                        encodeURIComponent(fineTuningJobId.toString()),
                    ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody,
        )
    }

    /**
     * Creates a fine-tuning job which begins the process of creating a new
     * model from a given dataset. Response includes details of the enqueued job
     * including job status and the name of the fine-tuned models once complete.
     * [Learn more about fine-tuning](/docs/guides/fine-tuning)
     *
     * @param createFineTuningJobRequest
     * @return FineTuningJob
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational
     *   or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(
        IllegalStateException::class,
        IOException::class,
        UnsupportedOperationException::class,
        ClientException::class,
        ServerException::class,
    )
    fun createFineTuningJob(
        createFineTuningJobRequest: CreateFineTuningJobRequest
    ): FineTuningJob {
        val localVarResponse =
            createFineTuningJobWithHttpInfo(
                createFineTuningJobRequest = createFineTuningJobRequest
            )

        return when (localVarResponse.responseType) {
            ResponseType.Success ->
                (localVarResponse as Success<*>).data as FineTuningJob
            ResponseType.Informational ->
                throw UnsupportedOperationException(
                    "Client does not support Informational responses."
                )
            ResponseType.Redirection ->
                throw UnsupportedOperationException(
                    "Client does not support Redirection responses."
                )
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException(
                    "Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}",
                    localVarError.statusCode,
                    localVarResponse,
                )
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException(
                    "Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}",
                    localVarError.statusCode,
                    localVarResponse,
                )
            }
        }
    }

    /**
     * Creates a fine-tuning job which begins the process of creating a new
     * model from a given dataset. Response includes details of the enqueued job
     * including job status and the name of the fine-tuned models once complete.
     * [Learn more about fine-tuning](/docs/guides/fine-tuning)
     *
     * @param createFineTuningJobRequest
     * @return ApiResponse<FineTuningJob?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun createFineTuningJobWithHttpInfo(
        createFineTuningJobRequest: CreateFineTuningJobRequest
    ): ApiResponse<FineTuningJob?> {
        val localVariableConfig =
            createFineTuningJobRequestConfig(
                createFineTuningJobRequest = createFineTuningJobRequest
            )

        return request<CreateFineTuningJobRequest, FineTuningJob>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation createFineTuningJob
     *
     * @param createFineTuningJobRequest
     * @return RequestConfig
     */
    fun createFineTuningJobRequestConfig(
        createFineTuningJobRequest: CreateFineTuningJobRequest
    ): RequestConfig<CreateFineTuningJobRequest> {
        val localVariableBody = createFineTuningJobRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/fine_tuning/jobs",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody,
        )
    }

    /**
     * Get status updates for a fine-tuning job.
     *
     * @param fineTuningJobId The ID of the fine-tuning job to get events for.
     * @param after Identifier for the last event from the previous pagination
     *   request. (optional)
     * @param limit Number of events to retrieve. (optional, default to 20)
     * @return ListFineTuningJobEventsResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational
     *   or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(
        IllegalStateException::class,
        IOException::class,
        UnsupportedOperationException::class,
        ClientException::class,
        ServerException::class,
    )
    fun listFineTuningEvents(
        fineTuningJobId: kotlin.String,
        after: kotlin.String? = null,
        limit: kotlin.Int? = 20,
    ): ListFineTuningJobEventsResponse {
        val localVarResponse =
            listFineTuningEventsWithHttpInfo(
                fineTuningJobId = fineTuningJobId,
                after = after,
                limit = limit,
            )

        return when (localVarResponse.responseType) {
            ResponseType.Success ->
                (localVarResponse as Success<*>).data
                    as ListFineTuningJobEventsResponse
            ResponseType.Informational ->
                throw UnsupportedOperationException(
                    "Client does not support Informational responses."
                )
            ResponseType.Redirection ->
                throw UnsupportedOperationException(
                    "Client does not support Redirection responses."
                )
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException(
                    "Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}",
                    localVarError.statusCode,
                    localVarResponse,
                )
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException(
                    "Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}",
                    localVarError.statusCode,
                    localVarResponse,
                )
            }
        }
    }

    /**
     * Get status updates for a fine-tuning job.
     *
     * @param fineTuningJobId The ID of the fine-tuning job to get events for.
     * @param after Identifier for the last event from the previous pagination
     *   request. (optional)
     * @param limit Number of events to retrieve. (optional, default to 20)
     * @return ApiResponse<ListFineTuningJobEventsResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun listFineTuningEventsWithHttpInfo(
        fineTuningJobId: kotlin.String,
        after: kotlin.String?,
        limit: kotlin.Int?,
    ): ApiResponse<ListFineTuningJobEventsResponse?> {
        val localVariableConfig =
            listFineTuningEventsRequestConfig(
                fineTuningJobId = fineTuningJobId,
                after = after,
                limit = limit,
            )

        return request<Unit, ListFineTuningJobEventsResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation listFineTuningEvents
     *
     * @param fineTuningJobId The ID of the fine-tuning job to get events for.
     * @param after Identifier for the last event from the previous pagination
     *   request. (optional)
     * @param limit Number of events to retrieve. (optional, default to 20)
     * @return RequestConfig
     */
    fun listFineTuningEventsRequestConfig(
        fineTuningJobId: kotlin.String,
        after: kotlin.String?,
        limit: kotlin.Int?,
    ): RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap =
            mutableMapOf<
                    kotlin.String,
                    kotlin.collections.List<kotlin.String>,
                >()
                .apply {
                    if (after != null) {
                        put("after", listOf(after.toString()))
                    }
                    if (limit != null) {
                        put("limit", listOf(limit.toString()))
                    }
                }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path =
                "/fine_tuning/jobs/{fine_tuning_job_id}/events"
                    .replace(
                        "{" + "fine_tuning_job_id" + "}",
                        encodeURIComponent(fineTuningJobId.toString()),
                    ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody,
        )
    }

    /**
     * List checkpoints for a fine-tuning job.
     *
     * @param fineTuningJobId The ID of the fine-tuning job to get checkpoints
     *   for.
     * @param after Identifier for the last checkpoint ID from the previous
     *   pagination request. (optional)
     * @param limit Number of checkpoints to retrieve. (optional, default to 10)
     * @return ListFineTuningJobCheckpointsResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational
     *   or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(
        IllegalStateException::class,
        IOException::class,
        UnsupportedOperationException::class,
        ClientException::class,
        ServerException::class,
    )
    fun listFineTuningJobCheckpoints(
        fineTuningJobId: kotlin.String,
        after: kotlin.String? = null,
        limit: kotlin.Int? = 10,
    ): ListFineTuningJobCheckpointsResponse {
        val localVarResponse =
            listFineTuningJobCheckpointsWithHttpInfo(
                fineTuningJobId = fineTuningJobId,
                after = after,
                limit = limit,
            )

        return when (localVarResponse.responseType) {
            ResponseType.Success ->
                (localVarResponse as Success<*>).data
                    as ListFineTuningJobCheckpointsResponse
            ResponseType.Informational ->
                throw UnsupportedOperationException(
                    "Client does not support Informational responses."
                )
            ResponseType.Redirection ->
                throw UnsupportedOperationException(
                    "Client does not support Redirection responses."
                )
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException(
                    "Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}",
                    localVarError.statusCode,
                    localVarResponse,
                )
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException(
                    "Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}",
                    localVarError.statusCode,
                    localVarResponse,
                )
            }
        }
    }

    /**
     * List checkpoints for a fine-tuning job.
     *
     * @param fineTuningJobId The ID of the fine-tuning job to get checkpoints
     *   for.
     * @param after Identifier for the last checkpoint ID from the previous
     *   pagination request. (optional)
     * @param limit Number of checkpoints to retrieve. (optional, default to 10)
     * @return ApiResponse<ListFineTuningJobCheckpointsResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun listFineTuningJobCheckpointsWithHttpInfo(
        fineTuningJobId: kotlin.String,
        after: kotlin.String?,
        limit: kotlin.Int?,
    ): ApiResponse<ListFineTuningJobCheckpointsResponse?> {
        val localVariableConfig =
            listFineTuningJobCheckpointsRequestConfig(
                fineTuningJobId = fineTuningJobId,
                after = after,
                limit = limit,
            )

        return request<Unit, ListFineTuningJobCheckpointsResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation
     * listFineTuningJobCheckpoints
     *
     * @param fineTuningJobId The ID of the fine-tuning job to get checkpoints
     *   for.
     * @param after Identifier for the last checkpoint ID from the previous
     *   pagination request. (optional)
     * @param limit Number of checkpoints to retrieve. (optional, default to 10)
     * @return RequestConfig
     */
    fun listFineTuningJobCheckpointsRequestConfig(
        fineTuningJobId: kotlin.String,
        after: kotlin.String?,
        limit: kotlin.Int?,
    ): RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap =
            mutableMapOf<
                    kotlin.String,
                    kotlin.collections.List<kotlin.String>,
                >()
                .apply {
                    if (after != null) {
                        put("after", listOf(after.toString()))
                    }
                    if (limit != null) {
                        put("limit", listOf(limit.toString()))
                    }
                }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path =
                "/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints"
                    .replace(
                        "{" + "fine_tuning_job_id" + "}",
                        encodeURIComponent(fineTuningJobId.toString()),
                    ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody,
        )
    }

    /**
     * List your organization&#39;s fine-tuning jobs
     *
     * @param after Identifier for the last job from the previous pagination
     *   request. (optional)
     * @param limit Number of fine-tuning jobs to retrieve. (optional, default
     *   to 20)
     * @return ListPaginatedFineTuningJobsResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational
     *   or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(
        IllegalStateException::class,
        IOException::class,
        UnsupportedOperationException::class,
        ClientException::class,
        ServerException::class,
    )
    fun listPaginatedFineTuningJobs(
        after: kotlin.String? = null,
        limit: kotlin.Int? = 20,
    ): ListPaginatedFineTuningJobsResponse {
        val localVarResponse =
            listPaginatedFineTuningJobsWithHttpInfo(
                after = after,
                limit = limit,
            )

        return when (localVarResponse.responseType) {
            ResponseType.Success ->
                (localVarResponse as Success<*>).data
                    as ListPaginatedFineTuningJobsResponse
            ResponseType.Informational ->
                throw UnsupportedOperationException(
                    "Client does not support Informational responses."
                )
            ResponseType.Redirection ->
                throw UnsupportedOperationException(
                    "Client does not support Redirection responses."
                )
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException(
                    "Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}",
                    localVarError.statusCode,
                    localVarResponse,
                )
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException(
                    "Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}",
                    localVarError.statusCode,
                    localVarResponse,
                )
            }
        }
    }

    /**
     * List your organization&#39;s fine-tuning jobs
     *
     * @param after Identifier for the last job from the previous pagination
     *   request. (optional)
     * @param limit Number of fine-tuning jobs to retrieve. (optional, default
     *   to 20)
     * @return ApiResponse<ListPaginatedFineTuningJobsResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun listPaginatedFineTuningJobsWithHttpInfo(
        after: kotlin.String?,
        limit: kotlin.Int?,
    ): ApiResponse<ListPaginatedFineTuningJobsResponse?> {
        val localVariableConfig =
            listPaginatedFineTuningJobsRequestConfig(
                after = after,
                limit = limit,
            )

        return request<Unit, ListPaginatedFineTuningJobsResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation listPaginatedFineTuningJobs
     *
     * @param after Identifier for the last job from the previous pagination
     *   request. (optional)
     * @param limit Number of fine-tuning jobs to retrieve. (optional, default
     *   to 20)
     * @return RequestConfig
     */
    fun listPaginatedFineTuningJobsRequestConfig(
        after: kotlin.String?,
        limit: kotlin.Int?,
    ): RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap =
            mutableMapOf<
                    kotlin.String,
                    kotlin.collections.List<kotlin.String>,
                >()
                .apply {
                    if (after != null) {
                        put("after", listOf(after.toString()))
                    }
                    if (limit != null) {
                        put("limit", listOf(limit.toString()))
                    }
                }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/fine_tuning/jobs",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody,
        )
    }

    /**
     * Get info about a fine-tuning job.
     * [Learn more about fine-tuning](/docs/guides/fine-tuning)
     *
     * @param fineTuningJobId The ID of the fine-tuning job.
     * @return FineTuningJob
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational
     *   or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(
        IllegalStateException::class,
        IOException::class,
        UnsupportedOperationException::class,
        ClientException::class,
        ServerException::class,
    )
    fun retrieveFineTuningJob(fineTuningJobId: kotlin.String): FineTuningJob {
        val localVarResponse =
            retrieveFineTuningJobWithHttpInfo(fineTuningJobId = fineTuningJobId)

        return when (localVarResponse.responseType) {
            ResponseType.Success ->
                (localVarResponse as Success<*>).data as FineTuningJob
            ResponseType.Informational ->
                throw UnsupportedOperationException(
                    "Client does not support Informational responses."
                )
            ResponseType.Redirection ->
                throw UnsupportedOperationException(
                    "Client does not support Redirection responses."
                )
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException(
                    "Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}",
                    localVarError.statusCode,
                    localVarResponse,
                )
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException(
                    "Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}",
                    localVarError.statusCode,
                    localVarResponse,
                )
            }
        }
    }

    /**
     * Get info about a fine-tuning job.
     * [Learn more about fine-tuning](/docs/guides/fine-tuning)
     *
     * @param fineTuningJobId The ID of the fine-tuning job.
     * @return ApiResponse<FineTuningJob?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun retrieveFineTuningJobWithHttpInfo(
        fineTuningJobId: kotlin.String
    ): ApiResponse<FineTuningJob?> {
        val localVariableConfig =
            retrieveFineTuningJobRequestConfig(
                fineTuningJobId = fineTuningJobId
            )

        return request<Unit, FineTuningJob>(localVariableConfig)
    }

    /**
     * To obtain the request config of the operation retrieveFineTuningJob
     *
     * @param fineTuningJobId The ID of the fine-tuning job.
     * @return RequestConfig
     */
    fun retrieveFineTuningJobRequestConfig(
        fineTuningJobId: kotlin.String
    ): RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path =
                "/fine_tuning/jobs/{fine_tuning_job_id}"
                    .replace(
                        "{" + "fine_tuning_job_id" + "}",
                        encodeURIComponent(fineTuningJobId.toString()),
                    ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody,
        )
    }

    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder()
            .scheme("http")
            .host("localhost")
            .addPathSegment(uriComponent)
            .build()
            .encodedPathSegments[0]
}
