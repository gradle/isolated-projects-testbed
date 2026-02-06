package com.awesomeapp.forecast.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.forecast.Viewmodel40_1
import com.awesomeapp.forecast.Activity40_2
import com.awesomeapp.forecast.Activity40_3
import com.awesomeapp.forecast.Fragment40_4
import com.awesomeapp.forecast.Repository40_5
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.forecast.Api40_6

@Module
@InstallIn(SingletonComponent::class)
object Module_40 {
    @Provides
    @Singleton
    fun provideRepository40_5(
        api0: Api32_6 = Api32_6(),
        api1: Api36_6 = Api36_6()
    ): Repository40_5 {
        return Repository40_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi40_6(): Api40_6 {
        return Api40_6()
    }
}