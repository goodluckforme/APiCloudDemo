package com.apicloud.pkg.sdk.mvp.presenter


import android.content.Context
import javax.inject.Inject
import com.apicloud.pkg.sdk.api.AppApi
import com.apicloud.pkg.sdk.common.RxPresenter
import com.apicloud.pkg.sdk.mvp.contract.HelloContract
import com.apicloud.pkg.sdk.databinding.ActivityHelloBinding

class HelloPresenter @Inject constructor(private val appApi: AppApi,private val context: Context,private val binding: ActivityHelloBinding) : RxPresenter<HelloContract.View>(), HelloContract.Presenter {

    fun toInit() {
        binding.helloModel = HelloModel()
    }

    inner class HelloModel

}
