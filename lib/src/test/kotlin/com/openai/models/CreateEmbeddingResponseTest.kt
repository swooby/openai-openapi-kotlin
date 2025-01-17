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

import com.openai.models.CreateEmbeddingResponse
import com.openai.models.CreateEmbeddingResponseUsage
import com.openai.models.Embedding

class CreateEmbeddingResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CreateEmbeddingResponse
        //val modelInstance = CreateEmbeddingResponse()

        // to test the property ``data`` - The list of embeddings generated by the model.
        should("test `data`") {
            // uncomment below to test the property
            //modelInstance.`data` shouldBe ("TODO")
        }

        // to test the property `model` - The name of the model used to generate the embedding.
        should("test model") {
            // uncomment below to test the property
            //modelInstance.model shouldBe ("TODO")
        }

        // to test the property ``object`` - The object type, which is always \"list\".
        should("test `object`") {
            // uncomment below to test the property
            //modelInstance.`object` shouldBe ("TODO")
        }

        // to test the property `usage`
        should("test usage") {
            // uncomment below to test the property
            //modelInstance.usage shouldBe ("TODO")
        }

    }
}
