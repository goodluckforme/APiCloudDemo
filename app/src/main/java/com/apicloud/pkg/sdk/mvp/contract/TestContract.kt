package com.apicloud.pkg.sdk.mvp.contract

import com.apicloud.pkg.sdk.common.BaseContract

interface TestContract {
    interface View : BaseContract.BaseView

    interface Presenter : BaseContract.BasePresenter<View>
}
