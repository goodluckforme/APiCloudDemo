package com.apicloud.pkg.sdk.component

import android.content.Context
import com.apicloud.pkg.sdk.api.AppApi
import com.apicloud.pkg.sdk.module.ApiModule
import com.apicloud.pkg.sdk.module.AppModule
import dagger.Component

@Component(modules = arrayOf(AppModule::class, ApiModule::class))
interface AppComponent {
    val context: Context

    val shopApi: AppApi
}