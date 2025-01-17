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

import com.openai.models.AudioResponseFormat
import com.openai.models.CreateSpeechRequest
import com.openai.models.CreateTranscription200Response
import com.openai.models.CreateTranscriptionRequestModel
import com.openai.models.CreateTranslation200Response

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

class AudioApi(basePath: kotlin.String = defaultBasePath, client: Call.Factory = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://api.openai.com/v1")
        }
    }

    /**
     * Generates audio from the input text.
     * 
     * @param createSpeechRequest 
     * @return java.io.File
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createSpeech(createSpeechRequest: CreateSpeechRequest) : java.io.File {
        val localVarResponse = createSpeechWithHttpInfo(createSpeechRequest = createSpeechRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as java.io.File
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
     * Generates audio from the input text.
     * 
     * @param createSpeechRequest 
     * @return ApiResponse<java.io.File?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun createSpeechWithHttpInfo(createSpeechRequest: CreateSpeechRequest) : ApiResponse<java.io.File?> {
        val localVariableConfig = createSpeechRequestConfig(createSpeechRequest = createSpeechRequest)

        return request<CreateSpeechRequest, java.io.File>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation createSpeech
     *
     * @param createSpeechRequest 
     * @return RequestConfig
     */
    fun createSpeechRequestConfig(createSpeechRequest: CreateSpeechRequest) : RequestConfig<CreateSpeechRequest> {
        val localVariableBody = createSpeechRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/octet-stream"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/audio/speech",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter timestampGranularities
     */
     enum class TimestampGranularitiesCreateTranscription(val value: kotlin.String) {
         @Json(name = "word") word("word"),
         @Json(name = "segment") segment("segment");

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
     * Transcribes audio into the input language.
     * 
     * @param file The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
     * @param model 
     * @param language The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  (optional)
     * @param prompt An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language.  (optional)
     * @param responseFormat  (optional, default to json)
     * @param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional, default to 0)
     * @param timestampGranularities The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency.  (optional)
     * @return CreateTranscription200Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createTranscription(file: java.io.File, model: CreateTranscriptionRequestModel, language: kotlin.String? = null, prompt: kotlin.String? = null, responseFormat: AudioResponseFormat? = json, temperature: java.math.BigDecimal? = java.math.BigDecimal("0"), timestampGranularities: kotlin.collections.List<TimestampGranularitiesCreateTranscription>? = null) : CreateTranscription200Response {
        val localVarResponse = createTranscriptionWithHttpInfo(file = file, model = model, language = language, prompt = prompt, responseFormat = responseFormat, temperature = temperature, timestampGranularities = timestampGranularities)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CreateTranscription200Response
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
     * Transcribes audio into the input language.
     * 
     * @param file The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
     * @param model 
     * @param language The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  (optional)
     * @param prompt An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language.  (optional)
     * @param responseFormat  (optional, default to json)
     * @param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional, default to 0)
     * @param timestampGranularities The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency.  (optional)
     * @return ApiResponse<CreateTranscription200Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun createTranscriptionWithHttpInfo(file: java.io.File, model: CreateTranscriptionRequestModel, language: kotlin.String?, prompt: kotlin.String?, responseFormat: AudioResponseFormat?, temperature: java.math.BigDecimal?, timestampGranularities: kotlin.collections.List<TimestampGranularitiesCreateTranscription>?) : ApiResponse<CreateTranscription200Response?> {
        val localVariableConfig = createTranscriptionRequestConfig(file = file, model = model, language = language, prompt = prompt, responseFormat = responseFormat, temperature = temperature, timestampGranularities = timestampGranularities)

        return request<Map<String, PartConfig<*>>, CreateTranscription200Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation createTranscription
     *
     * @param file The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
     * @param model 
     * @param language The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  (optional)
     * @param prompt An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language.  (optional)
     * @param responseFormat  (optional, default to json)
     * @param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional, default to 0)
     * @param timestampGranularities The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency.  (optional)
     * @return RequestConfig
     */
    fun createTranscriptionRequestConfig(file: java.io.File, model: CreateTranscriptionRequestModel, language: kotlin.String?, prompt: kotlin.String?, responseFormat: AudioResponseFormat?, temperature: java.math.BigDecimal?, timestampGranularities: kotlin.collections.List<TimestampGranularitiesCreateTranscription>?) : RequestConfig<Map<String, PartConfig<*>>> {
        val localVariableBody = mapOf(
            "file" to PartConfig(body = file, headers = mutableMapOf()),
            "model" to PartConfig(body = model, headers = mutableMapOf()),
            "language" to PartConfig(body = language, headers = mutableMapOf()),
            "prompt" to PartConfig(body = prompt, headers = mutableMapOf()),
            "response_format" to PartConfig(body = responseFormat, headers = mutableMapOf()),
            "temperature" to PartConfig(body = temperature, headers = mutableMapOf()),
            "timestamp_granularities[]" to PartConfig(body = timestampGranularities?.value, headers = mutableMapOf()),)
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "multipart/form-data")
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/audio/transcriptions",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Translates audio into English.
     * 
     * @param file The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
     * @param model 
     * @param prompt An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English.  (optional)
     * @param responseFormat  (optional, default to json)
     * @param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional, default to 0)
     * @return CreateTranslation200Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createTranslation(file: java.io.File, model: CreateTranscriptionRequestModel, prompt: kotlin.String? = null, responseFormat: AudioResponseFormat? = json, temperature: java.math.BigDecimal? = java.math.BigDecimal("0")) : CreateTranslation200Response {
        val localVarResponse = createTranslationWithHttpInfo(file = file, model = model, prompt = prompt, responseFormat = responseFormat, temperature = temperature)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CreateTranslation200Response
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
     * Translates audio into English.
     * 
     * @param file The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
     * @param model 
     * @param prompt An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English.  (optional)
     * @param responseFormat  (optional, default to json)
     * @param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional, default to 0)
     * @return ApiResponse<CreateTranslation200Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun createTranslationWithHttpInfo(file: java.io.File, model: CreateTranscriptionRequestModel, prompt: kotlin.String?, responseFormat: AudioResponseFormat?, temperature: java.math.BigDecimal?) : ApiResponse<CreateTranslation200Response?> {
        val localVariableConfig = createTranslationRequestConfig(file = file, model = model, prompt = prompt, responseFormat = responseFormat, temperature = temperature)

        return request<Map<String, PartConfig<*>>, CreateTranslation200Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation createTranslation
     *
     * @param file The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
     * @param model 
     * @param prompt An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English.  (optional)
     * @param responseFormat  (optional, default to json)
     * @param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional, default to 0)
     * @return RequestConfig
     */
    fun createTranslationRequestConfig(file: java.io.File, model: CreateTranscriptionRequestModel, prompt: kotlin.String?, responseFormat: AudioResponseFormat?, temperature: java.math.BigDecimal?) : RequestConfig<Map<String, PartConfig<*>>> {
        val localVariableBody = mapOf(
            "file" to PartConfig(body = file, headers = mutableMapOf()),
            "model" to PartConfig(body = model, headers = mutableMapOf()),
            "prompt" to PartConfig(body = prompt, headers = mutableMapOf()),
            "response_format" to PartConfig(body = responseFormat, headers = mutableMapOf()),
            "temperature" to PartConfig(body = temperature, headers = mutableMapOf()),)
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "multipart/form-data")
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/audio/translations",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}