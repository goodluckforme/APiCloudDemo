package apicloud.com.youxian.mvp.contract

import apicloud.com.youxian.common.BaseContract

interface BeautyContract {
    interface View : BaseContract.BaseView

    interface Presenter : BaseContract.BasePresenter<View>
}
