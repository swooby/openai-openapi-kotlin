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

class UsageVectorStoresResultTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of UsageVectorStoresResult
        // val modelInstance = UsageVectorStoresResult()

        // to test the property ``object``
        should("test `object`") {
            // uncomment below to test the property
            // modelInstance.`object` shouldBe ("TODO")
        }

        // to test the property `usageBytes` - The vector stores usage in bytes.
        should("test usageBytes") {
            // uncomment below to test the property
            // modelInstance.usageBytes shouldBe ("TODO")
        }

        // to test the property `projectId` - When `group_by=project_id`, this
        // field provides the project ID of the grouped usage result.
        should("test projectId") {
            // uncomment below to test the property
            // modelInstance.projectId shouldBe ("TODO")
        }
    }
}
