package com.awesomeapp.playlistprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.playlistprofile.Viewmodel392_1
import com.awesomeapp.playlistprofile.Activity392_2
import com.awesomeapp.playlistprofile.Activity392_3
import com.awesomeapp.playlistprofile.Fragment392_4
import com.awesomeapp.playlistprofile.Repository392_5
import com.awesomeapp.playlistprofile.Api392_6

@Module
@InstallIn(SingletonComponent::class)
object Module_392 {
    @Provides
    @Singleton
    fun provideRepository392_5(): Repository392_5 {
        return Repository392_5()
    }

    @Provides
    @Singleton
    fun provideApi392_6(): Api392_6 {
        return Api392_6()
    }
}