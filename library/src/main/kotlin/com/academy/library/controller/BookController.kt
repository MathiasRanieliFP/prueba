package com.academy.library.controller

import com.academy.library.models.Book
import com.academy.library.repositories.BookRepository
import com.academy.library.service.BookService
import com.academy.library.utils.Constants
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping(Constants.REQUESTMAPPING)
class BookController(
    @Autowired
    private val bookService: BookService) {

    @GetMapping(Constants.GETALLBOOKS)
    fun getAllBooks(): ResponseEntity<Any> {
        return ResponseEntity.ok(this.bookService.getAllBooks())
    }

    @GetMapping(Constants.GETBOOKBYID)
    fun getBookById(@PathVariable id: String): ResponseEntity<Any> {

        return ResponseEntity.ok(this.bookService.getBookById(id).orElse(null))
    }

    @PostMapping(Constants.POSTBOOK)
    fun postBook(@RequestBody book: Book): ResponseEntity<Any> {
        return ResponseEntity.ok(this.bookService.addBook(book))
    }

    @PutMapping(Constants.UPDATEBOOK)
    fun updateBook(@PathVariable id: String, @RequestBody book: Book): ResponseEntity<Any> {
        return ResponseEntity.ok(this.bookService.updateBook(id, book))
    }

    @DeleteMapping(Constants.DELETEBOOK)
    fun deleteBook(@PathVariable id: String): ResponseEntity<Any> {
        return ResponseEntity.ok(this.bookService.deleteBook(id))
    }
}