package com.chibana.taskapp.service

import com.chibana.taskapp.model.StatusEnum
import com.chibana.taskapp.model.TaskEntity
import org.springframework.stereotype.Service

@Service
class TaskServiceImpl : TaskService {
    override fun createTask(taskEntity: TaskEntity): TaskEntity {
        TODO("Not yet implemented")
    }

    override fun getTasksByUsername(username: String, statusEnum: StatusEnum): List<TaskEntity> {
        TODO("Not yet implemented")
    }

    override fun getTasksByUsername(username: String, statusEnumList: List<StatusEnum>): List<TaskEntity> {
        TODO("Not yet implemented")
    }
}