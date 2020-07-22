package com.github.shisya233.golanderrcompletion.services

import com.intellij.openapi.project.Project
import com.github.shisya233.golanderrcompletion.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
