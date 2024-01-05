package io.github.iromul.commons.snakeyaml

import org.yaml.snakeyaml.Yaml
import org.yaml.snakeyaml.constructor.Constructor
import java.io.InputStream

inline fun <reified T> Yaml.loadAs(input: InputStream): T {
    return loadAs(input, T::class.java)
}

//inline fun <reified T> yamlConstructor(): Constructor {
//    return Constructor(T::class.java)
//}