package com.academy.library.controller

import com.academy.library.models.Book
import com.academy.library.repositories.BookRepository
import com.academy.library.service.BookService
import com.academy.library.utils.Constants
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping(Constants.URLS.REQUESTMAPPING)
class BookController(
    @Autowired
    private val bookService: BookService) {

    @GetMapping(Constants.URLS.GETALLBOOKS)
    fun getAllBooks(): MutableList<Book> {
        return this.bookService.getAllBooks()
    }

    @GetMapping(Constants.URLS.GETBOOKBYID)
    fun getBookById(@PathVariable id: String): Optional<Book> {
        return this.bookService.getBookById(id)
    }

    @PostMapping(Constants.URLS.POSTBOOK)
    fun postBook(@RequestBody book: Book): Book {
        return this.bookService.addBook(book)
    }

    @DeleteMapping(Constants.URLS.DELETEBOOK)
    fun deleteBook(@PathVariable id: String){
        return this.bookService.deleteBook(id)
    }
}