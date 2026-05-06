package com.awesomeapp.synccontact

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.usercontact.Api56_6


@Singleton
class Repository64_5 @Inject constructor(
    private val api0: Api60_6,
    private val api1: Api40_6,
    private val api2: Api56_6
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