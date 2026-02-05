package com.awesomeapp.postcart

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.accountidentity.Api168_6
import com.awesomeapp.maplogin.Api136_6


@Singleton
class Repository256_5 @Inject constructor(
    private val api0: Api156_6,
    private val api1: Api168_6,
    private val api2: Api136_6
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