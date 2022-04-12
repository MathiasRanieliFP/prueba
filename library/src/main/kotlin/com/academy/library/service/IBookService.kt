package com.academy.library.service

import com.academy.library.models.Book
import org.springframework.boot.autoconfigure.security.SecurityProperties.User
import java.util.Optional

interface IBookService {
    fun getAllBooks(): MutableList<Book>

    fun getBookById(id: String): Optional<Book>

    fun addBook(book: Book): Book

    fun updateBook(id: String, book: Book)

    fun deleteBook(id: String)
}