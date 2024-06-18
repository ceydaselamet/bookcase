package com.bookcase.libraryservice.model

import jakarta.persistence.Column
import jakarta.persistence.ElementCollection
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import org.hibernate.annotations.GenericGenerator

import java.util.ArrayList


@Entity
data class Library @JvmOverloads constructor(
    @Id
    @Column(name = "library_id")
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    val id: String? = "",

    @ElementCollection
    val userBook: List<String> = ArrayList()
)
