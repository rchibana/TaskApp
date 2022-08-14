package com.chibana.taskapp.repository

import com.chibana.taskapp.model.StatusEnum
import com.chibana.taskapp.model.TaskEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface TaskRepository: CrudRepository<TaskEntity, Long> {

    fun findAllByUsernameAndStatusIn(username: String, statusList: List<StatusEnum>): List<TaskEntity>

}