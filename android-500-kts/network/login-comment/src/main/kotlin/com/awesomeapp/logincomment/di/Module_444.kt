package com.awesomeapp.logincomment.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.logincomment.Viewmodel444_1
import com.awesomeapp.logincomment.Activity444_2
import com.awesomeapp.logincomment.Activity444_3
import com.awesomeapp.logincomment.Fragment444_4
import com.awesomeapp.logincomment.Repository444_5
import com.awesomeapp.forecastfeed.Api432_6
import com.awesomeapp.videofeed.Api436_6
import com.awesomeapp.audiofeed.Api440_6
import com.awesomeapp.logincomment.Api444_6

@Module
@InstallIn(SingletonComponent::class)
object Module_444 {
    @Provides
    @Singleton
    fun provideRepository444_5(
        api0: Api432_6 = Api432_6(),
        api1: Api436_6 = Api436_6(),
        api2: Api440_6 = Api440_6()
    ): Repository444_5 {
        return Repository444_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi444_6(): Api444_6 {
        return Api444_6()
    }
}