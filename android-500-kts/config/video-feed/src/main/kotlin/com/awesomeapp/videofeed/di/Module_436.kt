package com.awesomeapp.videofeed.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.videofeed.Viewmodel436_1
import com.awesomeapp.videofeed.Activity436_2
import com.awesomeapp.videofeed.Activity436_3
import com.awesomeapp.videofeed.Fragment436_4
import com.awesomeapp.videofeed.Repository436_5
import com.awesomeapp.settingfeed.Api412_6
import com.awesomeapp.videofeed.Api436_6

@Module
@InstallIn(SingletonComponent::class)
object Module_436 {
    @Provides
    @Singleton
    fun provideRepository436_5(
        api0: Api412_6 = Api412_6()
    ): Repository436_5 {
        return Repository436_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi436_6(): Api436_6 {
        return Api436_6()
    }
}