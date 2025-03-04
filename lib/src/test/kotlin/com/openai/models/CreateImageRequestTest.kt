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

class CreateImageRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CreateImageRequest
        // val modelInstance = CreateImageRequest()

        // to test the property `prompt` - A text description of the desired
        // image(s). The maximum length is 1000 characters for `dall-e-2` and
        // 4000 characters for `dall-e-3`.
        should("test prompt") {
            // uncomment below to test the property
            // modelInstance.prompt shouldBe ("TODO")
        }

        // to test the property `model`
        should("test model") {
            // uncomment below to test the property
            // modelInstance.model shouldBe ("TODO")
        }

        // to test the property `n` - The number of images to generate. Must be
        // between 1 and 10. For `dall-e-3`, only `n=1` is supported.
        should("test n") {
            // uncomment below to test the property
            // modelInstance.n shouldBe ("TODO")
        }

        // to test the property `quality` - The quality of the image that will
        // be generated. `hd` creates images with finer details and greater
        // consistency across the image. This param is only supported for
        // `dall-e-3`.
        should("test quality") {
            // uncomment below to test the property
            // modelInstance.quality shouldBe ("TODO")
        }

        // to test the property `responseFormat` - The format in which the
        // generated images are returned. Must be one of `url` or `b64_json`.
        // URLs are only valid for 60 minutes after the image has been
        // generated.
        should("test responseFormat") {
            // uncomment below to test the property
            // modelInstance.responseFormat shouldBe ("TODO")
        }

        // to test the property `propertySize` - The size of the generated
        // images. Must be one of `256x256`, `512x512`, or `1024x1024` for
        // `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792`
        // for `dall-e-3` models.
        should("test propertySize") {
            // uncomment below to test the property
            // modelInstance.propertySize shouldBe ("TODO")
        }

        // to test the property `style` - The style of the generated images.
        // Must be one of `vivid` or `natural`. Vivid causes the model to lean
        // towards generating hyper-real and dramatic images. Natural causes the
        // model to produce more natural, less hyper-real looking images. This
        // param is only supported for `dall-e-3`.
        should("test style") {
            // uncomment below to test the property
            // modelInstance.style shouldBe ("TODO")
        }

        // to test the property `user` - A unique identifier representing your
        // end-user, which can help OpenAI to monitor and detect abuse. [Learn
        // more](/docs/guides/safety-best-practices#end-user-ids).
        should("test user") {
            // uncomment below to test the property
            // modelInstance.user shouldBe ("TODO")
        }
    }
}
