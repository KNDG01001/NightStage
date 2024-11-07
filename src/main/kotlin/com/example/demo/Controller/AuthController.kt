package com.example.demo.Controller

import com.example.demo.Dto.ResponseDto
import com.example.demo.Dto.SignUpDto
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin(origins = ["http://localhost:3000"])
@RequestMapping("/api/auth")
class AuthController {
    @PostMapping("/signUp")
    fun signUp(@RequestBody requestBody: SignUpDto): ResponseDto<SignUpDto>?{
        println(requestBody.toString())
        return null
    }
}