package com.apicloud.pkg.sdk.mvp.presenter


import android.content.Context
import com.apicloud.pkg.sdk.api.AppApi
import com.apicloud.pkg.sdk.common.RxPresenter
import com.apicloud.pkg.sdk.data.UserInfo
import com.apicloud.pkg.sdk.databinding.ActivityMainBinding
import com.apicloud.pkg.sdk.mvp.contract.MainContract
import javax.inject.Inject

class MainPresenter @Inject constructor(private val appApi: AppApi, private val context: Context) :
        RxPresenter<MainContract.View, ActivityMainBinding>(), MainContract.Presenter {

    fun toInit() {
        mContentView.setMainModel(MainModel())
        mContentView.userInfo = UserInfo("马齐", "18", "188")

    }

    inner class MainModel

}
