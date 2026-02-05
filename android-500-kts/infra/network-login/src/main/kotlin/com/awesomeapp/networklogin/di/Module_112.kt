package com.awesomeapp.networklogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.networklogin.Viewmodel112_1
import com.awesomeapp.networklogin.Activity112_2
import com.awesomeapp.networklogin.Activity112_3
import com.awesomeapp.networklogin.Fragment112_4
import com.awesomeapp.networklogin.Repository112_5
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.networklogin.Api112_6

@Module
@InstallIn(SingletonComponent::class)
object Module_112 {
    @Provides
    @Singleton
    fun provideRepository112_5(
        api0: Api84_6 = Api84_6()
    ): Repository112_5 {
        return Repository112_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi112_6(): Api112_6 {
        return Api112_6()
    }
}