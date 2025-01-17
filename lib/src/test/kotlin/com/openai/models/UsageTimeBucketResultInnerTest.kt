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

package com.openai.models

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import com.openai.models.UsageTimeBucketResultInner
import com.openai.models.CostsResult
import com.openai.models.CostsResultAmount
import com.openai.models.UsageAudioSpeechesResult
import com.openai.models.UsageAudioTranscriptionsResult
import com.openai.models.UsageCodeInterpreterSessionsResult
import com.openai.models.UsageCompletionsResult
import com.openai.models.UsageEmbeddingsResult
import com.openai.models.UsageImagesResult
import com.openai.models.UsageModerationsResult
import com.openai.models.UsageVectorStoresResult

class UsageTimeBucketResultInnerTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of UsageTimeBucketResultInner
        //val modelInstance = UsageTimeBucketResultInner()

        // to test the property ``object``
        should("test `object`") {
            // uncomment below to test the property
            //modelInstance.`object` shouldBe ("TODO")
        }

        // to test the property `inputTokens` - The aggregated number of input tokens used.
        should("test inputTokens") {
            // uncomment below to test the property
            //modelInstance.inputTokens shouldBe ("TODO")
        }

        // to test the property `outputTokens` - The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
        should("test outputTokens") {
            // uncomment below to test the property
            //modelInstance.outputTokens shouldBe ("TODO")
        }

        // to test the property `numModelRequests` - The count of requests made to the model.
        should("test numModelRequests") {
            // uncomment below to test the property
            //modelInstance.numModelRequests shouldBe ("TODO")
        }

        // to test the property `images` - The number of images processed.
        should("test images") {
            // uncomment below to test the property
            //modelInstance.images shouldBe ("TODO")
        }

        // to test the property `characters` - The number of characters processed.
        should("test characters") {
            // uncomment below to test the property
            //modelInstance.characters shouldBe ("TODO")
        }

        // to test the property `seconds` - The number of seconds processed.
        should("test seconds") {
            // uncomment below to test the property
            //modelInstance.seconds shouldBe ("TODO")
        }

        // to test the property `usageBytes` - The vector stores usage in bytes.
        should("test usageBytes") {
            // uncomment below to test the property
            //modelInstance.usageBytes shouldBe ("TODO")
        }

        // to test the property `sessions` - The number of code interpreter sessions.
        should("test sessions") {
            // uncomment below to test the property
            //modelInstance.sessions shouldBe ("TODO")
        }

        // to test the property `inputCachedTokens` - The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
        should("test inputCachedTokens") {
            // uncomment below to test the property
            //modelInstance.inputCachedTokens shouldBe ("TODO")
        }

        // to test the property `inputAudioTokens` - The aggregated number of audio input tokens used, including cached tokens.
        should("test inputAudioTokens") {
            // uncomment below to test the property
            //modelInstance.inputAudioTokens shouldBe ("TODO")
        }

        // to test the property `outputAudioTokens` - The aggregated number of audio output tokens used.
        should("test outputAudioTokens") {
            // uncomment below to test the property
            //modelInstance.outputAudioTokens shouldBe ("TODO")
        }

        // to test the property `projectId` - When `group_by=project_id`, this field provides the project ID of the grouped costs result.
        should("test projectId") {
            // uncomment below to test the property
            //modelInstance.projectId shouldBe ("TODO")
        }

        // to test the property `userId` - When `group_by=user_id`, this field provides the user ID of the grouped usage result.
        should("test userId") {
            // uncomment below to test the property
            //modelInstance.userId shouldBe ("TODO")
        }

        // to test the property `apiKeyId` - When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
        should("test apiKeyId") {
            // uncomment below to test the property
            //modelInstance.apiKeyId shouldBe ("TODO")
        }

        // to test the property `model` - When `group_by=model`, this field provides the model name of the grouped usage result.
        should("test model") {
            // uncomment below to test the property
            //modelInstance.model shouldBe ("TODO")
        }

        // to test the property `batch` - When `group_by=batch`, this field tells whether the grouped usage result is batch or not.
        should("test batch") {
            // uncomment below to test the property
            //modelInstance.batch shouldBe ("TODO")
        }

        // to test the property `source` - When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.
        should("test source") {
            // uncomment below to test the property
            //modelInstance.source shouldBe ("TODO")
        }

        // to test the property `propertySize` - When `group_by=size`, this field provides the image size of the grouped usage result.
        should("test propertySize") {
            // uncomment below to test the property
            //modelInstance.propertySize shouldBe ("TODO")
        }

        // to test the property `amount`
        should("test amount") {
            // uncomment below to test the property
            //modelInstance.amount shouldBe ("TODO")
        }

        // to test the property `lineItem` - When `group_by=line_item`, this field provides the line item of the grouped costs result.
        should("test lineItem") {
            // uncomment below to test the property
            //modelInstance.lineItem shouldBe ("TODO")
        }

    }
}
