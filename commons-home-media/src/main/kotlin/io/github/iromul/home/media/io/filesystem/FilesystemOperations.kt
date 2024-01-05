package io.github.iromul.home.media.io.filesystem

import java.io.File

interface FilesystemOperations {

    fun requireOrCreateDirectory(path: String): File
}