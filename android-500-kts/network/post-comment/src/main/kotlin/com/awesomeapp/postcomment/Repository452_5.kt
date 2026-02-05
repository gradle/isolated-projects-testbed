package com.awesomeapp.postcomment

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.forecastfeed.Api432_6
import com.awesomeapp.videofeed.Api436_6
import com.awesomeapp.audiofeed.Api440_6


@Singleton
class Repository452_5 @Inject constructor(
    private val api0: Api432_6,
    private val api1: Api436_6,
    private val api2: Api440_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
            coroutineScope {
                val apis = listOf<suspend () -> String>(
                    { api0.fetchData() },
                        { api1.fetchData() },
                        { api2.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}