package com.github.javadmoradii.test.services

import com.intellij.openapi.project.Project
import com.github.javadmoradii.test.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
