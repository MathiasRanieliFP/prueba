package com.didacfacephi.demo.services

import com.didacfacephi.demo.models.User
import com.didacfacephi.demo.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService(
    @Autowired
    private val userRepository: UserRepository) {

    fun findAll(): List<User> {
        var lista = userRepository.findAll()
        println(lista)
        return lista
    }

    //fun postUser
}