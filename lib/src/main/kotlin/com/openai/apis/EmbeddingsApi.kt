/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.openai.apis

import java.io.IOException
import okhttp3.Call
import okhttp3.HttpUrl

import com.openai.models.CreateEmbeddingRequest
import com.openai.models.CreateEmbeddingResponse

import com.squareup.moshi.Json

import com.openai.infrastructure.ApiClient
import com.openai.infrastructure.ApiResponse
import com.openai.infrastructure.ClientException
import com.openai.infrastructure.ClientError
import com.openai.infrastructure.ServerException
import com.openai.infrastructure.ServerError
import com.openai.infrastructure.MultiValueMap
import com.openai.infrastructure.PartConfig
import com.openai.infrastructure.RequestConfig
import com.openai.infrastructure.RequestMethod
import com.openai.infrastructure.ResponseType
import com.openai.infrastructure.Success
import com.openai.infrastructure.toMultiValue

class EmbeddingsApi(basePath: kotlin.String = defaultBasePath, client: Call.Factory = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://api.openai.com/v1")
        }
    }

    /**
     * Creates an embedding vector representing the input text.
     * 
     * @param createEmbeddingRequest 
     * @return CreateEmbeddingResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createEmbedding(createEmbeddingRequest: CreateEmbeddingRequest) : CreateEmbeddingResponse {
        val localVarResponse = createEmbeddingWithHttpInfo(createEmbeddingRequest = createEmbeddingRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CreateEmbeddingResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Creates an embedding vector representing the input text.
     * 
     * @param createEmbeddingRequest 
     * @return ApiResponse<CreateEmbeddingResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun createEmbeddingWithHttpInfo(createEmbeddingRequest: CreateEmbeddingRequest) : ApiResponse<CreateEmbeddingResponse?> {
        val localVariableConfig = createEmbeddingRequestConfig(createEmbeddingRequest = createEmbeddingRequest)

        return request<CreateEmbeddingRequest, CreateEmbeddingResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation createEmbedding
     *
     * @param createEmbeddingRequest 
     * @return RequestConfig
     */
    fun createEmbeddingRequestConfig(createEmbeddingRequest: CreateEmbeddingRequest) : RequestConfig<CreateEmbeddingRequest> {
        val localVariableBody = createEmbeddingRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/embeddings",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}