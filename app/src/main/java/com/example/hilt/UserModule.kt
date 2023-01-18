package com.example.hilt

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import javax.inject.Named

@InstallIn(FragmentComponent::class)
@Module
class UserModule {

    @Provides
    @Named("sql")
    fun providesSQLRepository(sqlRepository: SQLRepository): UserRepository{
        return sqlRepository
    }

    @Provides
    @FirebaseQualifier
    fun providesUserRepository(): UserRepository{
        return FirebaseRepository()
    }
//    @Binds
//    abstract fun bindsUserRepository(sqlRepository: SQLRepository): UserRepository
}