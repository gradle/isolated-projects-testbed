package com.awesomeapp.synccomment.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.synccomment.Viewmodel456_1
import com.awesomeapp.synccomment.Activity456_2
import com.awesomeapp.synccomment.Activity456_3
import com.awesomeapp.synccomment.Fragment456_4
import com.awesomeapp.synccomment.Repository456_5
import com.awesomeapp.synccomment.Api456_6

@Module
@InstallIn(SingletonComponent::class)
object Module_456 {
    @Provides
    @Singleton
    fun provideRepository456_5(): Repository456_5 {
        return Repository456_5()
    }

    @Provides
    @Singleton
    fun provideApi456_6(): Api456_6 {
        return Api456_6()
    }
}