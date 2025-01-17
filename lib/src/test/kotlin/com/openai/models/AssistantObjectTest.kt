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

import com.openai.models.AssistantObject
import com.openai.models.AssistantObjectToolResources
import com.openai.models.AssistantObjectToolsInner
import com.openai.models.AssistantsApiResponseFormatOption

class AssistantObjectTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of AssistantObject
        //val modelInstance = AssistantObject()

        // to test the property `id` - The identifier, which can be referenced in API endpoints.
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property ``object`` - The object type, which is always `assistant`.
        should("test `object`") {
            // uncomment below to test the property
            //modelInstance.`object` shouldBe ("TODO")
        }

        // to test the property `createdAt` - The Unix timestamp (in seconds) for when the assistant was created.
        should("test createdAt") {
            // uncomment below to test the property
            //modelInstance.createdAt shouldBe ("TODO")
        }

        // to test the property `name` - The name of the assistant. The maximum length is 256 characters. 
        should("test name") {
            // uncomment below to test the property
            //modelInstance.name shouldBe ("TODO")
        }

        // to test the property `description` - The description of the assistant. The maximum length is 512 characters. 
        should("test description") {
            // uncomment below to test the property
            //modelInstance.description shouldBe ("TODO")
        }

        // to test the property `model` - ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. 
        should("test model") {
            // uncomment below to test the property
            //modelInstance.model shouldBe ("TODO")
        }

        // to test the property `instructions` - The system instructions that the assistant uses. The maximum length is 256,000 characters. 
        should("test instructions") {
            // uncomment below to test the property
            //modelInstance.instructions shouldBe ("TODO")
        }

        // to test the property `tools` - A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. 
        should("test tools") {
            // uncomment below to test the property
            //modelInstance.tools shouldBe ("TODO")
        }

        // to test the property `metadata` - Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
        should("test metadata") {
            // uncomment below to test the property
            //modelInstance.metadata shouldBe ("TODO")
        }

        // to test the property `toolResources`
        should("test toolResources") {
            // uncomment below to test the property
            //modelInstance.toolResources shouldBe ("TODO")
        }

        // to test the property `temperature` - What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
        should("test temperature") {
            // uncomment below to test the property
            //modelInstance.temperature shouldBe ("TODO")
        }

        // to test the property `topP` - An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
        should("test topP") {
            // uncomment below to test the property
            //modelInstance.topP shouldBe ("TODO")
        }

        // to test the property `responseFormat`
        should("test responseFormat") {
            // uncomment below to test the property
            //modelInstance.responseFormat shouldBe ("TODO")
        }

    }
}