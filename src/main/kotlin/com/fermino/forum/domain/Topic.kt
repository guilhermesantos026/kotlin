package com.fermino.forum.domain

import java.time.LocalDateTime

data class Topic(
    val id: Long? = null,
    val title: String,
    val createdAt: LocalDateTime,
    val course: Course,
    val user: User,
    val status: StatusTopic = StatusTopic.NOT_ANSWERED,
    val answers: List<Answer>
)
