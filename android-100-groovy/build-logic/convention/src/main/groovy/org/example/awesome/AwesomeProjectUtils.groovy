package org.example.awesome

class AwesomeProjectUtils {
    static String asProjectNameToNamespace(String name) {
        AwesomeStringUtils.trim(name)
                .replace(":", "_")
                .replace("-", "")
    }
}
