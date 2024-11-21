package com.sandobookpedia.book.presentation.book_detail

import com.sandobookpedia.book.domain.Book

data class BookDetailState(
    val isLoading: Boolean = true,
    val isFavorite: Boolean = false,
    val book: Book? = null
)
