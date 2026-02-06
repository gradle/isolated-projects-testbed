package com.awesomeapp.photoprofile

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.documentuser.Api328_6
import com.awesomeapp.mapuser.Api332_6
import com.awesomeapp.calendarprofile.Api372_6
import com.awesomeapp.groupprofile.Api360_6
import com.awesomeapp.feedprofile.Api352_6
import com.awesomeapp.accountprofile.Api364_6


@Singleton
class Repository388_5 @Inject constructor(
    private val api0: Api328_6,
    private val api1: Api332_6,
    private val api2: Api372_6,
    private val api3: Api360_6,
    private val api4: Api352_6,
    private val api5: Api364_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
            coroutineScope {
                val apis = listOf<suspend () -> String>(
                    { api0.fetchData() },
                        { api1.fetchData() },
                        { api2.fetchData() },
                        { api3.fetchData() },
                        { api4.fetchData() },
                        { api5.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}