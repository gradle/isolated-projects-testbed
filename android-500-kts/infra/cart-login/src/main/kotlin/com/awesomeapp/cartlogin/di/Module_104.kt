package com.awesomeapp.cartlogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.cartlogin.Viewmodel104_1
import com.awesomeapp.cartlogin.Activity104_2
import com.awesomeapp.cartlogin.Activity104_3
import com.awesomeapp.cartlogin.Fragment104_4
import com.awesomeapp.cartlogin.Repository104_5
import com.awesomeapp.podcastcontact.Api92_6
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.weathercontact.Api88_6
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.cartlogin.Api104_6

@Module
@InstallIn(SingletonComponent::class)
object Module_104 {
    @Provides
    @Singleton
    fun provideRepository104_5(
        api0: Api92_6 = Api92_6(),
        api1: Api80_6 = Api80_6(),
        api2: Api88_6 = Api88_6(),
        api3: Api76_6 = Api76_6(),
        api4: Api84_6 = Api84_6()
    ): Repository104_5 {
        return Repository104_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi104_6(): Api104_6 {
        return Api104_6()
    }
}