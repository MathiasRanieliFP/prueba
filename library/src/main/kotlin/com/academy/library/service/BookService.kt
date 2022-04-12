package com.academy.library.service

import com.academy.library.models.Book
import com.academy.library.repositories.BookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.security.SecurityProperties.User
import org.springframework.stereotype.Service
import java.util.*

@Service
class BookService(
    @Autowired(required = true)
    private val bookRepository: BookRepository
): IBookService {


    //IBookService
    override fun getAllBooks(): MutableList<Book> {
        return this.bookRepository.findAll()
    }

    override fun getBookById(id: String): Optional<Book> {
        return this.bookRepository.findById(id)
    }

    override fun addBook(book: Book): Book {
        book._id = null
        return this.bookRepository.save(book)
    }

    override fun updateBook(id: String, book: Book) {
        TODO("Not yet implemented")
    }

    override fun deleteBook(id: String) {
        return this.bookRepository.deleteById(id)
    }

}