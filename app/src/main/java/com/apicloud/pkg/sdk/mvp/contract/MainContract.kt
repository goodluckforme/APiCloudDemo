package com.apicloud.pkg.sdk.mvp.contract

import  com.apicloud.pkg.sdk.common.BaseContract

import com.apicloud.pkg.sdk.databinding.ActivityMainBinding

interface MainContract {
    interface View : BaseContract.BaseView

    interface Presenter : BaseContract.BasePresenter<View, ActivityMainBinding>
}
