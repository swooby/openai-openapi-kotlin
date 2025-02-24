# openai-openapi-kotlin

**OpenAI OpenAPI Specification - Kotlin**

From https://github.com/openai/openai-openapi/blob/master/openapi.yaml

NOTES:
* There is https://github.com/openai/openai-java, which OpenAI describes as
  "The official Java library for the OpenAI API", but:
  1. That "official" library lags behind https://github.com/openai/openai-openapi/blob/master/openapi.yaml  
     For example, as of 2025/02/12 is is **STILL** lacking OpenAI's Realtime API (https://platform.openai.com/docs/api-reference/realtime), which is my main use case.
  2. `openai-java` is actually a nearly fully modernized Kotlin library, so the name
     `openai-java` is legacy;  
     it really should be named `openai-kotlin`.
* I was initially tempted to inflate this repo to contain multiple openapi-generator
  generated languages, but for now I am limiting it to Kotlin.
* openapi-generator has >4k open Issues:  
  https://github.com/OpenAPITools/openapi-generator/issues  
  So, no promises about the quality of its output.  
  Maybe one day I will open a PR to auto-generate some of the changes I made manually.

Requirements:
* OpenAPI Generator: https://openapi-generator.tech/docs/installation

Optional:
1. `curl -o openapi-YYYYMMDD.yaml https://raw.githubusercontent.com/openai/openai-openapi/refs/heads/master/openapi.yaml`

You don't have to do this.  
`openapi-generator` supports fetching the specification directly from a url.  
I prefer to save a snapshot of the specification that was used for the generation.

## Generate Whole OpenAI API
1. `time openapi-generator generate -i openapi-YYYYMMDD.yaml -g kotlin -o ./lib --skip-validate-spec --additional-properties=artifactId=openai-kotlin-client,artifactVersion=0.0.1,groupId=com.openai,packageName=com.openai`  
   (< 5 seconds on MacBook Pro M4 Pro)
2. `cp lib/build.gradle .`
3. `mv lib/gradle* lib/settings.gradle .`
4. `echo -e "\ninclude(\":lib\")" >> settings.gradle`
5. Edit `build.gradle` to be a project file and `lib/build.gradle` to be a module file.
6. `chmod +x ./gradlew`
7. `./gradlew build`  
(< 20 seconds on MacBook Pro M4 Pro to [eventually; see "Changes"] successfully compile from clean)

All of this is also shown in the `openai-kotlin-client.sh` file.

## Changes
At this point, the build will actually fail.  
I had to make some manual changes in order to get it to compile successfully:
1. AudioApi.kt:
   1. change `AudioResponseFormat? = json` to `AudioResponseFormat? = AudioResponseFormat.json`
   2. change `timestampGranularities?.value` to `timestampGranularities`
2. remove `data` (`data class ...`->`class ...`) in:
   1. CreateAssistantRequestToolResourcesFileSearch.kt
   2. CreateThreadRequestToolResourcesFileSearch.kt

This just got it to **COMPILE** successfully!

I had to make further changes in order to get it to **RUN** successfully.  

All of my changes can be seen at:  
https://github.com/swooby/openai-openapi-kotlin/pull/1/files

## Updates
When a new spec comes out:
1. Make sure to start from a fresh/stashed checkout.
2. `rm -r ./lib/src`
3. `curl -o openapi-YYYYMMDD.yaml https://raw.githubusercontent.com/openai/openai-openapi/refs/heads/master/openapi.yaml`
4. `openapi-generator generate -i openapi-YYYYMMDD.yaml -g kotlin -o ./lib --skip-validate-spec --additional-properties=artifactId=openai-kotlin-client,artifactVersion=0.0.1,groupId=com.openai,packageName=com.openai`
5. Fix generated gradle files:
   1. `mv lib/build.gradle lib/build.gradle.kts`
   2. `rm -f ./gradle && mv lib/gradle* .`
   3. `mv lib/settings.gradle ./settings.gradle.kts`
   4. Compare/Review with the settings.gradle and build.gradle files.
       1. `gradle*`: probably discard all changes
       2. `settings.gradle.kts`: probably discard all changes
       3. `lib/build.gradle.kts`: probably discard all changes
   5. While you are here, update any dependencies in `gradle/libs.versions.toml`
6. Consistently format all generated code with `./gradlew spotlessApply`
7. Fix generated code compiler errors:  
   TODO: Open an OpenAPI or OpenAI bug on these... 
   1. `apis/AudioApi`
      1. add/keep `AudioResponseFormat.json`
      2. add/keep `timestampGranularities?.value`
   2. `models/CreateAssistantRequestToolResourcesFileSearch`: keep non-data class  
      (compiler error to have data class with no constructor parameters)
   3. `models/CreateThreadRequestToolResourcesFileSearch`: keep non-data class  
      (compiler error to have data class with no constructor parameters)
8. Review each changed file, especially ones that show as modified in:  
   https://github.com/swooby/openai-openapi-kotlin/pull/1/files
   1. `apis` & `docs`: probably keep all changes
   2. `infrastructure`:
      1. `ApiClient.kt`: probably discard all changes
      2. `BigDecimalAdapter.kt`: probably discard all changes
      3. `BigIntegerAdapter.kt`: probably discard all changes
      4. `Serializer.kt`: probably discard all changes
   3. `models`: probably keep all changes except...
      1. `Realtime*` files:  
         (This can get a little complicated...)
         1. `RealtimeClientEvent*`: Keep all `type: RealtimeClientEvent*.Type = RealtimeClientEvent*.Type....` one-line assignments  
            These help a lot to simplify sending client events. 
         2. `RealtimeConversationItem`
            1. add/keep `in_progress` in nested `Status`; undocumented value comes from the server
         3. `RealtimeConversationItemContentInner`
            1. add/keep `audio` in nested `Type`; undocumented value comes from the server
         4. `RealtimeResponse`
            1. change/keep `maxOutputTokens` to type `RealtimeSessionMaxResponseOutputTokens`
            2. add/keep `in_progress` in nested `Status`; undocumented value comes from the server
         5. `RealtimeResponseCreateParams`
            1. change/keep `maxResponseOutputTokens` to type `RealtimeSessionMaxResponseOutputTokens`
         6. `RealtimeResponseCreateParamsConversation`
            1. add/keep `enum class ... auto, none ...`
         7. move `RealtimeResponseCreateParamsMaxResponseOutputTokens` to common `RealtimeSessionMaxResponseOutputTokens`  
            This empty class would cause a runtime deserialization exception.
         8. move `RealtimeResponseMaxOutputTokens` to common `RealtimeSessionMaxResponseOutputTokens`
            This empty class would cause a runtime deserialization exception.
         9. `RealtimeServerEventConversationItemCreated`
            1. add/keep nullable `previousItemId`; null value comes from the server
         10. `RealtimeServerEventInputAudioBufferCommitted`:
             1. add/keep nullable `previousItemId`; null value comes from the server
         11. `RealtimeSession`
             1. `model`
                1. add/keep javadoc
                2. change/keep type to `kotlin.String?` 
             2. change/keep `maxResponseOutputTokens` to type `RealtimeSessionMaxResponseOutputTokens`
         12. `RealtimeSessionCreateRequest`
             1. add/keep `@SerializeNull`
             2. change/keep `maxResponseOutputTokens` to type `RealtimeSessionMaxResponseOutputTokens`
             3. nested `enum class Model`
                1. change/keep javadoc
                2. change/keep `gpt-4o-realtime-preview ...` simplification;  
                   The generated names leave out `gpt-4o-`.
         13. `RealtimeSessionCreateRequestInputAudioTranscription`
             1. add/keep nested `enum class Model whisper-1 ...`
             2. change/keep `model` to nested `Model`
         14. `RealtimeSessionCreateRequestTurnDetection`
             1. add/keep nested `enum class Type server_vad ...`
             2. change/keep `type` to nested `Type` 
         15. `RealtimeSessionCreateResponse`
             1. change/keep `maxResponseOutputTokens` to type `RealtimeSessionMaxResponseOutputTokens`
         16. restore/reset/keep `RealtimeSessionMaxResponseOutputTokens` 
         16. delete `RealtimeSessionModel`  
             This empty class would cause a runtime deserialization exception.
   4. `test`: probably keep all changes except...
      1. revert `RealtimeResponseCreateParamsMaxResponseOutputTokensTest`  
         detected as a rename from `RealtimeSessionMaxResponseOutputTokensTest`
      2. delete `RealtimeResponseMaxOutputTokensTest`
      3. delete `RealtimeSessionModelTest`
