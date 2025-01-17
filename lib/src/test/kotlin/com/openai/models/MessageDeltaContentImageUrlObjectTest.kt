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

import com.openai.models.MessageDeltaContentImageUrlObject
import com.openai.models.MessageDeltaContentImageUrlObjectImageUrl

class MessageDeltaContentImageUrlObjectTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of MessageDeltaContentImageUrlObject
        //val modelInstance = MessageDeltaContentImageUrlObject()

        // to test the property `index` - The index of the content part in the message.
        should("test index") {
            // uncomment below to test the property
            //modelInstance.index shouldBe ("TODO")
        }

        // to test the property `type` - Always `image_url`.
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `imageUrl`
        should("test imageUrl") {
            // uncomment below to test the property
            //modelInstance.imageUrl shouldBe ("TODO")
        }

    }
}