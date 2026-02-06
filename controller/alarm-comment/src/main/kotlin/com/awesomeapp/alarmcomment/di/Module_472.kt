package com.awesomeapp.alarmcomment.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.alarmcomment.Viewmodel472_1
import com.awesomeapp.alarmcomment.Activity472_2
import com.awesomeapp.alarmcomment.Activity472_3
import com.awesomeapp.alarmcomment.Fragment472_4
import com.awesomeapp.alarmcomment.Repository472_5
import com.awesomeapp.metriccomment.Api468_6
import com.awesomeapp.alarmcomment.Api472_6

@Module
@InstallIn(SingletonComponent::class)
object Module_472 {
    @Provides
    @Singleton
    fun provideRepository472_5(
        api0: Api468_6 = Api468_6()
    ): Repository472_5 {
        return Repository472_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi472_6(): Api472_6 {
        return Api472_6()
    }
}