package com.awesomeapp.logidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.logidentity.Viewmodel172_1
import com.awesomeapp.logidentity.Activity172_2
import com.awesomeapp.logidentity.Activity172_3
import com.awesomeapp.logidentity.Fragment172_4
import com.awesomeapp.logidentity.Repository172_5
import com.awesomeapp.cartlogin.Api104_6
import com.awesomeapp.contactlogin.Api100_6
import com.awesomeapp.networklogin.Api112_6
import com.awesomeapp.messagelogin.Api116_6
import com.awesomeapp.sessionlogin.Api120_6
import com.awesomeapp.logidentity.Api172_6

@Module
@InstallIn(SingletonComponent::class)
object Module_172 {
    @Provides
    @Singleton
    fun provideRepository172_5(
        api0: Api104_6 = Api104_6(),
        api1: Api100_6 = Api100_6(),
        api2: Api112_6 = Api112_6(),
        api3: Api116_6 = Api116_6(),
        api4: Api120_6 = Api120_6()
    ): Repository172_5 {
        return Repository172_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi172_6(): Api172_6 {
        return Api172_6()
    }
}