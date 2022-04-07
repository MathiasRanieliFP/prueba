package com.example.api.repositories

import org.springframework.data.mongodb.repository.MongoRepository
import com.example.api.models.User


interface UserRepository : MongoRepository<User, String> {
}