package com.didacfacephi.demo.services

import com.didacfacephi.demo.models.User
import com.didacfacephi.demo.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService(
    @Autowired
    private val userRepository: UserRepository
) : IUserService {

    fun comprobarSiElIdExiste(id: String): Boolean {
        try {
            val oldUser: User = this.userRepository.findById(id).orElse(null)
            return true
        } catch (e: java.lang.NullPointerException) {
            return false
        }
    }

    //IUserService
    override fun findAllUsers(): MutableList<User> {
        var lista = this.userRepository.findAll()
        println(lista)
        return lista
    }

    override fun findUserById(id: String): Optional<User> {
        var user = this.userRepository.findById(id)

        //println(user)

        return user
    }

    override fun postUser(user: User): User {
        user._id = null
        return this.userRepository.save(user)
    }

    override fun updateUser(id: String, user: User): User {
        val oldUser: User = this.userRepository.findById(id).orElse(null)

        oldUser.name = user.name
        oldUser.email = user.email
        oldUser.password = user.password

        return this.userRepository.save(oldUser)

    }

    override fun deleteUser(id: String) {
        this.userRepository.deleteById(id)
    }
}