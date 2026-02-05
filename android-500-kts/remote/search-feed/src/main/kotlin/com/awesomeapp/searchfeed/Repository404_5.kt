package com.awesomeapp.searchfeed

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.eventuser.Api324_6
import com.awesomeapp.articleuser.Api336_6
import com.awesomeapp.checkoutprofile.Api348_6
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.mapuser.Api332_6
import com.awesomeapp.calendarprofile.Api372_6


@Singleton
class Repository404_5 @Inject constructor(
    private val api0: Api324_6,
    private val api1: Api336_6,
    private val api2: Api348_6,
    private val api3: Api320_6,
    private val api4: Api332_6,
    private val api5: Api372_6
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