package com.awesomeapp.profilefeed.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.profilefeed.Viewmodel400_1
import com.awesomeapp.profilefeed.Activity400_2
import com.awesomeapp.profilefeed.Activity400_3
import com.awesomeapp.profilefeed.Fragment400_4
import com.awesomeapp.profilefeed.Repository400_5
import com.awesomeapp.pushprofile.Api344_6
import com.awesomeapp.mapuser.Api332_6
import com.awesomeapp.groupprofile.Api360_6
import com.awesomeapp.profilefeed.Api400_6

@Module
@InstallIn(SingletonComponent::class)
object Module_400 {
    @Provides
    @Singleton
    fun provideRepository400_5(
        api0: Api344_6 = Api344_6(),
        api1: Api332_6 = Api332_6(),
        api2: Api360_6 = Api360_6()
    ): Repository400_5 {
        return Repository400_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi400_6(): Api400_6 {
        return Api400_6()
    }
}