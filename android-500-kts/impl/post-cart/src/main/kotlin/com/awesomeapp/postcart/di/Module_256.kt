package com.awesomeapp.postcart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.postcart.Viewmodel256_1
import com.awesomeapp.postcart.Activity256_2
import com.awesomeapp.postcart.Activity256_3
import com.awesomeapp.postcart.Fragment256_4
import com.awesomeapp.postcart.Repository256_5
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.accountidentity.Api168_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.postcart.Api256_6

@Module
@InstallIn(SingletonComponent::class)
object Module_256 {
    @Provides
    @Singleton
    fun provideRepository256_5(
        api0: Api156_6 = Api156_6(),
        api1: Api168_6 = Api168_6(),
        api2: Api136_6 = Api136_6()
    ): Repository256_5 {
        return Repository256_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi256_6(): Api256_6 {
        return Api256_6()
    }
}