package com.awesomeapp.timerfeed

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.profilefeed.Api400_6
import com.awesomeapp.photoprofile.Api388_6
import com.awesomeapp.listprofile.Api380_6


@Singleton
class Repository424_5 @Inject constructor(
    private val api0: Api400_6,
    private val api1: Api388_6,
    private val api2: Api380_6
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