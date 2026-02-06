package com.awesomeapp.settingfeed.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.settingfeed.Viewmodel412_1
import com.awesomeapp.settingfeed.Activity412_2
import com.awesomeapp.settingfeed.Activity412_3
import com.awesomeapp.settingfeed.Fragment412_4
import com.awesomeapp.settingfeed.Repository412_5
import com.awesomeapp.identityfeed.Api396_6
import com.awesomeapp.searchfeed.Api404_6
import com.awesomeapp.listprofile.Api380_6
import com.awesomeapp.fileprofile.Api376_6
import com.awesomeapp.newsprofile.Api384_6
import com.awesomeapp.playlistprofile.Api392_6
import com.awesomeapp.photoprofile.Api388_6
import com.awesomeapp.profilefeed.Api400_6
import com.awesomeapp.settingfeed.Api412_6

@Module
@InstallIn(SingletonComponent::class)
object Module_412 {
    @Provides
    @Singleton
    fun provideRepository412_5(
        api0: Api396_6 = Api396_6(),
        api1: Api404_6 = Api404_6(),
        api2: Api380_6 = Api380_6(),
        api3: Api376_6 = Api376_6(),
        api4: Api384_6 = Api384_6(),
        api5: Api392_6 = Api392_6(),
        api6: Api388_6 = Api388_6(),
        api7: Api400_6 = Api400_6()
    ): Repository412_5 {
        return Repository412_5(api0, 
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
    fun provideApi412_6(): Api412_6 {
        return Api412_6()
    }
}