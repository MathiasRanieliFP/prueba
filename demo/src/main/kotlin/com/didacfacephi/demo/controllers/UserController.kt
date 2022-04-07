package com.didacfacephi.demo.controllers

import com.didacfacephi.demo.models.User
import com.didacfacephi.demo.repositories.UserRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController(private val userRepository: UserRepository) {

    @GetMapping("/")
    fun getAllUsers(): ResponseEntity<List<User>> {
        return ResponseEntity.ok(this.userRepository.findAll())
    }

    @GetMapping("/{id}")
    fun getUser(@PathVariable id: String): ResponseEntity<User> {
        return ResponseEntity.ok(this.userRepository.findById(id).orElse(null))
    }

    @PostMapping("/")
    fun postUsers(@RequestBody user: User): ResponseEntity<User> {
        return ResponseEntity.ok(this.userRepository.save(user))
    }

    @PutMapping("/{id}")
    fun putUser(@PathVariable id: String, @RequestBody user: User): ResponseEntity<User> {
        var oldUser = this.userRepository.findById(id).orElse(null)

        oldUser.name = user.name
        oldUser.email = user.email
        oldUser.password = user.password

        return ResponseEntity.ok(this.userRepository.save(user))
    }

    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable id: String): ResponseEntity<String> {
        this.userRepository.deleteById(id)

        return ResponseEntity.ok(id)
    }
}