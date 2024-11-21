package com.sandobookpedia.app

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.sandobookpedia.book.data.DefaultBookRepository
import com.sandobookpedia.book.data.network.KtorRemoteBookDataSource
import com.sandobookpedia.book.presentation.book_list.BookListScreenRot
import com.sandobookpedia.book.presentation.book_list.BookListViewModel
import com.sandobookpedia.core.data.HttpClientFactory
import io.ktor.client.engine.HttpClientEngine
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App(engine: HttpClientEngine) {
    MaterialTheme {
        BookListScreenRot(
            viewModel = remember {
                BookListViewModel(
                    bookRepository = DefaultBookRepository(
                        remoteBookDataSource = KtorRemoteBookDataSource(
                            httpClient = HttpClientFactory.create(
                                engine = engine
                            )
                        )
                    )
                )
            },
            onBookClick = {}
        )
    }
}