package com.awesomeapp.groupprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.groupprofile.Viewmodel360_1
import com.awesomeapp.groupprofile.Activity360_2
import com.awesomeapp.groupprofile.Activity360_3
import com.awesomeapp.groupprofile.Fragment360_4
import com.awesomeapp.groupprofile.Repository360_5
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.photoidentity.Api192_6
import com.awesomeapp.playlistidentity.Api196_6
import com.awesomeapp.logincart.Api248_6
import com.awesomeapp.groupprofile.Api360_6

@Module
@InstallIn(SingletonComponent::class)
object Module_360 {
    @Provides
    @Singleton
    fun provideRepository360_5(
        api0: Api288_6 = Api288_6(),
        api1: Api276_6 = Api276_6(),
        api2: Api312_6 = Api312_6(),
        api3: Api212_6 = Api212_6(),
        api4: Api192_6 = Api192_6(),
        api5: Api196_6 = Api196_6(),
        api6: Api248_6 = Api248_6()
    ): Repository360_5 {
        return Repository360_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi360_6(): Api360_6 {
        return Api360_6()
    }
}