package com.awesomeapp.taskfeed.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.taskfeed.Viewmodel420_1
import com.awesomeapp.taskfeed.Activity420_2
import com.awesomeapp.taskfeed.Activity420_3
import com.awesomeapp.taskfeed.Fragment420_4
import com.awesomeapp.taskfeed.Repository420_5
import com.awesomeapp.photoprofile.Api388_6
import com.awesomeapp.searchfeed.Api404_6
import com.awesomeapp.taskfeed.Api420_6

@Module
@InstallIn(SingletonComponent::class)
object Module_420 {
    @Provides
    @Singleton
    fun provideRepository420_5(
        api0: Api388_6 = Api388_6(),
        api1: Api404_6 = Api404_6()
    ): Repository420_5 {
        return Repository420_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi420_6(): Api420_6 {
        return Api420_6()
    }
}