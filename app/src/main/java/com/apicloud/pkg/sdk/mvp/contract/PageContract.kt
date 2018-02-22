package com.apicloud.pkg.sdk.mvp.contract

import  com.apicloud.pkg.sdk.common.BaseContract

import com.apicloud.pkg.sdk.databinding.FragmentPageBinding

interface PageContract {
    interface View : BaseContract.BaseView

    interface Presenter : BaseContract.BasePresenter<View, FragmentPageBinding>
}
