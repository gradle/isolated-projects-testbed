package com.awesomeapp.todo.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.todo.Viewmodel36_1
import com.awesomeapp.todo.Activity36_2
import com.awesomeapp.todo.Activity36_3
import com.awesomeapp.todo.Fragment36_4
import com.awesomeapp.todo.Repository36_5
import com.awesomeapp.report.Api24_6
import com.awesomeapp.task.Api28_6
import com.awesomeapp.todo.Api36_6

@Module
@InstallIn(SingletonComponent::class)
object Module_36 {
    @Provides
    @Singleton
    fun provideRepository36_5(
        api0: Api24_6 = Api24_6(),
        api1: Api28_6 = Api28_6()
    ): Repository36_5 {
        return Repository36_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi36_6(): Api36_6 {
        return Api36_6()
    }
}