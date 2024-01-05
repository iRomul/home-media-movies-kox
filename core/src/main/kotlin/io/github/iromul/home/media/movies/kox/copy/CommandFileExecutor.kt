package io.github.iromul.home.media.movies.kox.copy

import io.github.iromul.home.media.io.filesystem.FilesystemOperations
import io.github.iromul.home.media.movies.kox.model.CommandFile

class CommandFileExecutor(
    private val filesystemOperations: FilesystemOperations
) {

    fun exec(commandFile: CommandFile) {
        commandFile.targets?.forEach {
            filesystemOperations.requireOrCreateDirectory(it.path!!)
        }
    }
}