package com.awesomeapp.mediacontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.mediacontact.Viewmodel96_1
import com.awesomeapp.mediacontact.Activity96_2
import com.awesomeapp.mediacontact.Activity96_3
import com.awesomeapp.mediacontact.Fragment96_4
import com.awesomeapp.mediacontact.Repository96_5
import com.awesomeapp.weathercontact.Api88_6
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.podcastcontact.Api92_6
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.mediacontact.Api96_6

@Module
@InstallIn(SingletonComponent::class)
object Module_96 {
    @Provides
    @Singleton
    fun provideRepository96_5(
        api0: Api88_6 = Api88_6(),
        api1: Api80_6 = Api80_6(),
        api2: Api92_6 = Api92_6(),
        api3: Api76_6 = Api76_6(),
        api4: Api84_6 = Api84_6()
    ): Repository96_5 {
        return Repository96_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi96_6(): Api96_6 {
        return Api96_6()
    }
}