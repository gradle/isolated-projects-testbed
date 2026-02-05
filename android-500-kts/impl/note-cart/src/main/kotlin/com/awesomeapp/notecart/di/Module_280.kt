package com.awesomeapp.notecart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.notecart.Viewmodel280_1
import com.awesomeapp.notecart.Activity280_2
import com.awesomeapp.notecart.Activity280_3
import com.awesomeapp.notecart.Fragment280_4
import com.awesomeapp.notecart.Repository280_5
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.groupidentity.Api164_6
import com.awesomeapp.notecart.Api280_6

@Module
@InstallIn(SingletonComponent::class)
object Module_280 {
    @Provides
    @Singleton
    fun provideRepository280_5(
        api0: Api152_6 = Api152_6(),
        api1: Api164_6 = Api164_6()
    ): Repository280_5 {
        return Repository280_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi280_6(): Api280_6 {
        return Api280_6()
    }
}