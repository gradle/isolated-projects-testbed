package com.awesomeapp.identitycheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.identitycheckout.Viewmodel200_1
import com.awesomeapp.identitycheckout.Activity200_2
import com.awesomeapp.identitycheckout.Activity200_3
import com.awesomeapp.identitycheckout.Fragment200_4
import com.awesomeapp.identitycheckout.Repository200_5
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.identitycheckout.Api200_6

@Module
@InstallIn(SingletonComponent::class)
object Module_200 {
    @Provides
    @Singleton
    fun provideRepository200_5(
        api0: Api128_6 = Api128_6()
    ): Repository200_5 {
        return Repository200_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi200_6(): Api200_6 {
        return Api200_6()
    }
}