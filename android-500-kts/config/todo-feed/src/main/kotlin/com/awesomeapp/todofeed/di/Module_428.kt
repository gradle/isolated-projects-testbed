package com.awesomeapp.todofeed.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.todofeed.Viewmodel428_1
import com.awesomeapp.todofeed.Activity428_2
import com.awesomeapp.todofeed.Activity428_3
import com.awesomeapp.todofeed.Fragment428_4
import com.awesomeapp.todofeed.Repository428_5
import com.awesomeapp.sharefeed.Api408_6
import com.awesomeapp.taskfeed.Api420_6
import com.awesomeapp.todofeed.Api428_6

@Module
@InstallIn(SingletonComponent::class)
object Module_428 {
    @Provides
    @Singleton
    fun provideRepository428_5(
        api0: Api408_6 = Api408_6(),
        api1: Api420_6 = Api420_6()
    ): Repository428_5 {
        return Repository428_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi428_6(): Api428_6 {
        return Api428_6()
    }
}