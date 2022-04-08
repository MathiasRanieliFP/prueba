package com.didacfacephi.demo.services

import com.didacfacephi.demo.models.User
import java.util.*

interface IUserService {
    
    fun findAllUsers(): MutableList<User>
    fun findUserById(id: String): Optional<User>
    fun postUser(user: User): User
    fun updateUser(id: String, user: User): User
    fun deleteUser(id: String)
}