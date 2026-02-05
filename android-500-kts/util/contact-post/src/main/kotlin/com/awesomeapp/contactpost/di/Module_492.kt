package com.awesomeapp.contactpost.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.contactpost.Viewmodel492_1
import com.awesomeapp.contactpost.Activity492_2
import com.awesomeapp.contactpost.Activity492_3
import com.awesomeapp.contactpost.Fragment492_4
import com.awesomeapp.contactpost.Repository492_5
import com.awesomeapp.contactpost.Api492_6

@Module
@InstallIn(SingletonComponent::class)
object Module_492 {
    @Provides
    @Singleton
    fun provideRepository492_5(): Repository492_5 {
        return Repository492_5()
    }

    @Provides
    @Singleton
    fun provideApi492_6(): Api492_6 {
        return Api492_6()
    }
}