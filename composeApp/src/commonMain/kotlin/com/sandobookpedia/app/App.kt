package com.sandobookpedia.app

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.sandobookpedia.book.presentation.book_list.BookListScreenRot
import com.sandobookpedia.book.presentation.book_list.BookListViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        BookListScreenRot(
            viewModel = remember { BookListViewModel() },
            onBookClick = {}
        )
    }
}