package com.awesomeapp.notecomment.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.notecomment.Viewmodel476_1
import com.awesomeapp.notecomment.Activity476_2
import com.awesomeapp.notecomment.Activity476_3
import com.awesomeapp.notecomment.Fragment476_4
import com.awesomeapp.notecomment.Repository476_5
import com.awesomeapp.analyticscomment.Api464_6
import com.awesomeapp.notecomment.Api476_6

@Module
@InstallIn(SingletonComponent::class)
object Module_476 {
    @Provides
    @Singleton
    fun provideRepository476_5(
        api0: Api464_6 = Api464_6()
    ): Repository476_5 {
        return Repository476_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi476_6(): Api476_6 {
        return Api476_6()
    }
}