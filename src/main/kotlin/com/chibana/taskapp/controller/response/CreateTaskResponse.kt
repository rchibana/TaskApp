package com.chibana.taskapp.controller.response

import com.chibana.taskapp.model.StatusEnum
import java.time.LocalDate

data class CreateTaskResponse(
    var id: Long,
    var username: String,
    var title: String,
    var description: String,
    var status: StatusEnum,
    var dueDate: LocalDate,
    var createdDate: LocalDate
)
