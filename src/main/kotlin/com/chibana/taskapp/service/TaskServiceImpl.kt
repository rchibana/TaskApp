package com.chibana.taskapp.service

import com.chibana.taskapp.model.StatusEnum
import com.chibana.taskapp.model.TaskEntity
import com.chibana.taskapp.repository.TaskRepository
import org.springframework.stereotype.Service

@Service
class TaskServiceImpl(
    private val taskRepository: TaskRepository
) : TaskService {

    override fun createTask(taskEntity: TaskEntity): TaskEntity {
        return taskRepository.save(taskEntity)
    }

    override fun getTasksByUsername(username: String, statusEnum: StatusEnum): List<TaskEntity> {
        return taskRepository.findAllByUsernameAndStatusIn(username, listOf(statusEnum))
    }

    override fun getTasksByUsername(username: String, statusEnumList: List<StatusEnum>): List<TaskEntity> {
        return taskRepository.findAllByUsernameAndStatusIn(username, statusEnumList)
    }
}