package com.awesomeapp.sessionlogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.sessionlogin.Viewmodel120_1
import com.awesomeapp.sessionlogin.Activity120_2
import com.awesomeapp.sessionlogin.Activity120_3
import com.awesomeapp.sessionlogin.Fragment120_4
import com.awesomeapp.sessionlogin.Repository120_5
import com.awesomeapp.weathercontact.Api88_6
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.podcastcontact.Api92_6
import com.awesomeapp.sessionlogin.Api120_6

@Module
@InstallIn(SingletonComponent::class)
object Module_120 {
    @Provides
    @Singleton
    fun provideRepository120_5(
        api0: Api88_6 = Api88_6(),
        api1: Api76_6 = Api76_6(),
        api2: Api92_6 = Api92_6()
    ): Repository120_5 {
        return Repository120_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi120_6(): Api120_6 {
        return Api120_6()
    }
}