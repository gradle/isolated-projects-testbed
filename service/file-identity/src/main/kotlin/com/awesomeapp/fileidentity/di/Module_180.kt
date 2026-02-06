package com.awesomeapp.fileidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.fileidentity.Viewmodel180_1
import com.awesomeapp.fileidentity.Activity180_2
import com.awesomeapp.fileidentity.Activity180_3
import com.awesomeapp.fileidentity.Fragment180_4
import com.awesomeapp.fileidentity.Repository180_5
import com.awesomeapp.fileidentity.Api180_6

@Module
@InstallIn(SingletonComponent::class)
object Module_180 {
    @Provides
    @Singleton
    fun provideRepository180_5(): Repository180_5 {
        return Repository180_5()
    }

    @Provides
    @Singleton
    fun provideApi180_6(): Api180_6 {
        return Api180_6()
    }
}