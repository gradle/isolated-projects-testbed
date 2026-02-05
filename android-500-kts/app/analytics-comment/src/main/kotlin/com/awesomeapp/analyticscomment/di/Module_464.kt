package com.awesomeapp.analyticscomment.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.analyticscomment.Viewmodel464_1
import com.awesomeapp.analyticscomment.Activity464_2
import com.awesomeapp.analyticscomment.Activity464_3
import com.awesomeapp.analyticscomment.Fragment464_4
import com.awesomeapp.analyticscomment.Repository464_5
import com.awesomeapp.notificationcomment.Api460_6
import com.awesomeapp.synccomment.Api456_6
import com.awesomeapp.analyticscomment.Api464_6

@Module
@InstallIn(SingletonComponent::class)
object Module_464 {
    @Provides
    @Singleton
    fun provideRepository464_5(
        api0: Api460_6 = Api460_6(),
        api1: Api456_6 = Api456_6()
    ): Repository464_5 {
        return Repository464_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi464_6(): Api464_6 {
        return Api464_6()
    }
}