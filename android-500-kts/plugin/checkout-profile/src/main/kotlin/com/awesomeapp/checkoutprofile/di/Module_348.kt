package com.awesomeapp.checkoutprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.checkoutprofile.Viewmodel348_1
import com.awesomeapp.checkoutprofile.Activity348_2
import com.awesomeapp.checkoutprofile.Activity348_3
import com.awesomeapp.checkoutprofile.Fragment348_4
import com.awesomeapp.checkoutprofile.Repository348_5
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.metriccart.Api272_6
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.profilecheckout.Api204_6
import com.awesomeapp.mediacart.Api292_6
import com.awesomeapp.contactuser.Api296_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.newsidentity.Api188_6
import com.awesomeapp.audiocheckout.Api244_6
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.photoidentity.Api192_6
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.logincart.Api248_6
import com.awesomeapp.settingcheckout.Api216_6
import com.awesomeapp.notificationcart.Api264_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.weathercart.Api284_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.checkoutprofile.Api348_6

@Module
@InstallIn(SingletonComponent::class)
object Module_348 {
    @Provides
    @Singleton
    fun provideRepository348_5(
        api0: Api288_6 = Api288_6(),
        api1: Api272_6 = Api272_6(),
        api2: Api252_6 = Api252_6(),
        api3: Api308_6 = Api308_6(),
        api4: Api268_6 = Api268_6(),
        api5: Api212_6 = Api212_6(),
        api6: Api280_6 = Api280_6(),
        api7: Api204_6 = Api204_6(),
        api8: Api292_6 = Api292_6(),
        api9: Api296_6 = Api296_6(),
        api10: Api304_6 = Api304_6(),
        api11: Api188_6 = Api188_6(),
        api12: Api244_6 = Api244_6(),
        api13: Api300_6 = Api300_6(),
        api14: Api192_6 = Api192_6(),
        api15: Api208_6 = Api208_6(),
        api16: Api232_6 = Api232_6(),
        api17: Api248_6 = Api248_6(),
        api18: Api216_6 = Api216_6(),
        api19: Api264_6 = Api264_6(),
        api20: Api240_6 = Api240_6(),
        api21: Api224_6 = Api224_6(),
        api22: Api284_6 = Api284_6(),
        api23: Api276_6 = Api276_6()
    ): Repository348_5 {
        return Repository348_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9, 
        api10, 
        api11, 
        api12, 
        api13, 
        api14, 
        api15, 
        api16, 
        api17, 
        api18, 
        api19, 
        api20, 
        api21, 
        api22, 
        api23)
    }

    @Provides
    @Singleton
    fun provideApi348_6(): Api348_6 {
        return Api348_6()
    }
}