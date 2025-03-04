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

class ThreadObjectTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ThreadObject
        // val modelInstance = ThreadObject()

        // to test the property `id` - The identifier, which can be referenced
        // in API endpoints.
        should("test id") {
            // uncomment below to test the property
            // modelInstance.id shouldBe ("TODO")
        }

        // to test the property ``object`` - The object type, which is always
        // `thread`.
        should("test `object`") {
            // uncomment below to test the property
            // modelInstance.`object` shouldBe ("TODO")
        }

        // to test the property `createdAt` - The Unix timestamp (in seconds)
        // for when the thread was created.
        should("test createdAt") {
            // uncomment below to test the property
            // modelInstance.createdAt shouldBe ("TODO")
        }

        // to test the property `toolResources`
        should("test toolResources") {
            // uncomment below to test the property
            // modelInstance.toolResources shouldBe ("TODO")
        }

        // to test the property `metadata` - Set of 16 key-value pairs that can
        // be attached to an object. This can be useful for storing additional
        // information about the object in a structured format, and querying for
        // objects via API or the dashboard.   Keys are strings with a maximum
        // length of 64 characters. Values are strings with a maximum length of
        // 512 characters.
        should("test metadata") {
            // uncomment below to test the property
            // modelInstance.metadata shouldBe ("TODO")
        }
    }
}
