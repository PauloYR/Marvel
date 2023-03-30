package com.paulo.marvel

import com.paulo.marvel.mock.MockRepository
import com.paulo.marvel.mock.MockRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class MarvelModule {
    @Binds
    @Singleton
    abstract fun provideMockRepository(mockRepositoryImpl: MockRepositoryImpl): MockRepository
}