package com.awesomeapp.articlelogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.articlelogin.Viewmodel140_1
import com.awesomeapp.articlelogin.Activity140_2
import com.awesomeapp.articlelogin.Activity140_3
import com.awesomeapp.articlelogin.Fragment140_4
import com.awesomeapp.articlelogin.Repository140_5
import com.awesomeapp.networklogin.Api112_6
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.articlelogin.Api140_6

@Module
@InstallIn(SingletonComponent::class)
object Module_140 {
    @Provides
    @Singleton
    fun provideRepository140_5(
        api0: Api112_6 = Api112_6(),
        api1: Api108_6 = Api108_6()
    ): Repository140_5 {
        return Repository140_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi140_6(): Api140_6 {
        return Api140_6()
    }
}