package com.apicloud.pkg.sdk

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.support.multidex.MultiDex
import com.apicloud.pkg.sdk.component.AppComponent
import com.apicloud.pkg.sdk.component.DaggerAppComponent
import com.apicloud.pkg.sdk.moudle.AppModule
import com.apicloud.pkg.sdk.utils.SharedPreferencesUtil
import com.uzmap.pkg.uzapp.UZApplication

/**
 * Created by MaQi on 2018/2/1.
 */

class App : UZApplication() {

    override fun onCreate() {
        super.onCreate()
        instance = this
        SharedPreferencesUtil.init(this, packageName + "_preference", Context.MODE_PRIVATE)
    }

    companion object {
        lateinit var instance: App
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }

    val mainHandler: Handler by lazy {
        Handler(Looper.getMainLooper())
    }
}
