package com.awesomeapp.mediacart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.mediacart.Viewmodel292_1
import com.awesomeapp.mediacart.Activity292_2
import com.awesomeapp.mediacart.Activity292_3
import com.awesomeapp.mediacart.Fragment292_4
import com.awesomeapp.mediacart.Repository292_5
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.logidentity.Api172_6
import com.awesomeapp.mediacart.Api292_6

@Module
@InstallIn(SingletonComponent::class)
object Module_292 {
    @Provides
    @Singleton
    fun provideRepository292_5(
        api0: Api148_6 = Api148_6(),
        api1: Api132_6 = Api132_6(),
        api2: Api160_6 = Api160_6(),
        api3: Api172_6 = Api172_6()
    ): Repository292_5 {
        return Repository292_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi292_6(): Api292_6 {
        return Api292_6()
    }
}