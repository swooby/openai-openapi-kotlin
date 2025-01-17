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

import com.openai.models.MessageDeltaObjectDeltaContentInner
import com.openai.models.MessageDeltaContentImageFileObject
import com.openai.models.MessageDeltaContentImageFileObjectImageFile
import com.openai.models.MessageDeltaContentImageUrlObject
import com.openai.models.MessageDeltaContentImageUrlObjectImageUrl
import com.openai.models.MessageDeltaContentRefusalObject
import com.openai.models.MessageDeltaContentTextObject
import com.openai.models.MessageDeltaContentTextObjectText

class MessageDeltaObjectDeltaContentInnerTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of MessageDeltaObjectDeltaContentInner
        //val modelInstance = MessageDeltaObjectDeltaContentInner()

        // to test the property `index` - The index of the content part in the message.
        should("test index") {
            // uncomment below to test the property
            //modelInstance.index shouldBe ("TODO")
        }

        // to test the property `type` - Always `image_file`.
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `imageFile`
        should("test imageFile") {
            // uncomment below to test the property
            //modelInstance.imageFile shouldBe ("TODO")
        }

        // to test the property `text`
        should("test text") {
            // uncomment below to test the property
            //modelInstance.text shouldBe ("TODO")
        }

        // to test the property `refusal`
        should("test refusal") {
            // uncomment below to test the property
            //modelInstance.refusal shouldBe ("TODO")
        }

        // to test the property `imageUrl`
        should("test imageUrl") {
            // uncomment below to test the property
            //modelInstance.imageUrl shouldBe ("TODO")
        }

    }
}
