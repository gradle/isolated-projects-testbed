package com.awesomeapp.weathercomment.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.weathercomment.Viewmodel480_1
import com.awesomeapp.weathercomment.Activity480_2
import com.awesomeapp.weathercomment.Activity480_3
import com.awesomeapp.weathercomment.Fragment480_4
import com.awesomeapp.weathercomment.Repository480_5
import com.awesomeapp.weathercomment.Api480_6

@Module
@InstallIn(SingletonComponent::class)
object Module_480 {
    @Provides
    @Singleton
    fun provideRepository480_5(): Repository480_5 {
        return Repository480_5()
    }

    @Provides
    @Singleton
    fun provideApi480_6(): Api480_6 {
        return Api480_6()
    }
}