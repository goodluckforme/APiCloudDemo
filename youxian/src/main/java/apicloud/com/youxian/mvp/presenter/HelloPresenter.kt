package apicloud.com.youxian.mvp.presenter


import android.content.Context

import javax.inject.Inject

import apicloud.com.youxian.App
import apicloud.com.youxian.common.RxPresenter
import apicloud.com.youxian.mvp.contract.HelloContract

class HelloPresenter @Inject
constructor(private val app: App, private val context: Context) : RxPresenter<HelloContract.View>(), HelloContract.Presenter
