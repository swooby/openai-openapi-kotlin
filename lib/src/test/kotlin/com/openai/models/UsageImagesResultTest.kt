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

package com.openai.models

import io.kotlintest.specs.ShouldSpec

class UsageImagesResultTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of UsageImagesResult
        // val modelInstance = UsageImagesResult()

        // to test the property ``object``
        should("test `object`") {
            // uncomment below to test the property
            // modelInstance.`object` shouldBe ("TODO")
        }

        // to test the property `images` - The number of images processed.
        should("test images") {
            // uncomment below to test the property
            // modelInstance.images shouldBe ("TODO")
        }

        // to test the property `numModelRequests` - The count of requests made
        // to the model.
        should("test numModelRequests") {
            // uncomment below to test the property
            // modelInstance.numModelRequests shouldBe ("TODO")
        }

        // to test the property `source` - When `group_by=source`, this field
        // provides the source of the grouped usage result, possible values are
        // `image.generation`, `image.edit`, `image.variation`.
        should("test source") {
            // uncomment below to test the property
            // modelInstance.source shouldBe ("TODO")
        }

        // to test the property `propertySize` - When `group_by=size`, this
        // field provides the image size of the grouped usage result.
        should("test propertySize") {
            // uncomment below to test the property
            // modelInstance.propertySize shouldBe ("TODO")
        }

        // to test the property `projectId` - When `group_by=project_id`, this
        // field provides the project ID of the grouped usage result.
        should("test projectId") {
            // uncomment below to test the property
            // modelInstance.projectId shouldBe ("TODO")
        }

        // to test the property `userId` - When `group_by=user_id`, this field
        // provides the user ID of the grouped usage result.
        should("test userId") {
            // uncomment below to test the property
            // modelInstance.userId shouldBe ("TODO")
        }

        // to test the property `apiKeyId` - When `group_by=api_key_id`, this
        // field provides the API key ID of the grouped usage result.
        should("test apiKeyId") {
            // uncomment below to test the property
            // modelInstance.apiKeyId shouldBe ("TODO")
        }

        // to test the property `model` - When `group_by=model`, this field
        // provides the model name of the grouped usage result.
        should("test model") {
            // uncomment below to test the property
            // modelInstance.model shouldBe ("TODO")
        }
    }
}
