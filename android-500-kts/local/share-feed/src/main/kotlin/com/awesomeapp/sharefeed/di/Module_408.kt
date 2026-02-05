package com.awesomeapp.sharefeed.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.sharefeed.Viewmodel408_1
import com.awesomeapp.sharefeed.Activity408_2
import com.awesomeapp.sharefeed.Activity408_3
import com.awesomeapp.sharefeed.Fragment408_4
import com.awesomeapp.sharefeed.Repository408_5
import com.awesomeapp.listprofile.Api380_6
import com.awesomeapp.sharefeed.Api408_6

@Module
@InstallIn(SingletonComponent::class)
object Module_408 {
    @Provides
    @Singleton
    fun provideRepository408_5(
        api0: Api380_6 = Api380_6()
    ): Repository408_5 {
        return Repository408_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi408_6(): Api408_6 {
        return Api408_6()
    }
}