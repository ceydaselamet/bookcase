package com.bookcase.libraryservice.dto

data class AddBookRequest @JvmOverloads constructor(
    val id: String,
    val isbn: String
)
