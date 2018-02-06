package apicloud.com.youxian.mvp.mvp.contract;

import apicloud.com.youxian.mvp.common.BaseContract;

public interface MainSSContract {
    interface View extends BaseContract.BaseView {

    }

    interface Presenter extends BaseContract.BasePresenter<View> {

    }
}
