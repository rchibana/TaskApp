package com.chibana.taskapp.controller

import com.chibana.taskapp.controller.request.CreateTaskRequest
import com.chibana.taskapp.controller.response.CreateTaskResponse
import com.chibana.taskapp.mapper.TaskMapper
import com.chibana.taskapp.service.TaskService
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/tasks")
@Validated
class TaskController(
    private val taskServiceImpl: TaskService,
    private val taskMapper: TaskMapper
) {

    @PostMapping
    fun createTask(@Valid @RequestBody createTaskRequest: CreateTaskRequest): ResponseEntity<CreateTaskResponse> {
        return taskMapper.toEntity(createTaskRequest).let {
            taskServiceImpl.createTask(it)
        }.let {
            taskMapper.toResponse(it)
        }.let {
            ResponseEntity.ok(it)
        }
    }

}