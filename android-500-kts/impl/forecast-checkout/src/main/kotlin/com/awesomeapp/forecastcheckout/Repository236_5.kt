package com.awesomeapp.forecastcheckout

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.logidentity.Api172_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.maplogin.Api136_6


@Singleton
class Repository236_5 @Inject constructor(
    private val api0: Api172_6,
    private val api1: Api148_6,
    private val api2: Api160_6,
    private val api3: Api136_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
            coroutineScope {
                val apis = listOf<suspend () -> String>(
                    { api0.fetchData() },
                        { api1.fetchData() },
                        { api2.fetchData() },
                        { api3.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}