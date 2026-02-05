package com.awesomeapp.searchcheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.searchcheckout.Viewmodel208_1
import com.awesomeapp.searchcheckout.Activity208_2
import com.awesomeapp.searchcheckout.Activity208_3
import com.awesomeapp.searchcheckout.Fragment208_4
import com.awesomeapp.searchcheckout.Repository208_5
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.searchcheckout.Api208_6

@Module
@InstallIn(SingletonComponent::class)
object Module_208 {
    @Provides
    @Singleton
    fun provideRepository208_5(
        api0: Api152_6 = Api152_6()
    ): Repository208_5 {
        return Repository208_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi208_6(): Api208_6 {
        return Api208_6()
    }
}