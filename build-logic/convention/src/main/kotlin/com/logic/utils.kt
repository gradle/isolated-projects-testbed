package com.logic


fun String.asProjectNameToNamespace(): String {
    return replace(":", "_").replace("-", "")
}