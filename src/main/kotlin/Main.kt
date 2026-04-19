package com.largradost

import java.io.InputStream

object AnimeDB {
    fun getDatabaseStream(): InputStream? {
        return javaClass.classLoader?.getResourceAsStream("animedb.json")
    }
}