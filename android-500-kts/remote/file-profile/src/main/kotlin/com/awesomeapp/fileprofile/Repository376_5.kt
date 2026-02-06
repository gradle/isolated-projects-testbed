package com.awesomeapp.fileprofile

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.calendarprofile.Api372_6
import com.awesomeapp.feedprofile.Api352_6
import com.awesomeapp.mapuser.Api332_6
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.logprofile.Api368_6
import com.awesomeapp.sessionuser.Api316_6
import com.awesomeapp.galleryuser.Api340_6


@Singleton
class Repository376_5 @Inject constructor(
    private val api0: Api372_6,
    private val api1: Api352_6,
    private val api2: Api332_6,
    private val api3: Api320_6,
    private val api4: Api368_6,
    private val api5: Api316_6,
    private val api6: Api340_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
            coroutineScope {
                val apis = listOf<suspend () -> String>(
                    { api0.fetchData() },
                        { api1.fetchData() },
                        { api2.fetchData() },
                        { api3.fetchData() },
                        { api4.fetchData() },
                        { api5.fetchData() },
                        { api6.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}