package com.academy.library.models

import com.academy.library.utils.Constants
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.Date

@Document(collection = Constants.DBBOOK)
data class Book (
    @Id
    var _id: String?,
    var titulo: String,
    var isbn: String,
    var resumen: String,
    var fechaDeCreacion: Date,
    var fechaDePublicacion: Date?,
    var autor: String,
    var editorial: String,
    var urlPdf: String,
    var imgPortada: String,
    var categoria: String,
    var idioma: String,
    var valoracion: Double

    )