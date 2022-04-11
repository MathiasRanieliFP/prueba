package com.academy.library.repositories

import com.academy.library.models.Book
import org.springframework.data.mongodb.repository.MongoRepository

interface BookRepository: MongoRepository<Book, String> {
}