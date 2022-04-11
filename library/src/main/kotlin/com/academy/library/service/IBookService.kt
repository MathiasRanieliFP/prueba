package com.academy.library.service

import com.academy.library.models.Book

interface IBookService {
    fun getAllBooks(): MutableList<Book>

    fun getBookById(id: String)

    fun addBook(book: Book)

    fun updateBook(id: String, book: Book)

    fun deleteBook(id: String)
}