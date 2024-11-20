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
import com.sandobookpedia.book.presentation.book_list.books
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


@Preview
@Composable
private fun BookListPreview(){
    BookList(
        books = books,
        onBookClick = {},
        modifier = Modifier
    )
}

@Preview
@Composable
private fun BookListItemPreview(){
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