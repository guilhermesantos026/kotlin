package com.study.kotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Hello {

    @GetMapping("/")
    fun hello(){
        println("Hello")
    }
}