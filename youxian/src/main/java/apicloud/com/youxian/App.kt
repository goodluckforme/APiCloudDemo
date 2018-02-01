package apicloud.com.youxian

import android.app.Application
import apicloud.com.youxian.component.AppComponent
import apicloud.com.youxian.component.DaggerAppComponent
import apicloud.com.youxian.module.AppModule

/**
 * Created by MaQi on 2018/2/1.
 */

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        lateinit var instance: App
    }

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }

}
