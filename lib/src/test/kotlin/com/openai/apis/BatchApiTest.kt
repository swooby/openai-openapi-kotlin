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

import io.kotlintest.specs.ShouldSpec

class BatchApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of BatchApi
        // val apiInstance = BatchApi()

        // to test cancelBatch
        should("test cancelBatch") {
            // uncomment below to test cancelBatch
            // val batchId : kotlin.String = batchId_example // kotlin.String |
            // The ID of the batch to cancel.
            // val result : Batch = apiInstance.cancelBatch(batchId)
            // result shouldBe ("TODO")
        }

        // to test createBatch
        should("test createBatch") {
            // uncomment below to test createBatch
            // val createBatchRequest : CreateBatchRequest =  //
            // CreateBatchRequest |
            // val result : Batch = apiInstance.createBatch(createBatchRequest)
            // result shouldBe ("TODO")
        }

        // to test listBatches
        should("test listBatches") {
            // uncomment below to test listBatches
            // val after : kotlin.String = after_example // kotlin.String | A
            // cursor for use in pagination. `after` is an object ID that
            // defines your place in the list. For instance, if you make a list
            // request and receive 100 objects, ending with obj_foo, your
            // subsequent call can include after=obj_foo in order to fetch the
            // next page of the list.
            // val limit : kotlin.Int = 56 // kotlin.Int | A limit on the number
            // of objects to be returned. Limit can range between 1 and 100, and
            // the default is 20.
            // val result : ListBatchesResponse = apiInstance.listBatches(after,
            // limit)
            // result shouldBe ("TODO")
        }

        // to test retrieveBatch
        should("test retrieveBatch") {
            // uncomment below to test retrieveBatch
            // val batchId : kotlin.String = batchId_example // kotlin.String |
            // The ID of the batch to retrieve.
            // val result : Batch = apiInstance.retrieveBatch(batchId)
            // result shouldBe ("TODO")
        }
    }
}
