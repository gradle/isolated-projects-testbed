package com.awesomeapp.listprofile

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class Api380_6 @Inject constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api380_6 API"
    }
}