package apicloud.com.youxian.mvp.ui.activity


import apicloud.com.youxian.mvp.ui.activity.base.BaseActivity

import javax.inject.Inject

import apicloud.com.youxian.mvp.presenter.HiPresenter
import apicloud.com.youxian.mvp.contract.HiContract
import apicloud.com.youxian.component.AppComponent
import apicloud.com.youxian.component.DaggerActivityComponent
import apicloud.com.youxian.R


class HiActivity : BaseActivity(), HiContract.View {

    @Inject lateinit var hiPresenter: HiPresenter

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
        hiPresenter.detachView()
    }

    override fun getLayoutRes(): Int {
        return R.layout.activity_hi
    }

    override fun complete(msg: String) {

    }

    override fun showError(msg: String) {

    }
}
