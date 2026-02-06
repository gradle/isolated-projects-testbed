package com.awesomeapp.cartpost.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.cartpost.Viewmodel496_1
import com.awesomeapp.cartpost.Activity496_2
import com.awesomeapp.cartpost.Activity496_3
import com.awesomeapp.cartpost.Fragment496_4
import com.awesomeapp.cartpost.Repository496_5
import com.awesomeapp.cartpost.Api496_6

@Module
@InstallIn(SingletonComponent::class)
object Module_496 {
    @Provides
    @Singleton
    fun provideRepository496_5(): Repository496_5 {
        return Repository496_5()
    }

    @Provides
    @Singleton
    fun provideApi496_6(): Api496_6 {
        return Api496_6()
    }
}