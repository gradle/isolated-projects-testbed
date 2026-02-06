package com.awesomeapp.listidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.listidentity.Viewmodel184_1
import com.awesomeapp.listidentity.Activity184_2
import com.awesomeapp.listidentity.Activity184_3
import com.awesomeapp.listidentity.Fragment184_4
import com.awesomeapp.listidentity.Repository184_5
import com.awesomeapp.mediacontact.Api96_6
import com.awesomeapp.listidentity.Api184_6

@Module
@InstallIn(SingletonComponent::class)
object Module_184 {
    @Provides
    @Singleton
    fun provideRepository184_5(
        api0: Api96_6 = Api96_6()
    ): Repository184_5 {
        return Repository184_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi184_6(): Api184_6 {
        return Api184_6()
    }
}