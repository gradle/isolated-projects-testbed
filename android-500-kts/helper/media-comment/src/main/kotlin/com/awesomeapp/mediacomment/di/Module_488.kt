package com.awesomeapp.mediacomment.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.mediacomment.Viewmodel488_1
import com.awesomeapp.mediacomment.Activity488_2
import com.awesomeapp.mediacomment.Activity488_3
import com.awesomeapp.mediacomment.Fragment488_4
import com.awesomeapp.mediacomment.Repository488_5
import com.awesomeapp.weathercomment.Api480_6
import com.awesomeapp.mediacomment.Api488_6

@Module
@InstallIn(SingletonComponent::class)
object Module_488 {
    @Provides
    @Singleton
    fun provideRepository488_5(
        api0: Api480_6 = Api480_6()
    ): Repository488_5 {
        return Repository488_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi488_6(): Api488_6 {
        return Api488_6()
    }
}