package io.github.iromul.commons.stdlib

import java.io.InputStream

fun ClassLoader.requireResourceAsStream(name: String): InputStream {
    return requireNotNull(getResourceAsStream(name)) { "Resource $name is required" }
}
