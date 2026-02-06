package com.awesomeapp.app.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.app.Viewmodel500_1
import com.awesomeapp.app.Activity500_2
import com.awesomeapp.app.Activity500_3
import com.awesomeapp.app.Fragment500_4
import com.awesomeapp.app.Repository500_5
import com.awesomeapp.cartpost.Api496_6
import com.awesomeapp.app.Api500_6

@Module
@InstallIn(SingletonComponent::class)
object Module_500 {
    @Provides
    @Singleton
    fun provideRepository500_5(
        api0: Api496_6 = Api496_6()
    ): Repository500_5 {
        return Repository500_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi500_6(): Api500_6 {
        return Api500_6()
    }
}