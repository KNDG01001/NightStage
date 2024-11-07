package com.example.demo.Controller

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin(origins=["http://localhost:3000"])
@RequestMapping("/")
class MainController {
    @GetMapping("check")
    fun check():String{
        return "Success"
    }
}