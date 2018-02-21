package com.apicloud.pkg.sdk.mvp.presenter


import android.content.Context
import javax.inject.Inject
import com.apicloud.pkg.sdk.api.AppApi
import com.apicloud.pkg.sdk.common.RxPresenter
//import com.apicloud.pkg.sdk.databinding.ActivityMainBinding
import com.apicloud.pkg.sdk.mvp.contract.MainContract

class MainPresenter @Inject constructor(private val appApi: AppApi, private val context: Context
//,private val binding: ActivityMainBinding
) : RxPresenter<MainContract.View>(), MainContract.Presenter {

    fun toInit() {
        // binding.setMainModel(MainModel())
    }

    inner class MainModel

}
