package com.fermino.forum.service

import com.fermino.forum.domain.Topic
import org.springframework.stereotype.Service

@Service
class TopicService (var topics: List<Topic> = ArrayList()) {

    fun create(topic: Topic) {
        topics += topic
    }
}
