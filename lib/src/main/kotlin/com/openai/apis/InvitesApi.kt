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
import com.openai.models.Invite
import com.openai.models.InviteDeleteResponse
import com.openai.models.InviteListResponse
import com.openai.models.InviteRequest
import java.io.IOException
import okhttp3.Call
import okhttp3.HttpUrl

class InvitesApi(
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
     * Delete an invite. If the invite has already been accepted, it cannot be
     * deleted.
     *
     * @param inviteId The ID of the invite to delete.
     * @return InviteDeleteResponse
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
    fun deleteInvite(inviteId: kotlin.String): InviteDeleteResponse {
        val localVarResponse = deleteInviteWithHttpInfo(inviteId = inviteId)

        return when (localVarResponse.responseType) {
            ResponseType.Success ->
                (localVarResponse as Success<*>).data as InviteDeleteResponse
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
     * Delete an invite. If the invite has already been accepted, it cannot be
     * deleted.
     *
     * @param inviteId The ID of the invite to delete.
     * @return ApiResponse<InviteDeleteResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun deleteInviteWithHttpInfo(
        inviteId: kotlin.String
    ): ApiResponse<InviteDeleteResponse?> {
        val localVariableConfig = deleteInviteRequestConfig(inviteId = inviteId)

        return request<Unit, InviteDeleteResponse>(localVariableConfig)
    }

    /**
     * To obtain the request config of the operation deleteInvite
     *
     * @param inviteId The ID of the invite to delete.
     * @return RequestConfig
     */
    fun deleteInviteRequestConfig(
        inviteId: kotlin.String
    ): RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path =
                "/organization/invites/{invite_id}"
                    .replace(
                        "{" + "invite_id" + "}",
                        encodeURIComponent(inviteId.toString()),
                    ),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody,
        )
    }

    /**
     * Create an invite for a user to the organization. The invite must be
     * accepted by the user before they have access to the organization.
     *
     * @param inviteRequest The invite request payload.
     * @return Invite
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
    fun inviteUser(inviteRequest: InviteRequest): Invite {
        val localVarResponse =
            inviteUserWithHttpInfo(inviteRequest = inviteRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success ->
                (localVarResponse as Success<*>).data as Invite
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
     * Create an invite for a user to the organization. The invite must be
     * accepted by the user before they have access to the organization.
     *
     * @param inviteRequest The invite request payload.
     * @return ApiResponse<Invite?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun inviteUserWithHttpInfo(
        inviteRequest: InviteRequest
    ): ApiResponse<Invite?> {
        val localVariableConfig =
            inviteUserRequestConfig(inviteRequest = inviteRequest)

        return request<InviteRequest, Invite>(localVariableConfig)
    }

    /**
     * To obtain the request config of the operation inviteUser
     *
     * @param inviteRequest The invite request payload.
     * @return RequestConfig
     */
    fun inviteUserRequestConfig(
        inviteRequest: InviteRequest
    ): RequestConfig<InviteRequest> {
        val localVariableBody = inviteRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/organization/invites",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody,
        )
    }

    /**
     * Returns a list of invites in the organization.
     *
     * @param limit A limit on the number of objects to be returned. Limit can
     *   range between 1 and 100, and the default is 20. (optional, default
     *   to 20)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an
     *   object ID that defines your place in the list. For instance, if you
     *   make a list request and receive 100 objects, ending with obj_foo, your
     *   subsequent call can include after&#x3D;obj_foo in order to fetch the
     *   next page of the list. (optional)
     * @return InviteListResponse
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
    fun listInvites(
        limit: kotlin.Int? = 20,
        after: kotlin.String? = null,
    ): InviteListResponse {
        val localVarResponse =
            listInvitesWithHttpInfo(limit = limit, after = after)

        return when (localVarResponse.responseType) {
            ResponseType.Success ->
                (localVarResponse as Success<*>).data as InviteListResponse
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
     * Returns a list of invites in the organization.
     *
     * @param limit A limit on the number of objects to be returned. Limit can
     *   range between 1 and 100, and the default is 20. (optional, default
     *   to 20)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an
     *   object ID that defines your place in the list. For instance, if you
     *   make a list request and receive 100 objects, ending with obj_foo, your
     *   subsequent call can include after&#x3D;obj_foo in order to fetch the
     *   next page of the list. (optional)
     * @return ApiResponse<InviteListResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun listInvitesWithHttpInfo(
        limit: kotlin.Int?,
        after: kotlin.String?,
    ): ApiResponse<InviteListResponse?> {
        val localVariableConfig =
            listInvitesRequestConfig(limit = limit, after = after)

        return request<Unit, InviteListResponse>(localVariableConfig)
    }

    /**
     * To obtain the request config of the operation listInvites
     *
     * @param limit A limit on the number of objects to be returned. Limit can
     *   range between 1 and 100, and the default is 20. (optional, default
     *   to 20)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an
     *   object ID that defines your place in the list. For instance, if you
     *   make a list request and receive 100 objects, ending with obj_foo, your
     *   subsequent call can include after&#x3D;obj_foo in order to fetch the
     *   next page of the list. (optional)
     * @return RequestConfig
     */
    fun listInvitesRequestConfig(
        limit: kotlin.Int?,
        after: kotlin.String?,
    ): RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap =
            mutableMapOf<
                    kotlin.String,
                    kotlin.collections.List<kotlin.String>,
                >()
                .apply {
                    if (limit != null) {
                        put("limit", listOf(limit.toString()))
                    }
                    if (after != null) {
                        put("after", listOf(after.toString()))
                    }
                }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/organization/invites",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody,
        )
    }

    /**
     * Retrieves an invite.
     *
     * @param inviteId The ID of the invite to retrieve.
     * @return Invite
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
    fun retrieveInvite(inviteId: kotlin.String): Invite {
        val localVarResponse = retrieveInviteWithHttpInfo(inviteId = inviteId)

        return when (localVarResponse.responseType) {
            ResponseType.Success ->
                (localVarResponse as Success<*>).data as Invite
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
     * Retrieves an invite.
     *
     * @param inviteId The ID of the invite to retrieve.
     * @return ApiResponse<Invite?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun retrieveInviteWithHttpInfo(
        inviteId: kotlin.String
    ): ApiResponse<Invite?> {
        val localVariableConfig =
            retrieveInviteRequestConfig(inviteId = inviteId)

        return request<Unit, Invite>(localVariableConfig)
    }

    /**
     * To obtain the request config of the operation retrieveInvite
     *
     * @param inviteId The ID of the invite to retrieve.
     * @return RequestConfig
     */
    fun retrieveInviteRequestConfig(
        inviteId: kotlin.String
    ): RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path =
                "/organization/invites/{invite_id}"
                    .replace(
                        "{" + "invite_id" + "}",
                        encodeURIComponent(inviteId.toString()),
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
