package com.demo.controllers

import com.demo.models.CreateUserRequest
import com.demo.models.User
import com.demo.services.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/users")
class UserController(private val userService: UserService) {

    @GetMapping
    fun index(): Array<User> {
        return userService.findAll()
    }

    @PostMapping
    fun saveuser(@RequestBody user: CreateUserRequest): User {
        return userService.save(user)
    }
}
