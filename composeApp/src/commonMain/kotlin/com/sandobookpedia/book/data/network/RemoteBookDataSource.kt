package com.sandobookpedia.book.data.network

import com.sandobookpedia.book.data.dto.BookWorkDto
import com.sandobookpedia.book.data.dto.SearchResponseDto
import com.sandobookpedia.core.domain.DataError
import com.sandobookpedia.core.domain.Result

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null
    ): Result<SearchResponseDto, DataError.Remote>

    suspend fun getBookDetails(bookWorkId: String): Result<BookWorkDto, DataError.Remote>
}