package com.awesomeapp.feedprofile

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.mediacart.Api292_6
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.forecastcheckout.Api236_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.playlistidentity.Api196_6


@Singleton
class Repository352_5 @Inject constructor(
    private val api0: Api288_6,
    private val api1: Api292_6,
    private val api2: Api224_6,
    private val api3: Api236_6,
    private val api4: Api260_6,
    private val api5: Api196_6
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