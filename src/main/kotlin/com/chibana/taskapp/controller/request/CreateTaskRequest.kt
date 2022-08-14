package com.chibana.taskapp.controller.request

import com.chibana.taskapp.model.StatusEnum
import java.time.LocalDate
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class CreateTaskRequest(

    @NotEmpty
    var username: String,

    @NotEmpty
    var title: String,

    var description: String? = "",

    var status: StatusEnum? = StatusEnum.TODO,

    @NotNull
    var dueDate: LocalDate
)
