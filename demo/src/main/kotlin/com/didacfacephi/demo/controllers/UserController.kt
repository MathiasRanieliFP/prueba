package com.didacfacephi.demo.controllers

import com.didacfacephi.demo.models.User
import com.didacfacephi.demo.services.UserService
import com.didacfacephi.demo.utils.Constants
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping(Constants.URL.REQUESTMAPPING)
class UserController(
    @Autowired
    private val userService: UserService) {

    @GetMapping("/")
    fun getAllUsers(): ResponseEntity<List<User>> {
        return ResponseEntity.ok(this.userService.findAllUsers())
    }

    @GetMapping("/{id}")
    fun getUser(@PathVariable id: String): Optional<User> {
        return this.userService.findUserById(id)
    }

    @PostMapping("/")
    fun postUsers(@RequestBody user: User): ResponseEntity<User> {
        return ResponseEntity.ok(this.userService.postUser(user))
    }

    @PutMapping("/{id}")
    fun putUser(@PathVariable id: String, @RequestBody user: User): String {
        if (this.userService.comprobarSiElIdExiste(id)){
            this.userService.updateUser(id, user)
            return "Usuario updateado"
        } else{
            return "El id no existe"
        }
    }

    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable id: String): ResponseEntity<String> {
        this.userService.deleteUser(id)

        return ResponseEntity.ok(id)
    }
}
