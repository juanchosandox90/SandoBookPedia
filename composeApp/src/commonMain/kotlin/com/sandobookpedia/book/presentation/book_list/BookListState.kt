package com.sandobookpedia.book.presentation.book_list

import com.sandobookpedia.book.domain.Book
import com.sandobookpedia.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResults: List<Book> = books,
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)

val books = (1..100).map {
    Book(
        id = it.toString(),
        title = "Book $it",
        imageUrl = "https://storage.googleapis.com/drive-explorer/4101/0ABQ3r6e4rbrlUk9PVA/Captura%20de%20pantalla%202024-11-19%20a%20la(s)%2010.54.38%E2%80%AFp.m..png",
        authors = listOf("Philipp Lackner"),
        description = "Description $it",
        languages = emptyList(),
        firstPublishYear = null,
        averageRating = 4.67854,
        ratingCount = 5,
        numPages = 100,
        numEditions = 3
    )
}
