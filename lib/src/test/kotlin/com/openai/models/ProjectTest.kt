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

class ProjectTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of Project
        // val modelInstance = Project()

        // to test the property `id` - The identifier, which can be referenced
        // in API endpoints
        should("test id") {
            // uncomment below to test the property
            // modelInstance.id shouldBe ("TODO")
        }

        // to test the property ``object`` - The object type, which is always
        // `organization.project`
        should("test `object`") {
            // uncomment below to test the property
            // modelInstance.`object` shouldBe ("TODO")
        }

        // to test the property `name` - The name of the project. This appears
        // in reporting.
        should("test name") {
            // uncomment below to test the property
            // modelInstance.name shouldBe ("TODO")
        }

        // to test the property `createdAt` - The Unix timestamp (in seconds) of
        // when the project was created.
        should("test createdAt") {
            // uncomment below to test the property
            // modelInstance.createdAt shouldBe ("TODO")
        }

        // to test the property `status` - `active` or `archived`
        should("test status") {
            // uncomment below to test the property
            // modelInstance.status shouldBe ("TODO")
        }

        // to test the property `archivedAt` - The Unix timestamp (in seconds)
        // of when the project was archived or `null`.
        should("test archivedAt") {
            // uncomment below to test the property
            // modelInstance.archivedAt shouldBe ("TODO")
        }
    }
}
