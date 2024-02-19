"$SRCROOT/../gradlew" -p "$SRCROOT/../" :myresources:copyFrameworkResourcesToApp \
    -Pmoko.resources.PLATFORM=$PLATFORM_NAME \
    -Pmoko.resources.CONFIGURATION=$CONFIGURATION \
    -Pmoko.resources.BUILT_PRODUCTS_DIR=$BUILT_PRODUCTS_DIR \
    -Pmoko.resources.CONTENTS_FOLDER_PATH=$CONTENTS_FOLDER_PATH
