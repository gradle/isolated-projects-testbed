package com.awesomeapp.calendarprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.calendarprofile.Viewmodel372_1
import com.awesomeapp.calendarprofile.Activity372_2
import com.awesomeapp.calendarprofile.Activity372_3
import com.awesomeapp.calendarprofile.Fragment372_4
import com.awesomeapp.calendarprofile.Repository372_5
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.notificationcart.Api264_6
import com.awesomeapp.profilecheckout.Api204_6
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.identitycheckout.Api200_6
import com.awesomeapp.calendarprofile.Api372_6

@Module
@InstallIn(SingletonComponent::class)
object Module_372 {
    @Provides
    @Singleton
    fun provideRepository372_5(
        api0: Api208_6 = Api208_6(),
        api1: Api268_6 = Api268_6(),
        api2: Api264_6 = Api264_6(),
        api3: Api204_6 = Api204_6(),
        api4: Api256_6 = Api256_6(),
        api5: Api200_6 = Api200_6()
    ): Repository372_5 {
        return Repository372_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi372_6(): Api372_6 {
        return Api372_6()
    }
}