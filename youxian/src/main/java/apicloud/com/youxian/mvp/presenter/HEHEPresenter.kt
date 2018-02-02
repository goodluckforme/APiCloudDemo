package apicloud.com.youxian.mvp.presenter


import android.content.Context
import apicloud.com.youxian.App
import apicloud.com.youxian.common.RxPresenter
import apicloud.com.youxian.mvp.contract.HEHEContract
import javax.inject.Inject

class HEHEPresenter @Inject
constructor(private val app: App, private val context: Context) : RxPresenter<HEHEContract.View>(), HEHEContract.Presenter
