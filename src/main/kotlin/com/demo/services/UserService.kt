package com.demo.services

import com.demo.models.CreateUserRequest
import com.demo.models.User
import com.demo.repositories.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {
    fun findAll(): Array<User> {
        return userRepository.findAll().toTypedArray()
    }
    fun save(user: CreateUserRequest): User {
        val newUser = User(username = user.username, email = user.email, picture = user.picture)
        return userRepository.save(newUser)
    }
}
