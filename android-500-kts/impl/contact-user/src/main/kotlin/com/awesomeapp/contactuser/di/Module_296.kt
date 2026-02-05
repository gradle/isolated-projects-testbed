package com.awesomeapp.contactuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.contactuser.Viewmodel296_1
import com.awesomeapp.contactuser.Activity296_2
import com.awesomeapp.contactuser.Activity296_3
import com.awesomeapp.contactuser.Fragment296_4
import com.awesomeapp.contactuser.Repository296_5
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.groupidentity.Api164_6
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.accountidentity.Api168_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.contactuser.Api296_6

@Module
@InstallIn(SingletonComponent::class)
object Module_296 {
    @Provides
    @Singleton
    fun provideRepository296_5(
        api0: Api136_6 = Api136_6(),
        api1: Api164_6 = Api164_6(),
        api2: Api128_6 = Api128_6(),
        api3: Api168_6 = Api168_6(),
        api4: Api156_6 = Api156_6(),
        api5: Api132_6 = Api132_6()
    ): Repository296_5 {
        return Repository296_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi296_6(): Api296_6 {
        return Api296_6()
    }
}