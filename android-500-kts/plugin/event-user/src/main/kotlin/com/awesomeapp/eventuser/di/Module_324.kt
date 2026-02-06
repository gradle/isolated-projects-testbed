package com.awesomeapp.eventuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.eventuser.Viewmodel324_1
import com.awesomeapp.eventuser.Activity324_2
import com.awesomeapp.eventuser.Activity324_3
import com.awesomeapp.eventuser.Fragment324_4
import com.awesomeapp.eventuser.Repository324_5
import com.awesomeapp.photoidentity.Api192_6
import com.awesomeapp.eventuser.Api324_6

@Module
@InstallIn(SingletonComponent::class)
object Module_324 {
    @Provides
    @Singleton
    fun provideRepository324_5(
        api0: Api192_6 = Api192_6()
    ): Repository324_5 {
        return Repository324_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi324_6(): Api324_6 {
        return Api324_6()
    }
}