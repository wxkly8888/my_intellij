package com.github.wxkly8888.myintellij.services

import com.intellij.openapi.project.Project
import com.github.wxkly8888.myintellij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
