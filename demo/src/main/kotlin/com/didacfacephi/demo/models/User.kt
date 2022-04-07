package com.didacfacephi.demo.models

import org.springframework.beans.factory.annotation.Value
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class User(
    @Id
    var id: String ="",
    var name: String="",
    var email: String="",
    var password: String=""
)