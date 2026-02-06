package com.awesomeapp.newsprofile

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class Api384_6 @Inject constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api384_6 API"
    }
}