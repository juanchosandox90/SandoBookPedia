package com.sandobookpedia.di

import com.sandobookpedia.book.data.DefaultBookRepository
import com.sandobookpedia.book.data.network.KtorRemoteBookDataSource
import com.sandobookpedia.book.data.network.RemoteBookDataSource
import com.sandobookpedia.book.domain.BookRepository
import com.sandobookpedia.book.presentation.SelectedBookViewModel
import com.sandobookpedia.book.presentation.book_list.BookListViewModel
import com.sandobookpedia.core.data.HttpClientFactory
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {
    single { HttpClientFactory.create(get()) }
    singleOf(::KtorRemoteBookDataSource).bind<RemoteBookDataSource>()
    singleOf(::DefaultBookRepository).bind<BookRepository>()

    viewModelOf(::BookListViewModel)
    viewModelOf(::SelectedBookViewModel)

}