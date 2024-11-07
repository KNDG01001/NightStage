package com.example.demo.Entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Data
import lombok.NoArgsConstructor
import java.time.LocalDateTime


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="user")
class UserEntity {
    @Id
    private lateinit var id: String
    private lateinit var email: String
    private lateinit var password: String
    private lateinit var name: String
    private lateinit var phoneNumber: String
    private lateinit var userType: String
    private lateinit var token: String
    private lateinit var createdAt: LocalDateTime
    private lateinit var lastLonginAt: LocalDateTime
}