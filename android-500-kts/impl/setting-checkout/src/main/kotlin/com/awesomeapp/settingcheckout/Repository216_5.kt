package com.awesomeapp.settingcheckout

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.groupidentity.Api164_6
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.checkoutidentity.Api152_6


@Singleton
class Repository216_5 @Inject constructor(
    private val api0: Api132_6,
    private val api1: Api160_6,
    private val api2: Api128_6,
    private val api3: Api180_6,
    private val api4: Api164_6,
    private val api5: Api140_6,
    private val api6: Api136_6,
    private val api7: Api152_6
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