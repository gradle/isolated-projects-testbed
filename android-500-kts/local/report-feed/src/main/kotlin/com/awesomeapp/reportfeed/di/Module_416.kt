package com.awesomeapp.reportfeed.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.reportfeed.Viewmodel416_1
import com.awesomeapp.reportfeed.Activity416_2
import com.awesomeapp.reportfeed.Activity416_3
import com.awesomeapp.reportfeed.Fragment416_4
import com.awesomeapp.reportfeed.Repository416_5
import com.awesomeapp.photoprofile.Api388_6
import com.awesomeapp.fileprofile.Api376_6
import com.awesomeapp.reportfeed.Api416_6

@Module
@InstallIn(SingletonComponent::class)
object Module_416 {
    @Provides
    @Singleton
    fun provideRepository416_5(
        api0: Api388_6 = Api388_6(),
        api1: Api376_6 = Api376_6()
    ): Repository416_5 {
        return Repository416_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi416_6(): Api416_6 {
        return Api416_6()
    }
}