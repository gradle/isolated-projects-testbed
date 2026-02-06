package com.awesomeapp.usercomment.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.usercomment.Viewmodel448_1
import com.awesomeapp.usercomment.Activity448_2
import com.awesomeapp.usercomment.Activity448_3
import com.awesomeapp.usercomment.Fragment448_4
import com.awesomeapp.usercomment.Repository448_5
import com.awesomeapp.usercomment.Api448_6

@Module
@InstallIn(SingletonComponent::class)
object Module_448 {
    @Provides
    @Singleton
    fun provideRepository448_5(): Repository448_5 {
        return Repository448_5()
    }

    @Provides
    @Singleton
    fun provideApi448_6(): Api448_6 {
        return Api448_6()
    }
}