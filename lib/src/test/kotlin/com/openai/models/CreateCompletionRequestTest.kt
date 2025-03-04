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

class CreateCompletionRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CreateCompletionRequest
        // val modelInstance = CreateCompletionRequest()

        // to test the property `model`
        should("test model") {
            // uncomment below to test the property
            // modelInstance.model shouldBe ("TODO")
        }

        // to test the property `prompt`
        should("test prompt") {
            // uncomment below to test the property
            // modelInstance.prompt shouldBe ("TODO")
        }

        // to test the property `bestOf` - Generates `best_of` completions
        // server-side and returns the \"best\" (the one with the highest log
        // probability per token). Results cannot be streamed.  When used with
        // `n`, `best_of` controls the number of candidate completions and `n`
        // specifies how many to return – `best_of` must be greater than `n`.
        // **Note:** Because this parameter generates many completions, it can
        // quickly consume your token quota. Use carefully and ensure that you
        // have reasonable settings for `max_tokens` and `stop`.
        should("test bestOf") {
            // uncomment below to test the property
            // modelInstance.bestOf shouldBe ("TODO")
        }

        // to test the property `echo` - Echo back the prompt in addition to the
        // completion
        should("test echo") {
            // uncomment below to test the property
            // modelInstance.echo shouldBe ("TODO")
        }

        // to test the property `frequencyPenalty` - Number between -2.0 and
        // 2.0. Positive values penalize new tokens based on their existing
        // frequency in the text so far, decreasing the model's likelihood to
        // repeat the same line verbatim.  [See more information about frequency
        // and presence penalties.](/docs/guides/text-generation)
        should("test frequencyPenalty") {
            // uncomment below to test the property
            // modelInstance.frequencyPenalty shouldBe ("TODO")
        }

        // to test the property `logitBias` - Modify the likelihood of specified
        // tokens appearing in the completion.  Accepts a JSON object that maps
        // tokens (specified by their token ID in the GPT tokenizer) to an
        // associated bias value from -100 to 100. You can use this [tokenizer
        // tool](/tokenizer?view=bpe) to convert text to token IDs.
        // Mathematically, the bias is added to the logits generated by the
        // model prior to sampling. The exact effect will vary per model, but
        // values between -1 and 1 should decrease or increase likelihood of
        // selection; values like -100 or 100 should result in a ban or
        // exclusive selection of the relevant token.  As an example, you can
        // pass `{\"50256\": -100}` to prevent the <|endoftext|> token from
        // being generated.
        should("test logitBias") {
            // uncomment below to test the property
            // modelInstance.logitBias shouldBe ("TODO")
        }

        // to test the property `logprobs` - Include the log probabilities on
        // the `logprobs` most likely output tokens, as well the chosen tokens.
        // For example, if `logprobs` is 5, the API will return a list of the 5
        // most likely tokens. The API will always return the `logprob` of the
        // sampled token, so there may be up to `logprobs+1` elements in the
        // response.  The maximum value for `logprobs` is 5.
        should("test logprobs") {
            // uncomment below to test the property
            // modelInstance.logprobs shouldBe ("TODO")
        }

        // to test the property `maxTokens` - The maximum number of
        // [tokens](/tokenizer) that can be generated in the completion.  The
        // token count of your prompt plus `max_tokens` cannot exceed the
        // model's context length. [Example Python
        // code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens.
        should("test maxTokens") {
            // uncomment below to test the property
            // modelInstance.maxTokens shouldBe ("TODO")
        }

        // to test the property `n` - How many completions to generate for each
        // prompt.  **Note:** Because this parameter generates many completions,
        // it can quickly consume your token quota. Use carefully and ensure
        // that you have reasonable settings for `max_tokens` and `stop`.
        should("test n") {
            // uncomment below to test the property
            // modelInstance.n shouldBe ("TODO")
        }

        // to test the property `presencePenalty` - Number between -2.0 and 2.0.
        // Positive values penalize new tokens based on whether they appear in
        // the text so far, increasing the model's likelihood to talk about new
        // topics.  [See more information about frequency and presence
        // penalties.](/docs/guides/text-generation)
        should("test presencePenalty") {
            // uncomment below to test the property
            // modelInstance.presencePenalty shouldBe ("TODO")
        }

        // to test the property `seed` - If specified, our system will make a
        // best effort to sample deterministically, such that repeated requests
        // with the same `seed` and parameters should return the same result.
        // Determinism is not guaranteed, and you should refer to the
        // `system_fingerprint` response parameter to monitor changes in the
        // backend.
        should("test seed") {
            // uncomment below to test the property
            // modelInstance.seed shouldBe ("TODO")
        }

        // to test the property `stop`
        should("test stop") {
            // uncomment below to test the property
            // modelInstance.stop shouldBe ("TODO")
        }

        // to test the property `stream` - Whether to stream back partial
        // progress. If set, tokens will be sent as data-only [server-sent
        // events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions).
        should("test stream") {
            // uncomment below to test the property
            // modelInstance.stream shouldBe ("TODO")
        }

        // to test the property `streamOptions`
        should("test streamOptions") {
            // uncomment below to test the property
            // modelInstance.streamOptions shouldBe ("TODO")
        }

        // to test the property `suffix` - The suffix that comes after a
        // completion of inserted text.  This parameter is only supported for
        // `gpt-3.5-turbo-instruct`.
        should("test suffix") {
            // uncomment below to test the property
            // modelInstance.suffix shouldBe ("TODO")
        }

        // to test the property `temperature` - What sampling temperature to
        // use, between 0 and 2. Higher values like 0.8 will make the output
        // more random, while lower values like 0.2 will make it more focused
        // and deterministic.  We generally recommend altering this or `top_p`
        // but not both.
        should("test temperature") {
            // uncomment below to test the property
            // modelInstance.temperature shouldBe ("TODO")
        }

        // to test the property `topP` - An alternative to sampling with
        // temperature, called nucleus sampling, where the model considers the
        // results of the tokens with top_p probability mass. So 0.1 means only
        // the tokens comprising the top 10% probability mass are considered.
        // We generally recommend altering this or `temperature` but not both.
        should("test topP") {
            // uncomment below to test the property
            // modelInstance.topP shouldBe ("TODO")
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
