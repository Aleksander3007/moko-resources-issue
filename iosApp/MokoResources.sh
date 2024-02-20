"$SRCROOT/../gradlew" -p "$SRCROOT/../" :myresources:copyPodFrameworkResourcesToApp \
    -Pmoko.resources.BUILT_PRODUCTS_DIR="$BUILT_PRODUCTS_DIR" \
    -Pmoko.resources.CONTENTS_FOLDER_PATH="$CONTENTS_FOLDER_PATH" \
    -Pkotlin.native.cocoapods.platform="$PLATFORM_NAME" \
    -Pkotlin.native.cocoapods.archs="$ARCHS" \
    -Pkotlin.native.cocoapods.configuration="$CONFIGURATION"
