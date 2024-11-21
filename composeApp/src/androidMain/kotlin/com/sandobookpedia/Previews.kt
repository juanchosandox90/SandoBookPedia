package com.sandobookpedia

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.sandobookpedia.book.domain.Book
import com.sandobookpedia.book.presentation.book_list.BookListScreen
import com.sandobookpedia.book.presentation.book_list.BookListState
import com.sandobookpedia.book.presentation.book_list.components.BookList
import com.sandobookpedia.book.presentation.book_list.components.BookListItem
import com.sandobookpedia.book.presentation.book_list.components.BookSearchBar

@Preview
@Composable
private fun BookSearchBarPreview() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        BookSearchBar(
            searchQuery = "",
            onSearchQueryChange = {},
            onImeSearch = {},
            modifier = Modifier.fillMaxWidth()
        )
    }
}


private val books = (1..100).map {
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

@Preview
@Composable
private fun BookListPreview() {
    BookList(
        books = books,
        onBookClick = {},
        modifier = Modifier
    )
}

@Preview
@Composable
private fun BookListItemPreview() {
    BookListItem(
        book = books.first(),
        onClick = {},
        modifier = Modifier
    )
}

@Preview
@Composable
private fun BookListScreenPreview() {
    BookListScreen(
        state = BookListState(
            searchResults = books
        ),
        onAction = {}
    )
}