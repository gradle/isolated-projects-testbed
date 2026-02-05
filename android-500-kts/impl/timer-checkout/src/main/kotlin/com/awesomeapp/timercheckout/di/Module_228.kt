package com.awesomeapp.timercheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.timercheckout.Viewmodel228_1
import com.awesomeapp.timercheckout.Activity228_2
import com.awesomeapp.timercheckout.Activity228_3
import com.awesomeapp.timercheckout.Fragment228_4
import com.awesomeapp.timercheckout.Repository228_5
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.accountidentity.Api168_6
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.gallerylogin.Api144_6
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.timercheckout.Api228_6

@Module
@InstallIn(SingletonComponent::class)
object Module_228 {
    @Provides
    @Singleton
    fun provideRepository228_5(
        api0: Api148_6 = Api148_6(),
        api1: Api168_6 = Api168_6(),
        api2: Api132_6 = Api132_6(),
        api3: Api144_6 = Api144_6(),
        api4: Api176_6 = Api176_6()
    ): Repository228_5 {
        return Repository228_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi228_6(): Api228_6 {
        return Api228_6()
    }
}