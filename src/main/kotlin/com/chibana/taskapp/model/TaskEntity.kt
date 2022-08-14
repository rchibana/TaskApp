package com.chibana.taskapp.model

import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "tasks")
data class TaskEntity(

    @Id
    @Column(name = "id", updatable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long,

    @Column(name = "username")
    var username: String,

    @Column(name = "title")
    var title: String,

    @Column(name = "description")
    var description: String,

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    var status: StatusEnum,

    @Column(name = "due_date")
    var dueDate: LocalDate,

    @Column(name = "created_date")
    var createdDate: LocalDate,

    @Column(name = "updated_date")
    var updatedDate: LocalDate


)
