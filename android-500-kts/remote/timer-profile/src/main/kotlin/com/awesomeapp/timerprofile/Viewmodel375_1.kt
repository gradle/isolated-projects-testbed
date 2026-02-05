package com.awesomeapp.timerprofile

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.checkoutprofile.Repository348_5
import com.awesomeapp.locationprofile.Repository356_5
import com.awesomeapp.accountprofile.Repository364_5
import com.awesomeapp.statususer.Repository320_5
import com.awesomeapp.groupprofile.Repository360_5
import com.awesomeapp.sessionuser.Repository316_5
import com.awesomeapp.pushprofile.Repository344_5
import com.awesomeapp.galleryuser.Repository340_5
import com.awesomeapp.articleuser.Repository336_5
import com.awesomeapp.mapuser.Repository332_5
import com.awesomeapp.calendarprofile.Repository372_5
import com.awesomeapp.eventuser.Repository324_5
import com.awesomeapp.feedprofile.Repository352_5
import com.awesomeapp.documentuser.Repository328_5
import com.awesomeapp.logprofile.Repository368_5


@HiltViewModel
class Viewmodel375_1 @Inject constructor(
    private val repository0: Repository348_5,
    private val repository1: Repository356_5,
    private val repository2: Repository364_5,
    private val repository3: Repository320_5,
    private val repository4: Repository360_5,
    private val repository5: Repository316_5,
    private val repository6: Repository344_5,
    private val repository7: Repository340_5,
    private val repository8: Repository336_5,
    private val repository9: Repository332_5,
    private val repository10: Repository372_5,
    private val repository11: Repository324_5,
    private val repository12: Repository352_5,
    private val repository13: Repository328_5,
    private val repository14: Repository368_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = coroutineScope {
                    val fetchers = listOf<suspend () -> String>(
                        { repository0.getData() },
                            { repository1.getData() },
                            { repository2.getData() },
                            { repository3.getData() },
                            { repository4.getData() },
                            { repository5.getData() },
                            { repository6.getData() },
                            { repository7.getData() },
                            { repository8.getData() },
                            { repository9.getData() },
                            { repository10.getData() },
                            { repository11.getData() },
                            { repository12.getData() },
                            { repository13.getData() },
                            { repository14.getData() }
                    )
                    val results = fetchers.map { fetcher ->
                        async { fetcher() }
                    }.awaitAll()
                    results.joinToString("")
                }
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: ${e.message}")
            }
        }
    }
}