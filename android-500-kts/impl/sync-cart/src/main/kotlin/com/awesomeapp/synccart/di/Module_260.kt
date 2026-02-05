package com.awesomeapp.synccart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.synccart.Viewmodel260_1
import com.awesomeapp.synccart.Activity260_2
import com.awesomeapp.synccart.Activity260_3
import com.awesomeapp.synccart.Fragment260_4
import com.awesomeapp.synccart.Repository260_5
import com.awesomeapp.gallerylogin.Api144_6
import com.awesomeapp.listidentity.Api184_6
import com.awesomeapp.synccart.Api260_6

@Module
@InstallIn(SingletonComponent::class)
object Module_260 {
    @Provides
    @Singleton
    fun provideRepository260_5(
        api0: Api144_6 = Api144_6(),
        api1: Api184_6 = Api184_6()
    ): Repository260_5 {
        return Repository260_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi260_6(): Api260_6 {
        return Api260_6()
    }
}