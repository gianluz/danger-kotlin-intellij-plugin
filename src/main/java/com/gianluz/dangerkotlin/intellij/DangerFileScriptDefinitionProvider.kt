package com.gianluz.dangerkotlin.intellij

import java.io.File
import kotlin.script.experimental.intellij.ScriptDefinitionsProvider

class DangerFileScriptDefinitionProvider : ScriptDefinitionsProvider {
    private companion object {
        private const val ID = "DangerFileScriptDefinition"
        private const val DANGERFILE_SCRIPT_DEFINITION = "com.danger.kotlin.kts.DangerFileScript"
    }

    override val id: String
        get() = ID

    override fun getDefinitionClasses(): Iterable<String> = listOf(
        DANGERFILE_SCRIPT_DEFINITION
    )

    override fun getDefinitionsClassPath(): Iterable<File> {
        return listOf(
            File("/usr/local/lib/danger/danger-kotlin.jar")
        )
    }

    override fun useDiscovery() = false
}
