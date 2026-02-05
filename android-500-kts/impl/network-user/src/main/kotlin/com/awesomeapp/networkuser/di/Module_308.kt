package com.awesomeapp.networkuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.networkuser.Viewmodel308_1
import com.awesomeapp.networkuser.Activity308_2
import com.awesomeapp.networkuser.Activity308_3
import com.awesomeapp.networkuser.Fragment308_4
import com.awesomeapp.networkuser.Repository308_5
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.groupidentity.Api164_6
import com.awesomeapp.networkuser.Api308_6

@Module
@InstallIn(SingletonComponent::class)
object Module_308 {
    @Provides
    @Singleton
    fun provideRepository308_5(
        api0: Api136_6 = Api136_6(),
        api1: Api180_6 = Api180_6(),
        api2: Api152_6 = Api152_6(),
        api3: Api164_6 = Api164_6()
    ): Repository308_5 {
        return Repository308_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi308_6(): Api308_6 {
        return Api308_6()
    }
}