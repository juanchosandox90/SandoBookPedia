package com.sandobookpedia.book.domain

import com.sandobookpedia.core.domain.DataError
import com.sandobookpedia.core.domain.Result

interface BookRepository {
    suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote>
}