package com.chibana.taskapp.mapper

import com.chibana.taskapp.controller.request.CreateTaskRequest
import com.chibana.taskapp.controller.response.CreateTaskResponse
import com.chibana.taskapp.model.TaskEntity
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.MappingConstants
import org.mapstruct.Mappings

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
interface TaskMapper {

    @Mappings(
        Mapping(target = "id", ignore = true),
        Mapping(target = "createdDate", ignore = true),
        Mapping(target = "updatedDate", ignore = true)
    )
    fun toEntity(createTaskRequest: CreateTaskRequest): TaskEntity

    fun toResponse(taskEntity: TaskEntity): CreateTaskResponse

}