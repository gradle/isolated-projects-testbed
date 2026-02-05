package com.awesomeapp.listprofile

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.eventuser.Api324_6
import com.awesomeapp.accountprofile.Api364_6
import com.awesomeapp.calendarprofile.Api372_6
import com.awesomeapp.groupprofile.Api360_6
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.pushprofile.Api344_6
import com.awesomeapp.mapuser.Api332_6
import com.awesomeapp.feedprofile.Api352_6
import com.awesomeapp.locationprofile.Api356_6
import com.awesomeapp.sessionuser.Api316_6
import com.awesomeapp.articleuser.Api336_6
import com.awesomeapp.documentuser.Api328_6
import com.awesomeapp.galleryuser.Api340_6


@Singleton
class Repository380_5 @Inject constructor(
    private val api0: Api324_6,
    private val api1: Api364_6,
    private val api2: Api372_6,
    private val api3: Api360_6,
    private val api4: Api320_6,
    private val api5: Api344_6,
    private val api6: Api332_6,
    private val api7: Api352_6,
    private val api8: Api356_6,
    private val api9: Api316_6,
    private val api10: Api336_6,
    private val api11: Api328_6,
    private val api12: Api340_6
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
                        { api7.fetchData() },
                        { api8.fetchData() },
                        { api9.fetchData() },
                        { api10.fetchData() },
                        { api11.fetchData() },
                        { api12.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}