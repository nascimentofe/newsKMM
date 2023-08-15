package com.example.newskmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform