package apicloud.com.youxian.mvp.contract;

import apicloud.com.youxian.common.BaseContract;

public interface MainContract {
    interface View extends BaseContract.BaseView {

    }

    interface Presenter extends BaseContract.BasePresenter<View> {

    }
}
