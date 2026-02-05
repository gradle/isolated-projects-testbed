package com.awesomeapp.mapuser

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
import com.awesomeapp.notificationcart.Repository264_5
import com.awesomeapp.logincart.Repository248_5
import com.awesomeapp.photoidentity.Repository192_5
import com.awesomeapp.contactuser.Repository296_5
import com.awesomeapp.taskcheckout.Repository224_5
import com.awesomeapp.analyticscart.Repository268_5
import com.awesomeapp.commentuser.Repository304_5
import com.awesomeapp.searchcheckout.Repository208_5
import com.awesomeapp.playlistidentity.Repository196_5
import com.awesomeapp.metriccart.Repository272_5
import com.awesomeapp.synccart.Repository260_5
import com.awesomeapp.usercart.Repository252_5
import com.awesomeapp.networkuser.Repository308_5


@HiltViewModel
class Viewmodel332_1 @Inject constructor(
    private val repository0: Repository264_5,
    private val repository1: Repository248_5,
    private val repository2: Repository192_5,
    private val repository3: Repository296_5,
    private val repository4: Repository224_5,
    private val repository5: Repository268_5,
    private val repository6: Repository304_5,
    private val repository7: Repository208_5,
    private val repository8: Repository196_5,
    private val repository9: Repository272_5,
    private val repository10: Repository260_5,
    private val repository11: Repository252_5,
    private val repository12: Repository308_5
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
                            { repository12.getData() }
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