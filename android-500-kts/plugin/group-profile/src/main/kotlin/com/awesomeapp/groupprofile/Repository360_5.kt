package com.awesomeapp.groupprofile

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.photoidentity.Api192_6
import com.awesomeapp.playlistidentity.Api196_6
import com.awesomeapp.logincart.Api248_6


@Singleton
class Repository360_5 @Inject constructor(
    private val api0: Api288_6,
    private val api1: Api276_6,
    private val api2: Api312_6,
    private val api3: Api212_6,
    private val api4: Api192_6,
    private val api5: Api196_6,
    private val api6: Api248_6
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