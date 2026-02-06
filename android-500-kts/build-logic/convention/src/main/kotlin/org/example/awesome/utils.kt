package org.example.awesome


fun String.asProjectNameToNamespace(): String {
    return replace(":", "_").replace("-", "")
}