package com.awesomeapp.cartlogin

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.podcastcontact.Api92_6
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.weathercontact.Api88_6
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.notecontact.Api84_6


@Singleton
class Repository104_5 @Inject constructor(
    private val api0: Api92_6,
    private val api1: Api80_6,
    private val api2: Api88_6,
    private val api3: Api76_6,
    private val api4: Api84_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
            coroutineScope {
                val apis = listOf<suspend () -> String>(
                    { api0.fetchData() },
                        { api1.fetchData() },
                        { api2.fetchData() },
                        { api3.fetchData() },
                        { api4.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}