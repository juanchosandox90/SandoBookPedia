package com.sandobookpedia.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform