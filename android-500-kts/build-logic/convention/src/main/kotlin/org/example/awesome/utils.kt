package org.example.awesome


fun String.asProjectNameToNamespace(): String {
    return AwesomeStringUtils.trim(this).replace(":", "_").replace("-", "")
}
