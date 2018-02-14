package com.apicloud.pkg.sdk.mvp.presenter


import android.content.Context
import javax.inject.Inject
import com.apicloud.pkg.sdk.api.AppApi
import com.apicloud.pkg.sdk.common.RxPresenter
import com.apicloud.pkg.sdk.mvp.contract.MainContract
import com.apicloud.pkg.sdk.databinding.ActivityMainBinding

class MainPresenter @Inject constructor(private val appApi: AppApi,private val context: Context,private val binding: ActivityMainBinding) : RxPresenter<MainContract.View>(), MainContract.Presenter {

    fun toInit() {
        binding.mainModel = MainModel()
    }

    inner class MainModel

}
