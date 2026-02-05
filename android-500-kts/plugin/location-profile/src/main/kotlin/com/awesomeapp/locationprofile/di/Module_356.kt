package com.awesomeapp.locationprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.locationprofile.Viewmodel356_1
import com.awesomeapp.locationprofile.Activity356_2
import com.awesomeapp.locationprofile.Activity356_3
import com.awesomeapp.locationprofile.Fragment356_4
import com.awesomeapp.locationprofile.Repository356_5
import com.awesomeapp.newsidentity.Api188_6
import com.awesomeapp.logincart.Api248_6
import com.awesomeapp.audiocheckout.Api244_6
import com.awesomeapp.locationprofile.Api356_6

@Module
@InstallIn(SingletonComponent::class)
object Module_356 {
    @Provides
    @Singleton
    fun provideRepository356_5(
        api0: Api188_6 = Api188_6(),
        api1: Api248_6 = Api248_6(),
        api2: Api244_6 = Api244_6()
    ): Repository356_5 {
        return Repository356_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi356_6(): Api356_6 {
        return Api356_6()
    }
}