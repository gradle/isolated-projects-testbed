package com.awesomeapp.newsprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.newsprofile.Viewmodel384_1
import com.awesomeapp.newsprofile.Activity384_2
import com.awesomeapp.newsprofile.Activity384_3
import com.awesomeapp.newsprofile.Fragment384_4
import com.awesomeapp.newsprofile.Repository384_5
import com.awesomeapp.checkoutprofile.Api348_6
import com.awesomeapp.mapuser.Api332_6
import com.awesomeapp.accountprofile.Api364_6
import com.awesomeapp.sessionuser.Api316_6
import com.awesomeapp.pushprofile.Api344_6
import com.awesomeapp.eventuser.Api324_6
import com.awesomeapp.articleuser.Api336_6
import com.awesomeapp.locationprofile.Api356_6
import com.awesomeapp.galleryuser.Api340_6
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.newsprofile.Api384_6

@Module
@InstallIn(SingletonComponent::class)
object Module_384 {
    @Provides
    @Singleton
    fun provideRepository384_5(
        api0: Api348_6 = Api348_6(),
        api1: Api332_6 = Api332_6(),
        api2: Api364_6 = Api364_6(),
        api3: Api316_6 = Api316_6(),
        api4: Api344_6 = Api344_6(),
        api5: Api324_6 = Api324_6(),
        api6: Api336_6 = Api336_6(),
        api7: Api356_6 = Api356_6(),
        api8: Api340_6 = Api340_6(),
        api9: Api320_6 = Api320_6()
    ): Repository384_5 {
        return Repository384_5(api0, 
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
    fun provideApi384_6(): Api384_6 {
        return Api384_6()
    }
}