package com.github.libbylg.qmakeclion.services

import com.github.libbylg.qmakeclion.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
