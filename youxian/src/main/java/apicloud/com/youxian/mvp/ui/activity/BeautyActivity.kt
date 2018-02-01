package apicloud.com.youxian.mvp.ui.activity


import apicloud.com.youxian.mvp.ui.activity.base.BaseActivity

import javax.inject.Inject

import apicloud.com.youxian.mvp.presenter.BeautyPresenter
import apicloud.com.youxian.mvp.contract.BeautyContract
import apicloud.com.youxian.component.AppComponent
import apicloud.com.youxian.component.DaggerActivityComponent
import apicloud.com.youxian.R


class BeautyActivity : BaseActivity(), BeautyContract.View {

    @Inject lateinit var beautyPresenter: BeautyPresenter

    override fun setAppComponent(appComponent: AppComponent) {
        DaggerActivityComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .build()
                .inject(this)
    }


    public override fun initView() {
        super.initView()

    }


    public override fun initData() {

    }

    override fun onDestroy() {
        super.onDestroy()
        beautyPresenter.detachView()
    }

    override fun getLayoutRes(): Int {
        return R.layout.activity_beauty
    }

    override fun complete(msg: String) {

    }

    override fun showError(msg: String) {

    }
}
