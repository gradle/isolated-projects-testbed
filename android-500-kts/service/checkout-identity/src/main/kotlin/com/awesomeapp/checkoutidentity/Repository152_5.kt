package com.awesomeapp.checkoutidentity

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.cartlogin.Api104_6
import com.awesomeapp.messagelogin.Api116_6
import com.awesomeapp.networklogin.Api112_6
import com.awesomeapp.statuslogin.Api124_6
import com.awesomeapp.sessionlogin.Api120_6
import com.awesomeapp.mediacontact.Api96_6


@Singleton
class Repository152_5 @Inject constructor(
    private val api0: Api104_6,
    private val api1: Api116_6,
    private val api2: Api112_6,
    private val api3: Api124_6,
    private val api4: Api120_6,
    private val api5: Api96_6
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