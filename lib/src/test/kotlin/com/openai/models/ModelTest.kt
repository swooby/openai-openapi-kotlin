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

class ModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of Model
        // val modelInstance = Model()

        // to test the property `id` - The model identifier, which can be
        // referenced in the API endpoints.
        should("test id") {
            // uncomment below to test the property
            // modelInstance.id shouldBe ("TODO")
        }

        // to test the property `created` - The Unix timestamp (in seconds) when
        // the model was created.
        should("test created") {
            // uncomment below to test the property
            // modelInstance.created shouldBe ("TODO")
        }

        // to test the property ``object`` - The object type, which is always
        // \"model\".
        should("test `object`") {
            // uncomment below to test the property
            // modelInstance.`object` shouldBe ("TODO")
        }

        // to test the property `ownedBy` - The organization that owns the
        // model.
        should("test ownedBy") {
            // uncomment below to test the property
            // modelInstance.ownedBy shouldBe ("TODO")
        }
    }
}
