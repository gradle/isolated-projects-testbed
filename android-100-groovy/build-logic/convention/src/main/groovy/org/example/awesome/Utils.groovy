package org.example.awesome

class Utils {
    static String asProjectNameToNamespace(String name) {
        name.replace(":", "_").replace("-", "")
    }
}
