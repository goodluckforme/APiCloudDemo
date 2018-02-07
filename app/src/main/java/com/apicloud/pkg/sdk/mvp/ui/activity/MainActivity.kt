package com.apicloud.pkg.sdk.mvp.ui.activity


import com.apicloud.pkg.sdk.mvp.ui.base.BaseActivity
import javax.inject.Inject
import com.apicloud.pkg.sdk.mvp.presenter.MainPresenter
import com.apicloud.pkg.sdk.mvp.contract.MainContract
import com.apicloud.pkg.sdk.component.AppComponent
import com.apicloud.pkg.sdk.component.DaggerActivityComponent
import com.apicloud.pkg.sdk.R


class MainActivity : BaseActivity(), MainContract.View {

    @Inject lateinit var mainPresenter: MainPresenter

    override fun setActivityComponent(appComponent: AppComponent) {
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
        mainPresenter.detachView()
    }


    override fun getLayoutRes(): Int = R.layout.activity_main


    override fun complete(msg: String) {

    }

    override fun showError(msg: String) {

    }
}
