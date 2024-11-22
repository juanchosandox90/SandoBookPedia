package com.sandobookpedia.book.data

import com.sandobookpedia.book.data.mappers.toBook
import com.sandobookpedia.book.data.network.RemoteBookDataSource
import com.sandobookpedia.book.domain.Book
import com.sandobookpedia.book.domain.BookRepository
import com.sandobookpedia.core.domain.DataError
import com.sandobookpedia.core.domain.Result
import com.sandobookpedia.core.domain.map

class DefaultBookRepository(
    private val remoteBookDataSource: RemoteBookDataSource
) : BookRepository {
    override suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote> {
        return remoteBookDataSource
            .searchBooks(query).map { dto -> dto.results.map { it.toBook() } }
    }

    override suspend fun getBookDescription(bookId: String): Result<String?, DataError> {
        return remoteBookDataSource.getBookDetails(bookId).map { it.description }
    }
}