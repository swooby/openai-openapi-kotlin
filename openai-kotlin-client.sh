# https://openapi-generator.tech/docs/generators/kotlin/

if [ -z "$1" ]; then
    echo "Error: OpenAPI specification file is required"
    echo "Usage: $0 openapi-YYYYMMDD.yaml"
    exit 1
fi

time \
openapi-generator generate -i "$1" -g kotlin  -o ./lib --skip-validate-spec \
--additional-properties=\
artifactId=openai-kotlin-client,\
artifactVersion=0.0.1,\
groupId=com.openai,\
packageName=com.openai

cd ./lib
chmod +x ./gradlew
# will fail until generated code is fixed...
#./gradlew build

# Fixes (to get `./gradlew build` to succeed):
# 1. AudioApi.kt:
#   1. change `AudioResponseFormat? = json` to `AudioResponseFormat? = AudioResponseFormat.json`
#   2. change `timestampGranularities?.value` to `timestampGranularities`
# 2. replace a couple of `data class Foo() {}` with `class Foo`
