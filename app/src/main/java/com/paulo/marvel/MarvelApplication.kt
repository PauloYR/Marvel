package com.paulo.marvel

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class MarvelApplication: Application() {


    override fun onCreate(){
        super.onCreate()

    }
}