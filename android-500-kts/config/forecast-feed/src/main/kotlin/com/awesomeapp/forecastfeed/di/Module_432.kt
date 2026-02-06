package com.awesomeapp.forecastfeed.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.forecastfeed.Viewmodel432_1
import com.awesomeapp.forecastfeed.Activity432_2
import com.awesomeapp.forecastfeed.Activity432_3
import com.awesomeapp.forecastfeed.Fragment432_4
import com.awesomeapp.forecastfeed.Repository432_5
import com.awesomeapp.settingfeed.Api412_6
import com.awesomeapp.forecastfeed.Api432_6

@Module
@InstallIn(SingletonComponent::class)
object Module_432 {
    @Provides
    @Singleton
    fun provideRepository432_5(
        api0: Api412_6 = Api412_6()
    ): Repository432_5 {
        return Repository432_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi432_6(): Api432_6 {
        return Api432_6()
    }
}