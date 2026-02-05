package com.awesomeapp.postcomment.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.postcomment.Viewmodel452_1
import com.awesomeapp.postcomment.Activity452_2
import com.awesomeapp.postcomment.Activity452_3
import com.awesomeapp.postcomment.Fragment452_4
import com.awesomeapp.postcomment.Repository452_5
import com.awesomeapp.forecastfeed.Api432_6
import com.awesomeapp.videofeed.Api436_6
import com.awesomeapp.audiofeed.Api440_6
import com.awesomeapp.postcomment.Api452_6

@Module
@InstallIn(SingletonComponent::class)
object Module_452 {
    @Provides
    @Singleton
    fun provideRepository452_5(
        api0: Api432_6 = Api432_6(),
        api1: Api436_6 = Api436_6(),
        api2: Api440_6 = Api440_6()
    ): Repository452_5 {
        return Repository452_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi452_6(): Api452_6 {
        return Api452_6()
    }
}