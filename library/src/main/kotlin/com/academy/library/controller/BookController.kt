package com.academy.library.controller

import com.academy.library.repositories.BookRepository
import com.academy.library.service.BookService
import com.academy.library.utils.Constants
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(Constants.URLS.REQUESTMAPPING)
class BookController(
    @Autowired
    private val bookService: BookService) {


}