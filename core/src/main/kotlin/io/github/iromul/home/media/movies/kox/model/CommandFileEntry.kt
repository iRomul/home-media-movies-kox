package io.github.iromul.home.media.movies.kox.model

interface CommandFileEntry {

    val filename: String?
    val from: String?
    val source: String?
    val type: String?
}

interface CommandFileSource {

    val name: String?
    val path: String?
}

interface CommandFileTarget {

    val name: String?
    val type: String?
    val path: String?
}

interface CommandFile {

    val command: String?
    val root: String?
    val sources: List<CommandFileSource>?
    val targets: List<CommandFileTarget>?
    val files: List<CommandFileEntry>?
}