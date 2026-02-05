package com.awesomeapp.weathercart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.weathercart.Viewmodel284_1
import com.awesomeapp.weathercart.Activity284_2
import com.awesomeapp.weathercart.Activity284_3
import com.awesomeapp.weathercart.Fragment284_4
import com.awesomeapp.weathercart.Repository284_5
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.weathercart.Api284_6

@Module
@InstallIn(SingletonComponent::class)
object Module_284 {
    @Provides
    @Singleton
    fun provideRepository284_5(
        api0: Api176_6 = Api176_6(),
        api1: Api128_6 = Api128_6(),
        api2: Api156_6 = Api156_6(),
        api3: Api132_6 = Api132_6()
    ): Repository284_5 {
        return Repository284_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi284_6(): Api284_6 {
        return Api284_6()
    }
}