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

import com.openai.models.AdminApiKey
import com.openai.models.AdminApiKeysCreateRequest
import com.openai.models.AdminApiKeysDelete200Response
import com.openai.models.ApiKeyList

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

class DefaultApi(basePath: kotlin.String = defaultBasePath, client: Call.Factory = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://api.openai.com/v1")
        }
    }

    /**
     * Create an organization admin API key
     * Create a new admin-level API key for the organization.
     * @param adminApiKeysCreateRequest 
     * @return AdminApiKey
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun adminApiKeysCreate(adminApiKeysCreateRequest: AdminApiKeysCreateRequest) : AdminApiKey {
        val localVarResponse = adminApiKeysCreateWithHttpInfo(adminApiKeysCreateRequest = adminApiKeysCreateRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as AdminApiKey
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
     * Create an organization admin API key
     * Create a new admin-level API key for the organization.
     * @param adminApiKeysCreateRequest 
     * @return ApiResponse<AdminApiKey?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun adminApiKeysCreateWithHttpInfo(adminApiKeysCreateRequest: AdminApiKeysCreateRequest) : ApiResponse<AdminApiKey?> {
        val localVariableConfig = adminApiKeysCreateRequestConfig(adminApiKeysCreateRequest = adminApiKeysCreateRequest)

        return request<AdminApiKeysCreateRequest, AdminApiKey>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation adminApiKeysCreate
     *
     * @param adminApiKeysCreateRequest 
     * @return RequestConfig
     */
    fun adminApiKeysCreateRequestConfig(adminApiKeysCreateRequest: AdminApiKeysCreateRequest) : RequestConfig<AdminApiKeysCreateRequest> {
        val localVariableBody = adminApiKeysCreateRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/organization/admin_api_keys",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Delete an organization admin API key
     * Delete the specified admin API key.
     * @param keyId 
     * @return AdminApiKeysDelete200Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun adminApiKeysDelete(keyId: kotlin.String) : AdminApiKeysDelete200Response {
        val localVarResponse = adminApiKeysDeleteWithHttpInfo(keyId = keyId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as AdminApiKeysDelete200Response
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
     * Delete an organization admin API key
     * Delete the specified admin API key.
     * @param keyId 
     * @return ApiResponse<AdminApiKeysDelete200Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun adminApiKeysDeleteWithHttpInfo(keyId: kotlin.String) : ApiResponse<AdminApiKeysDelete200Response?> {
        val localVariableConfig = adminApiKeysDeleteRequestConfig(keyId = keyId)

        return request<Unit, AdminApiKeysDelete200Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation adminApiKeysDelete
     *
     * @param keyId 
     * @return RequestConfig
     */
    fun adminApiKeysDeleteRequestConfig(keyId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/organization/admin_api_keys/{key_id}".replace("{"+"key_id"+"}", encodeURIComponent(keyId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Retrieve a single organization API key
     * Get details for a specific organization API key by its ID.
     * @param keyId 
     * @return AdminApiKey
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun adminApiKeysGet(keyId: kotlin.String) : AdminApiKey {
        val localVarResponse = adminApiKeysGetWithHttpInfo(keyId = keyId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as AdminApiKey
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
     * Retrieve a single organization API key
     * Get details for a specific organization API key by its ID.
     * @param keyId 
     * @return ApiResponse<AdminApiKey?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun adminApiKeysGetWithHttpInfo(keyId: kotlin.String) : ApiResponse<AdminApiKey?> {
        val localVariableConfig = adminApiKeysGetRequestConfig(keyId = keyId)

        return request<Unit, AdminApiKey>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation adminApiKeysGet
     *
     * @param keyId 
     * @return RequestConfig
     */
    fun adminApiKeysGetRequestConfig(keyId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/organization/admin_api_keys/{key_id}".replace("{"+"key_id"+"}", encodeURIComponent(keyId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter order
     */
     enum class OrderAdminApiKeysList(val value: kotlin.String) {
         @Json(name = "asc") asc("asc"),
         @Json(name = "desc") desc("desc");

        /**
         * Override [toString()] to avoid using the enum variable name as the value, and instead use
         * the actual value defined in the API spec file.
         *
         * This solves a problem when the variable name and its value are different, and ensures that
         * the client sends the correct enum values to the server always.
         */
        override fun toString(): kotlin.String = "$value"
     }

    /**
     * List organization API keys
     * Retrieve a paginated list of organization admin API keys.
     * @param after  (optional)
     * @param order  (optional, default to asc)
     * @param limit  (optional, default to 20)
     * @return ApiKeyList
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun adminApiKeysList(after: kotlin.String? = null, order: OrderAdminApiKeysList? = OrderAdminApiKeysList.asc, limit: kotlin.Int? = 20) : ApiKeyList {
        val localVarResponse = adminApiKeysListWithHttpInfo(after = after, order = order, limit = limit)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ApiKeyList
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
     * List organization API keys
     * Retrieve a paginated list of organization admin API keys.
     * @param after  (optional)
     * @param order  (optional, default to asc)
     * @param limit  (optional, default to 20)
     * @return ApiResponse<ApiKeyList?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun adminApiKeysListWithHttpInfo(after: kotlin.String?, order: OrderAdminApiKeysList?, limit: kotlin.Int?) : ApiResponse<ApiKeyList?> {
        val localVariableConfig = adminApiKeysListRequestConfig(after = after, order = order, limit = limit)

        return request<Unit, ApiKeyList>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation adminApiKeysList
     *
     * @param after  (optional)
     * @param order  (optional, default to asc)
     * @param limit  (optional, default to 20)
     * @return RequestConfig
     */
    fun adminApiKeysListRequestConfig(after: kotlin.String?, order: OrderAdminApiKeysList?, limit: kotlin.Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (after != null) {
                    put("after", listOf(after.toString()))
                }
                if (order != null) {
                    put("order", listOf(order.value))
                }
                if (limit != null) {
                    put("limit", listOf(limit.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/organization/admin_api_keys",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}