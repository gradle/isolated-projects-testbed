package com.awesomeapp.articleuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.articleuser.Viewmodel336_1
import com.awesomeapp.articleuser.Activity336_2
import com.awesomeapp.articleuser.Activity336_3
import com.awesomeapp.articleuser.Fragment336_4
import com.awesomeapp.articleuser.Repository336_5
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.articleuser.Api336_6

@Module
@InstallIn(SingletonComponent::class)
object Module_336 {
    @Provides
    @Singleton
    fun provideRepository336_5(
        api0: Api252_6 = Api252_6(),
        api1: Api208_6 = Api208_6(),
        api2: Api268_6 = Api268_6(),
        api3: Api240_6 = Api240_6(),
        api4: Api304_6 = Api304_6(),
        api5: Api256_6 = Api256_6(),
        api6: Api232_6 = Api232_6(),
        api7: Api260_6 = Api260_6()
    ): Repository336_5 {
        return Repository336_5(api0, 
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
    fun provideApi336_6(): Api336_6 {
        return Api336_6()
    }
}