package com.academy.library.service

import com.academy.library.models.Book
import com.academy.library.repositories.BookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.security.SecurityProperties.User
import org.springframework.stereotype.Service
import java.time.LocalDate
import java.util.*

@Service
class BookService(
    @Autowired
    private val bookRepository: BookRepository
) : IBookService {

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

    override fun updateBook(id: String, book: Book): Book {
        val oldBook: Book = this.bookRepository.findById(id).orElse(null)

        with(oldBook) {
            titulo = book.titulo
            isbn = book.isbn
            resumen = book.resumen
            fechaDeCreacion = book.fechaDeCreacion
            fechaDePublicacion = book.fechaDePublicacion
            autor = book.autor
            editorial = book.editorial
            urlPdf = book.urlPdf
            imgPortada = book.imgPortada
            categoria = book.categoria
            idioma = book.idioma
            valoracion = book.valoracion
        }
        
        return this.bookRepository.save(oldBook)
    }

    override fun deleteBook(id: String) {
        return this.bookRepository.deleteById(id)
    }
}