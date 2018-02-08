package com.apicloud.pkg.sdk.mvp.contract;

import com.apicloud.pkg.sdk.common.BaseContract;

public interface MeContract {
    interface View extends BaseContract.BaseView {

    }

    interface Presenter extends BaseContract.BasePresenter<View> {

    }
}
