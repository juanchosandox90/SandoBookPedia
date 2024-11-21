package com.sandobookpedia.book.presentation.book_detail

import com.sandobookpedia.book.domain.Book

sealed interface BookDetailAction {
    data object OnBackClick : BookDetailAction
    data object OnFavoriteClick : BookDetailAction
    data class OnSelectedBookChanged(val book: Book) : BookDetailAction
}