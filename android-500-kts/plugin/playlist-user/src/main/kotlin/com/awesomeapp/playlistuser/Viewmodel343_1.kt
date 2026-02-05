package com.awesomeapp.playlistuser

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
import com.awesomeapp.postcart.Repository256_5
import com.awesomeapp.notecart.Repository280_5
import com.awesomeapp.analyticscart.Repository268_5
import com.awesomeapp.timercheckout.Repository228_5
import com.awesomeapp.photoidentity.Repository192_5
import com.awesomeapp.profilecheckout.Repository204_5
import com.awesomeapp.networkuser.Repository308_5
import com.awesomeapp.commentuser.Repository304_5
import com.awesomeapp.forecastcheckout.Repository236_5
import com.awesomeapp.mediacart.Repository292_5
import com.awesomeapp.reportcheckout.Repository220_5
import com.awesomeapp.identitycheckout.Repository200_5
import com.awesomeapp.sharecheckout.Repository212_5
import com.awesomeapp.logincart.Repository248_5
import com.awesomeapp.synccart.Repository260_5
import com.awesomeapp.videocheckout.Repository240_5


@HiltViewModel
class Viewmodel343_1 @Inject constructor(
    private val repository0: Repository256_5,
    private val repository1: Repository280_5,
    private val repository2: Repository268_5,
    private val repository3: Repository228_5,
    private val repository4: Repository192_5,
    private val repository5: Repository204_5,
    private val repository6: Repository308_5,
    private val repository7: Repository304_5,
    private val repository8: Repository236_5,
    private val repository9: Repository292_5,
    private val repository10: Repository220_5,
    private val repository11: Repository200_5,
    private val repository12: Repository212_5,
    private val repository13: Repository248_5,
    private val repository14: Repository260_5,
    private val repository15: Repository240_5
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
                            { repository14.getData() },
                            { repository15.getData() }
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