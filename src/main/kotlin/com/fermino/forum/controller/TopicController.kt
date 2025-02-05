package com.fermino.forum.controller

import com.fermino.forum.domain.Topic
import com.fermino.forum.service.TopicService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestBody

@RestController
@RequestMapping("/topics")
class TopicController (private val topicService: TopicService) {

    @PostMapping
    fun create(@RequestBody topic: Topic){
        topicService.create(topic)
    }

    @GetMapping
    fun findAll(): List<Topic> {
        return topicService.findAll()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): Topic {
        return topicService.findById(id)
    }
}