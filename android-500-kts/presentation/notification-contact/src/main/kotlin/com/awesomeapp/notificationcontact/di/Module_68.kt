package com.awesomeapp.notificationcontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.notificationcontact.Viewmodel68_1
import com.awesomeapp.notificationcontact.Activity68_2
import com.awesomeapp.notificationcontact.Activity68_3
import com.awesomeapp.notificationcontact.Fragment68_4
import com.awesomeapp.notificationcontact.Repository68_5
import com.awesomeapp.notificationcontact.Api68_6

@Module
@InstallIn(SingletonComponent::class)
object Module_68 {
    @Provides
    @Singleton
    fun provideRepository68_5(): Repository68_5 {
        return Repository68_5()
    }

    @Provides
    @Singleton
    fun provideApi68_6(): Api68_6 {
        return Api68_6()
    }
}