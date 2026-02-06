package com.awesomeapp.profilefeed

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.pushprofile.Api344_6
import com.awesomeapp.mapuser.Api332_6
import com.awesomeapp.groupprofile.Api360_6


@Singleton
class Repository400_5 @Inject constructor(
    private val api0: Api344_6,
    private val api1: Api332_6,
    private val api2: Api360_6
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