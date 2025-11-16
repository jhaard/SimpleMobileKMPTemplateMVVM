package org.jhaard.simplekmptemplatemvvm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform