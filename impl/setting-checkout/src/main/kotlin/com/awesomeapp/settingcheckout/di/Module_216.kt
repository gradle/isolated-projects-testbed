package com.awesomeapp.settingcheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.settingcheckout.Viewmodel216_1
import com.awesomeapp.settingcheckout.Activity216_2
import com.awesomeapp.settingcheckout.Activity216_3
import com.awesomeapp.settingcheckout.Fragment216_4
import com.awesomeapp.settingcheckout.Repository216_5
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.groupidentity.Api164_6
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.settingcheckout.Api216_6

@Module
@InstallIn(SingletonComponent::class)
object Module_216 {
    @Provides
    @Singleton
    fun provideRepository216_5(
        api0: Api132_6 = Api132_6(),
        api1: Api160_6 = Api160_6(),
        api2: Api128_6 = Api128_6(),
        api3: Api180_6 = Api180_6(),
        api4: Api164_6 = Api164_6(),
        api5: Api140_6 = Api140_6(),
        api6: Api136_6 = Api136_6(),
        api7: Api152_6 = Api152_6()
    ): Repository216_5 {
        return Repository216_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7)
    }

    @Provides
    @Singleton
    fun provideApi216_6(): Api216_6 {
        return Api216_6()
    }
}