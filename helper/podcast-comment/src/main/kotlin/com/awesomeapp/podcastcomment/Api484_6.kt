package com.awesomeapp.podcastcomment

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class Api484_6 @Inject constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api484_6 API"
    }
}