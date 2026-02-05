package com.awesomeapp.metriccomment.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.metriccomment.Viewmodel468_1
import com.awesomeapp.metriccomment.Activity468_2
import com.awesomeapp.metriccomment.Activity468_3
import com.awesomeapp.metriccomment.Fragment468_4
import com.awesomeapp.metriccomment.Repository468_5
import com.awesomeapp.metriccomment.Api468_6

@Module
@InstallIn(SingletonComponent::class)
object Module_468 {
    @Provides
    @Singleton
    fun provideRepository468_5(): Repository468_5 {
        return Repository468_5()
    }

    @Provides
    @Singleton
    fun provideApi468_6(): Api468_6 {
        return Api468_6()
    }
}