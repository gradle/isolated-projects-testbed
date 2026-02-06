package com.awesomeapp.articleuser

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.synccart.Api260_6


@Singleton
class Repository336_5 @Inject constructor(
    private val api0: Api252_6,
    private val api1: Api208_6,
    private val api2: Api268_6,
    private val api3: Api240_6,
    private val api4: Api304_6,
    private val api5: Api256_6,
    private val api6: Api232_6,
    private val api7: Api260_6
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
                        { api6.fetchData() },
                        { api7.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}