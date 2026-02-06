package com.awesomeapp.photoprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.photoprofile.Viewmodel388_1
import com.awesomeapp.photoprofile.Activity388_2
import com.awesomeapp.photoprofile.Activity388_3
import com.awesomeapp.photoprofile.Fragment388_4
import com.awesomeapp.photoprofile.Repository388_5
import com.awesomeapp.documentuser.Api328_6
import com.awesomeapp.mapuser.Api332_6
import com.awesomeapp.calendarprofile.Api372_6
import com.awesomeapp.groupprofile.Api360_6
import com.awesomeapp.feedprofile.Api352_6
import com.awesomeapp.accountprofile.Api364_6
import com.awesomeapp.photoprofile.Api388_6

@Module
@InstallIn(SingletonComponent::class)
object Module_388 {
    @Provides
    @Singleton
    fun provideRepository388_5(
        api0: Api328_6 = Api328_6(),
        api1: Api332_6 = Api332_6(),
        api2: Api372_6 = Api372_6(),
        api3: Api360_6 = Api360_6(),
        api4: Api352_6 = Api352_6(),
        api5: Api364_6 = Api364_6()
    ): Repository388_5 {
        return Repository388_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi388_6(): Api388_6 {
        return Api388_6()
    }
}