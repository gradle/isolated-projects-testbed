package com.awesomeapp.fileprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.fileprofile.Viewmodel376_1
import com.awesomeapp.fileprofile.Activity376_2
import com.awesomeapp.fileprofile.Activity376_3
import com.awesomeapp.fileprofile.Fragment376_4
import com.awesomeapp.fileprofile.Repository376_5
import com.awesomeapp.calendarprofile.Api372_6
import com.awesomeapp.feedprofile.Api352_6
import com.awesomeapp.mapuser.Api332_6
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.logprofile.Api368_6
import com.awesomeapp.sessionuser.Api316_6
import com.awesomeapp.galleryuser.Api340_6
import com.awesomeapp.fileprofile.Api376_6

@Module
@InstallIn(SingletonComponent::class)
object Module_376 {
    @Provides
    @Singleton
    fun provideRepository376_5(
        api0: Api372_6 = Api372_6(),
        api1: Api352_6 = Api352_6(),
        api2: Api332_6 = Api332_6(),
        api3: Api320_6 = Api320_6(),
        api4: Api368_6 = Api368_6(),
        api5: Api316_6 = Api316_6(),
        api6: Api340_6 = Api340_6()
    ): Repository376_5 {
        return Repository376_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi376_6(): Api376_6 {
        return Api376_6()
    }
}