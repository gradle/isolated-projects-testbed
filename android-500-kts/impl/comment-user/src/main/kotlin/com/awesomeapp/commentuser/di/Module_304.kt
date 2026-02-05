package com.awesomeapp.commentuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.commentuser.Viewmodel304_1
import com.awesomeapp.commentuser.Activity304_2
import com.awesomeapp.commentuser.Activity304_3
import com.awesomeapp.commentuser.Fragment304_4
import com.awesomeapp.commentuser.Repository304_5
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.gallerylogin.Api144_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.commentuser.Api304_6

@Module
@InstallIn(SingletonComponent::class)
object Module_304 {
    @Provides
    @Singleton
    fun provideRepository304_5(
        api0: Api128_6 = Api128_6(),
        api1: Api144_6 = Api144_6(),
        api2: Api148_6 = Api148_6(),
        api3: Api176_6 = Api176_6(),
        api4: Api160_6 = Api160_6(),
        api5: Api156_6 = Api156_6()
    ): Repository304_5 {
        return Repository304_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi304_6(): Api304_6 {
        return Api304_6()
    }
}