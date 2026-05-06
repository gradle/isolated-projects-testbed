package com.awesomeapp.app.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.app.Viewmodel100_1
import com.awesomeapp.app.Activity100_2
import com.awesomeapp.app.Activity100_3
import com.awesomeapp.app.Fragment100_4
import com.awesomeapp.app.Repository100_5
import com.awesomeapp.app.Api100_6

@Module
@InstallIn(SingletonComponent::class)
object Module_100 {
    @Provides
    @Singleton
    fun provideRepository100_5(): Repository100_5 {
        return Repository100_5()
    }

    @Provides
    @Singleton
    fun provideApi100_6(): Api100_6 {
        return Api100_6()
    }
}