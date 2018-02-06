package apicloud.com.youxian.component.mvp.contract;

import apicloud.com.youxian.component.common.BaseContract;

public interface MainQAContract {
    interface View extends BaseContract.BaseView {

    }

    interface Presenter extends BaseContract.BasePresenter<View> {

    }
}
