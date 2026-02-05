package com.awesomeapp.statuslogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.statuslogin.Viewmodel124_1
import com.awesomeapp.statuslogin.Activity124_2
import com.awesomeapp.statuslogin.Activity124_3
import com.awesomeapp.statuslogin.Fragment124_4
import com.awesomeapp.statuslogin.Repository124_5
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.podcastcontact.Api92_6
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.weathercontact.Api88_6
import com.awesomeapp.statuslogin.Api124_6

@Module
@InstallIn(SingletonComponent::class)
object Module_124 {
    @Provides
    @Singleton
    fun provideRepository124_5(
        api0: Api80_6 = Api80_6(),
        api1: Api76_6 = Api76_6(),
        api2: Api92_6 = Api92_6(),
        api3: Api84_6 = Api84_6(),
        api4: Api88_6 = Api88_6()
    ): Repository124_5 {
        return Repository124_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi124_6(): Api124_6 {
        return Api124_6()
    }
}