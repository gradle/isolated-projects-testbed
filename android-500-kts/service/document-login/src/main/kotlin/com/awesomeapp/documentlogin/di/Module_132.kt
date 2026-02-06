package com.awesomeapp.documentlogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.documentlogin.Viewmodel132_1
import com.awesomeapp.documentlogin.Activity132_2
import com.awesomeapp.documentlogin.Activity132_3
import com.awesomeapp.documentlogin.Fragment132_4
import com.awesomeapp.documentlogin.Repository132_5
import com.awesomeapp.mediacontact.Api96_6
import com.awesomeapp.documentlogin.Api132_6

@Module
@InstallIn(SingletonComponent::class)
object Module_132 {
    @Provides
    @Singleton
    fun provideRepository132_5(
        api0: Api96_6 = Api96_6()
    ): Repository132_5 {
        return Repository132_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi132_6(): Api132_6 {
        return Api132_6()
    }
}