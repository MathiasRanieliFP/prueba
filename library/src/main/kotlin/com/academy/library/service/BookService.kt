package com.academy.library.service

import com.academy.library.models.Book
import com.academy.library.repositories.BookRepository
import org.springframework.beans.factory.annotation.Autowired

class BookService(
    @Autowired
    bookRepository: BookRepository
): IBookService {


    //IBookService
    override fun getAllBooks(): MutableList<Book> {
        TODO("Not yet implemented")
    }

    override fun getBookById(id: String) {
        TODO("Not yet implemented")
    }

    override fun addBook(book: Book) {
        TODO("Not yet implemented")
    }

    override fun updateBook(id: String, book: Book) {
        TODO("Not yet implemented")
    }

    override fun deleteBook(id: String) {
        TODO("Not yet implemented")
    }

}