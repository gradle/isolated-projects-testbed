package com.awesomeapp.searchfeed.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.searchfeed.Viewmodel404_1
import com.awesomeapp.searchfeed.Activity404_2
import com.awesomeapp.searchfeed.Activity404_3
import com.awesomeapp.searchfeed.Fragment404_4
import com.awesomeapp.searchfeed.Repository404_5
import com.awesomeapp.eventuser.Api324_6
import com.awesomeapp.articleuser.Api336_6
import com.awesomeapp.checkoutprofile.Api348_6
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.mapuser.Api332_6
import com.awesomeapp.calendarprofile.Api372_6
import com.awesomeapp.searchfeed.Api404_6

@Module
@InstallIn(SingletonComponent::class)
object Module_404 {
    @Provides
    @Singleton
    fun provideRepository404_5(
        api0: Api324_6 = Api324_6(),
        api1: Api336_6 = Api336_6(),
        api2: Api348_6 = Api348_6(),
        api3: Api320_6 = Api320_6(),
        api4: Api332_6 = Api332_6(),
        api5: Api372_6 = Api372_6()
    ): Repository404_5 {
        return Repository404_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi404_6(): Api404_6 {
        return Api404_6()
    }
}