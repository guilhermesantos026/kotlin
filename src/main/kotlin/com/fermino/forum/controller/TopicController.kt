package com.fermino.forum.controller

import com.fermino.forum.domain.Topic
import com.fermino.forum.service.TopicService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/topics")
class TopicController (private val topicService: TopicService) {

    @PostMapping
    fun create(@RequestBody topic: Topic){
        topicService.create(topic)
    }
}