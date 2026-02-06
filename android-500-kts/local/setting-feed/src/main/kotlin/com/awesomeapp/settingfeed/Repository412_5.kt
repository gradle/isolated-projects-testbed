package com.awesomeapp.settingfeed

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.identityfeed.Api396_6
import com.awesomeapp.searchfeed.Api404_6
import com.awesomeapp.listprofile.Api380_6
import com.awesomeapp.fileprofile.Api376_6
import com.awesomeapp.newsprofile.Api384_6
import com.awesomeapp.playlistprofile.Api392_6
import com.awesomeapp.photoprofile.Api388_6
import com.awesomeapp.profilefeed.Api400_6


@Singleton
class Repository412_5 @Inject constructor(
    private val api0: Api396_6,
    private val api1: Api404_6,
    private val api2: Api380_6,
    private val api3: Api376_6,
    private val api4: Api384_6,
    private val api5: Api392_6,
    private val api6: Api388_6,
    private val api7: Api400_6
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