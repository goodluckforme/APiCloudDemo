package com.apicloud.pkg.sdk.mvp.contract;

import com.apicloud.pkg.sdk.common.BaseContract;

public interface MainContract {
    interface View extends BaseContract.BaseView {

    }

    interface Presenter extends BaseContract.BasePresenter<View> {

    }
}
