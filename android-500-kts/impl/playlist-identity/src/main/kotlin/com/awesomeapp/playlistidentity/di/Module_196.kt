package com.awesomeapp.playlistidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.playlistidentity.Viewmodel196_1
import com.awesomeapp.playlistidentity.Activity196_2
import com.awesomeapp.playlistidentity.Activity196_3
import com.awesomeapp.playlistidentity.Fragment196_4
import com.awesomeapp.playlistidentity.Repository196_5
import com.awesomeapp.groupidentity.Api164_6
import com.awesomeapp.listidentity.Api184_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.playlistidentity.Api196_6

@Module
@InstallIn(SingletonComponent::class)
object Module_196 {
    @Provides
    @Singleton
    fun provideRepository196_5(
        api0: Api164_6 = Api164_6(),
        api1: Api184_6 = Api184_6(),
        api2: Api156_6 = Api156_6(),
        api3: Api132_6 = Api132_6(),
        api4: Api152_6 = Api152_6(),
        api5: Api140_6 = Api140_6(),
        api6: Api128_6 = Api128_6(),
        api7: Api136_6 = Api136_6(),
        api8: Api180_6 = Api180_6()
    ): Repository196_5 {
        return Repository196_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8)
    }

    @Provides
    @Singleton
    fun provideApi196_6(): Api196_6 {
        return Api196_6()
    }
}