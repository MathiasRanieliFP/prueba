package com.didacfacephi.demo.controllers

import com.didacfacephi.demo.models.User
import com.didacfacephi.demo.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController(
    @Autowired
    private val userService: UserService) {

    @GetMapping("/")
    fun getAllUsers(): ResponseEntity<List<User>> {
        return ResponseEntity.ok(this.userService.findAll())
    }

    /*@GetMapping("/{id}")
    fun getUser(@PathVariable id: String): ResponseEntity<User> {
        return ResponseEntity.ok(this.userServices.findById(id).orElse(null))
    }

    @PostMapping("/")
    fun postUsers(@RequestBody user: User): ResponseEntity<User> {
        return ResponseEntity.ok(this.userServices.save(user))
    }

    @PutMapping("/{id}")
    fun putUser(@PathVariable id: String, @RequestBody user: User): ResponseEntity<User> {
        var oldUser = this.userServices.findById(id).orElse(null)

        oldUser.name = user.name
        oldUser.email = user.email
        oldUser.password = user.password

        return ResponseEntity.ok(this.userServices.save(user))
    }

    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable id: String): ResponseEntity<String> {
        this.userServices.deleteById(id)

        return ResponseEntity.ok(id)
    }*/
}