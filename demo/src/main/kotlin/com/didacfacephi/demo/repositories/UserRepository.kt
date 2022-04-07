package com.didacfacephi.demo.repositories


import com.didacfacephi.demo.models.User
import org.springframework.data.mongodb.repository.MongoRepository


interface UserRepository: MongoRepository<User, String> {
    
}