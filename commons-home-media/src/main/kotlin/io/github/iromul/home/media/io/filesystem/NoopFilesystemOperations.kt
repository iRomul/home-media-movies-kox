package io.github.iromul.home.media.io.filesystem

import io.github.oshai.kotlinlogging.KotlinLogging
import java.io.File

private val logger = KotlinLogging.logger {}

object NoopFilesystemOperations : FilesystemOperations {

    override fun requireOrCreateDirectory(path: String): File {
        logger.info { "requireOrCreateDirectory: $path" }

        return File("")
    }
}