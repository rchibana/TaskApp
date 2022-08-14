package com.chibana.taskapp.service

import com.chibana.taskapp.model.StatusEnum
import com.chibana.taskapp.model.TaskEntity

interface TaskService {

    fun createTask(taskEntity: TaskEntity): TaskEntity

    fun getTasksByUsername(username: String, statusEnum: StatusEnum): List<TaskEntity>

    fun getTasksByUsername(username: String, statusEnumList: List<StatusEnum>): List<TaskEntity>

}