package com.example.demo.Dto

import java.time.LocalDateTime

data class SignUpDto(
    private var id: String,
    private var email: String,
    private var name: String,
    private var password: String,
    private var confirmPassword: String,
    private var phoneNumber: String,
    private var userType: String,
    private var createdAt: LocalDateTime,
    private var editedAt: LocalDateTime,
    private var lastLonginAt: LocalDateTime,
    private var token: String
)