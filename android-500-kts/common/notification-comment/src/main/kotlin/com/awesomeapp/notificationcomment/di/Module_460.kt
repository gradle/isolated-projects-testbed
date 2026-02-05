package com.awesomeapp.notificationcomment.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.notificationcomment.Viewmodel460_1
import com.awesomeapp.notificationcomment.Activity460_2
import com.awesomeapp.notificationcomment.Activity460_3
import com.awesomeapp.notificationcomment.Fragment460_4
import com.awesomeapp.notificationcomment.Repository460_5
import com.awesomeapp.notificationcomment.Api460_6

@Module
@InstallIn(SingletonComponent::class)
object Module_460 {
    @Provides
    @Singleton
    fun provideRepository460_5(): Repository460_5 {
        return Repository460_5()
    }

    @Provides
    @Singleton
    fun provideApi460_6(): Api460_6 {
        return Api460_6()
    }
}