package com.fermino.forum.domain

import java.time.LocalDateTime

data class Answer (
    val id: Long? = null,
    val message: String,
    val createdAt: LocalDateTime,
    val user: User,
    val topic: Topic,
    val solution: Boolean
)
