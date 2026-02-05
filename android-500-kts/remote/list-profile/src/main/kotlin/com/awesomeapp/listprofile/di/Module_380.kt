package com.awesomeapp.listprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.listprofile.Viewmodel380_1
import com.awesomeapp.listprofile.Activity380_2
import com.awesomeapp.listprofile.Activity380_3
import com.awesomeapp.listprofile.Fragment380_4
import com.awesomeapp.listprofile.Repository380_5
import com.awesomeapp.eventuser.Api324_6
import com.awesomeapp.accountprofile.Api364_6
import com.awesomeapp.calendarprofile.Api372_6
import com.awesomeapp.groupprofile.Api360_6
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.pushprofile.Api344_6
import com.awesomeapp.mapuser.Api332_6
import com.awesomeapp.feedprofile.Api352_6
import com.awesomeapp.locationprofile.Api356_6
import com.awesomeapp.sessionuser.Api316_6
import com.awesomeapp.articleuser.Api336_6
import com.awesomeapp.documentuser.Api328_6
import com.awesomeapp.galleryuser.Api340_6
import com.awesomeapp.listprofile.Api380_6

@Module
@InstallIn(SingletonComponent::class)
object Module_380 {
    @Provides
    @Singleton
    fun provideRepository380_5(
        api0: Api324_6 = Api324_6(),
        api1: Api364_6 = Api364_6(),
        api2: Api372_6 = Api372_6(),
        api3: Api360_6 = Api360_6(),
        api4: Api320_6 = Api320_6(),
        api5: Api344_6 = Api344_6(),
        api6: Api332_6 = Api332_6(),
        api7: Api352_6 = Api352_6(),
        api8: Api356_6 = Api356_6(),
        api9: Api316_6 = Api316_6(),
        api10: Api336_6 = Api336_6(),
        api11: Api328_6 = Api328_6(),
        api12: Api340_6 = Api340_6()
    ): Repository380_5 {
        return Repository380_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9, 
        api10, 
        api11, 
        api12)
    }

    @Provides
    @Singleton
    fun provideApi380_6(): Api380_6 {
        return Api380_6()
    }
}