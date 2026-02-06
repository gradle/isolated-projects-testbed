package com.awesomeapp.metriccart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.metriccart.Viewmodel272_1
import com.awesomeapp.metriccart.Activity272_2
import com.awesomeapp.metriccart.Activity272_3
import com.awesomeapp.metriccart.Fragment272_4
import com.awesomeapp.metriccart.Repository272_5
import com.awesomeapp.listidentity.Api184_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.groupidentity.Api164_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.gallerylogin.Api144_6
import com.awesomeapp.accountidentity.Api168_6
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.metriccart.Api272_6

@Module
@InstallIn(SingletonComponent::class)
object Module_272 {
    @Provides
    @Singleton
    fun provideRepository272_5(
        api0: Api184_6 = Api184_6(),
        api1: Api180_6 = Api180_6(),
        api2: Api164_6 = Api164_6(),
        api3: Api136_6 = Api136_6(),
        api4: Api140_6 = Api140_6(),
        api5: Api144_6 = Api144_6(),
        api6: Api168_6 = Api168_6(),
        api7: Api128_6 = Api128_6(),
        api8: Api132_6 = Api132_6(),
        api9: Api148_6 = Api148_6(),
        api10: Api152_6 = Api152_6()
    ): Repository272_5 {
        return Repository272_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9, 
        api10)
    }

    @Provides
    @Singleton
    fun provideApi272_6(): Api272_6 {
        return Api272_6()
    }
}