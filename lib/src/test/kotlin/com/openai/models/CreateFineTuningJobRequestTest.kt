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

class CreateFineTuningJobRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CreateFineTuningJobRequest
        // val modelInstance = CreateFineTuningJobRequest()

        // to test the property `model`
        should("test model") {
            // uncomment below to test the property
            // modelInstance.model shouldBe ("TODO")
        }

        // to test the property `trainingFile` - The ID of an uploaded file that
        // contains training data.  See [upload
        // file](/docs/api-reference/files/create) for how to upload a file.
        // Your dataset must be formatted as a JSONL file. Additionally, you
        // must upload your file with the purpose `fine-tune`.  The contents of
        // the file should differ depending on if the model uses the
        // [chat](/docs/api-reference/fine-tuning/chat-input),
        // [completions](/docs/api-reference/fine-tuning/completions-input)
        // format, or if the fine-tuning method uses the
        // [preference](/docs/api-reference/fine-tuning/preference-input)
        // format.  See the [fine-tuning guide](/docs/guides/fine-tuning) for
        // more details.
        should("test trainingFile") {
            // uncomment below to test the property
            // modelInstance.trainingFile shouldBe ("TODO")
        }

        // to test the property `hyperparameters`
        should("test hyperparameters") {
            // uncomment below to test the property
            // modelInstance.hyperparameters shouldBe ("TODO")
        }

        // to test the property `suffix` - A string of up to 64 characters that
        // will be added to your fine-tuned model name.  For example, a `suffix`
        // of \"custom-model-name\" would produce a model name like
        // `ft:gpt-4o-mini:openai:custom-model-name:7p4lURel`.
        should("test suffix") {
            // uncomment below to test the property
            // modelInstance.suffix shouldBe ("TODO")
        }

        // to test the property `validationFile` - The ID of an uploaded file
        // that contains validation data.  If you provide this file, the data is
        // used to generate validation metrics periodically during fine-tuning.
        // These metrics can be viewed in the fine-tuning results file. The same
        // data should not be present in both train and validation files.  Your
        // dataset must be formatted as a JSONL file. You must upload your file
        // with the purpose `fine-tune`.  See the [fine-tuning
        // guide](/docs/guides/fine-tuning) for more details.
        should("test validationFile") {
            // uncomment below to test the property
            // modelInstance.validationFile shouldBe ("TODO")
        }

        // to test the property `integrations` - A list of integrations to
        // enable for your fine-tuning job.
        should("test integrations") {
            // uncomment below to test the property
            // modelInstance.integrations shouldBe ("TODO")
        }

        // to test the property `seed` - The seed controls the reproducibility
        // of the job. Passing in the same seed and job parameters should
        // produce the same results, but may differ in rare cases. If a seed is
        // not specified, one will be generated for you.
        should("test seed") {
            // uncomment below to test the property
            // modelInstance.seed shouldBe ("TODO")
        }

        // to test the property `method`
        should("test method") {
            // uncomment below to test the property
            // modelInstance.method shouldBe ("TODO")
        }
    }
}
