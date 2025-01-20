# openai-openapi-kotlin

**OpenAI OpenAPI Specification - Kotlin**

From https://github.com/openai/openai-openapi/blob/master/openapi.yaml

NOTES:
* There is https://github.com/openai/openai-java, which OpenAI describes as
  "The official Java library for the OpenAI API", but:
  1. That "official" library lags behind https://github.com/openai/openai-openapi/blob/master/openapi.yaml  
     For example, it is lacking OpenAI's Realtime API (https://platform.openai.com/docs/api-reference/realtime), which is my main use case.
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
1. `curl -o openapi.yaml https://raw.githubusercontent.com/openai/openai-openapi/refs/heads/master/openapi.yaml`

You don't have to do this.  
`openapi-generator` supports fetching the specification directly from a url.  
I prefer to save a snapshot of the specification that was used for the generation.

## Generate Whole OpenAI API
1. `time openapi-generator generate -i openapi.yaml -g kotlin  -o ./lib --skip-validate-spec --additional-properties=artifactId=openai-kotlin-client,artifactVersion=0.0.1,groupId=com.openai,packageName=com.openai`  
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
