package com.egoriku.mokoresourcesissue

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform