package com.sandobookpedia.app

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.sandobookpedia.book.presentation.book_list.BookListScreenRot
import com.sandobookpedia.book.presentation.book_list.BookListViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel

@Composable
@Preview
fun App() {
    MaterialTheme {
        val viewModel = koinViewModel<BookListViewModel>()
        BookListScreenRot(
            viewModel = viewModel,
            onBookClick = {}
        )
    }
}