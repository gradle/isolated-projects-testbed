package com.awesomeapp.sessionuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.sessionuser.Viewmodel316_1
import com.awesomeapp.sessionuser.Activity316_2
import com.awesomeapp.sessionuser.Activity316_3
import com.awesomeapp.sessionuser.Fragment316_4
import com.awesomeapp.sessionuser.Repository316_5
import com.awesomeapp.profilecheckout.Api204_6
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.mediacart.Api292_6
import com.awesomeapp.sessionuser.Api316_6

@Module
@InstallIn(SingletonComponent::class)
object Module_316 {
    @Provides
    @Singleton
    fun provideRepository316_5(
        api0: Api204_6 = Api204_6(),
        api1: Api312_6 = Api312_6(),
        api2: Api292_6 = Api292_6()
    ): Repository316_5 {
        return Repository316_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi316_6(): Api316_6 {
        return Api316_6()
    }
}