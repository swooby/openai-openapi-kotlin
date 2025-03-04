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

class AssistantToolsFileSearchFileSearchTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of
        // AssistantToolsFileSearchFileSearch
        // val modelInstance = AssistantToolsFileSearchFileSearch()

        // to test the property `maxNumResults` - The maximum number of results
        // the file search tool should output. The default is 20 for `gpt-4*`
        // models and 5 for `gpt-3.5-turbo`. This number should be between 1 and
        // 50 inclusive.  Note that the file search tool may output fewer than
        // `max_num_results` results. See the [file search tool
        // documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.
        should("test maxNumResults") {
            // uncomment below to test the property
            // modelInstance.maxNumResults shouldBe ("TODO")
        }

        // to test the property `rankingOptions`
        should("test rankingOptions") {
            // uncomment below to test the property
            // modelInstance.rankingOptions shouldBe ("TODO")
        }
    }
}
