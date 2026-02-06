package com.awesomeapp.forecastcheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.forecastcheckout.Viewmodel236_1
import com.awesomeapp.forecastcheckout.Activity236_2
import com.awesomeapp.forecastcheckout.Activity236_3
import com.awesomeapp.forecastcheckout.Fragment236_4
import com.awesomeapp.forecastcheckout.Repository236_5
import com.awesomeapp.logidentity.Api172_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.forecastcheckout.Api236_6

@Module
@InstallIn(SingletonComponent::class)
object Module_236 {
    @Provides
    @Singleton
    fun provideRepository236_5(
        api0: Api172_6 = Api172_6(),
        api1: Api148_6 = Api148_6(),
        api2: Api160_6 = Api160_6(),
        api3: Api136_6 = Api136_6()
    ): Repository236_5 {
        return Repository236_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi236_6(): Api236_6 {
        return Api236_6()
    }
}