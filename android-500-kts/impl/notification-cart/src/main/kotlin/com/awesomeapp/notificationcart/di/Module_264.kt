package com.awesomeapp.notificationcart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.notificationcart.Viewmodel264_1
import com.awesomeapp.notificationcart.Activity264_2
import com.awesomeapp.notificationcart.Activity264_3
import com.awesomeapp.notificationcart.Fragment264_4
import com.awesomeapp.notificationcart.Repository264_5
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.gallerylogin.Api144_6
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.accountidentity.Api168_6
import com.awesomeapp.notificationcart.Api264_6

@Module
@InstallIn(SingletonComponent::class)
object Module_264 {
    @Provides
    @Singleton
    fun provideRepository264_5(
        api0: Api160_6 = Api160_6(),
        api1: Api148_6 = Api148_6(),
        api2: Api140_6 = Api140_6(),
        api3: Api180_6 = Api180_6(),
        api4: Api136_6 = Api136_6(),
        api5: Api156_6 = Api156_6(),
        api6: Api144_6 = Api144_6(),
        api7: Api132_6 = Api132_6(),
        api8: Api168_6 = Api168_6()
    ): Repository264_5 {
        return Repository264_5(api0, 
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
    fun provideApi264_6(): Api264_6 {
        return Api264_6()
    }
}