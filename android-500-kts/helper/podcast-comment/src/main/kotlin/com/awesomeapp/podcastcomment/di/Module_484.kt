package com.awesomeapp.podcastcomment.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.podcastcomment.Viewmodel484_1
import com.awesomeapp.podcastcomment.Activity484_2
import com.awesomeapp.podcastcomment.Activity484_3
import com.awesomeapp.podcastcomment.Fragment484_4
import com.awesomeapp.podcastcomment.Repository484_5
import com.awesomeapp.podcastcomment.Api484_6

@Module
@InstallIn(SingletonComponent::class)
object Module_484 {
    @Provides
    @Singleton
    fun provideRepository484_5(): Repository484_5 {
        return Repository484_5()
    }

    @Provides
    @Singleton
    fun provideApi484_6(): Api484_6 {
        return Api484_6()
    }
}