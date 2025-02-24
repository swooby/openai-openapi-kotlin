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

class RealtimeResponseCreateParamsToolsInnerTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of
        // RealtimeResponseCreateParamsToolsInner
        // val modelInstance = RealtimeResponseCreateParamsToolsInner()

        // to test the property `type` - The type of the tool, i.e. `function`.
        should("test type") {
            // uncomment below to test the property
            // modelInstance.type shouldBe ("TODO")
        }

        // to test the property `name` - The name of the function.
        should("test name") {
            // uncomment below to test the property
            // modelInstance.name shouldBe ("TODO")
        }

        // to test the property `description` - The description of the function,
        // including guidance on when and how  to call it, and guidance about
        // what to tell the user when calling  (if anything).
        should("test description") {
            // uncomment below to test the property
            // modelInstance.description shouldBe ("TODO")
        }

        // to test the property `parameters` - Parameters of the function in
        // JSON Schema.
        should("test parameters") {
            // uncomment below to test the property
            // modelInstance.parameters shouldBe ("TODO")
        }
    }
}
