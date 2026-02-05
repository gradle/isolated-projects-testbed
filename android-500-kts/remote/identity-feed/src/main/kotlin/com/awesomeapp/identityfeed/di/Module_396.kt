package com.awesomeapp.identityfeed.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.identityfeed.Viewmodel396_1
import com.awesomeapp.identityfeed.Activity396_2
import com.awesomeapp.identityfeed.Activity396_3
import com.awesomeapp.identityfeed.Fragment396_4
import com.awesomeapp.identityfeed.Repository396_5
import com.awesomeapp.checkoutprofile.Api348_6
import com.awesomeapp.documentuser.Api328_6
import com.awesomeapp.feedprofile.Api352_6
import com.awesomeapp.accountprofile.Api364_6
import com.awesomeapp.eventuser.Api324_6
import com.awesomeapp.locationprofile.Api356_6
import com.awesomeapp.sessionuser.Api316_6
import com.awesomeapp.mapuser.Api332_6
import com.awesomeapp.articleuser.Api336_6
import com.awesomeapp.groupprofile.Api360_6
import com.awesomeapp.identityfeed.Api396_6

@Module
@InstallIn(SingletonComponent::class)
object Module_396 {
    @Provides
    @Singleton
    fun provideRepository396_5(
        api0: Api348_6 = Api348_6(),
        api1: Api328_6 = Api328_6(),
        api2: Api352_6 = Api352_6(),
        api3: Api364_6 = Api364_6(),
        api4: Api324_6 = Api324_6(),
        api5: Api356_6 = Api356_6(),
        api6: Api316_6 = Api316_6(),
        api7: Api332_6 = Api332_6(),
        api8: Api336_6 = Api336_6(),
        api9: Api360_6 = Api360_6()
    ): Repository396_5 {
        return Repository396_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9)
    }

    @Provides
    @Singleton
    fun provideApi396_6(): Api396_6 {
        return Api396_6()
    }
}