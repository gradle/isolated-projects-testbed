package com.awesomeapp.timerfeed.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.timerfeed.Viewmodel424_1
import com.awesomeapp.timerfeed.Activity424_2
import com.awesomeapp.timerfeed.Activity424_3
import com.awesomeapp.timerfeed.Fragment424_4
import com.awesomeapp.timerfeed.Repository424_5
import com.awesomeapp.profilefeed.Api400_6
import com.awesomeapp.photoprofile.Api388_6
import com.awesomeapp.listprofile.Api380_6
import com.awesomeapp.timerfeed.Api424_6

@Module
@InstallIn(SingletonComponent::class)
object Module_424 {
    @Provides
    @Singleton
    fun provideRepository424_5(
        api0: Api400_6 = Api400_6(),
        api1: Api388_6 = Api388_6(),
        api2: Api380_6 = Api380_6()
    ): Repository424_5 {
        return Repository424_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi424_6(): Api424_6 {
        return Api424_6()
    }
}