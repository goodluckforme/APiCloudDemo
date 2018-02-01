package apicloud.com.youxian.mvp.presenter


import android.content.Context

import javax.inject.Inject

import apicloud.com.youxian.App
import apicloud.com.youxian.common.RxPresenter
import apicloud.com.youxian.mvp.contract.BeautyContract

class BeautyPresenter @Inject
constructor(private val app: App, private val context: Context) : RxPresenter<BeautyContract.View>(), BeautyContract.Presenter
