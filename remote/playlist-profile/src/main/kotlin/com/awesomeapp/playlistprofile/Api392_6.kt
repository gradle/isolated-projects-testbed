package com.awesomeapp.playlistprofile

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class Api392_6 @Inject constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api392_6 API"
    }
}