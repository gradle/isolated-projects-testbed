package com.awesomeapp.audiofeed.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.audiofeed.Viewmodel440_1
import com.awesomeapp.audiofeed.Activity440_2
import com.awesomeapp.audiofeed.Activity440_3
import com.awesomeapp.audiofeed.Fragment440_4
import com.awesomeapp.audiofeed.Repository440_5
import com.awesomeapp.settingfeed.Api412_6
import com.awesomeapp.timerfeed.Api424_6
import com.awesomeapp.audiofeed.Api440_6

@Module
@InstallIn(SingletonComponent::class)
object Module_440 {
    @Provides
    @Singleton
    fun provideRepository440_5(
        api0: Api412_6 = Api412_6(),
        api1: Api424_6 = Api424_6()
    ): Repository440_5 {
        return Repository440_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi440_6(): Api440_6 {
        return Api440_6()
    }
}