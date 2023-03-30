package com.paulo.marvel.mock

import javax.inject.Inject

class MockRepositoryImpl @Inject constructor(): MockRepository {
    override fun getLabel() = "Label"
}