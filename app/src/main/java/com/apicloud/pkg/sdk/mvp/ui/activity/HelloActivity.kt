package com.apicloud.pkg.sdk.mvp.ui.activity

import com.apicloud.pkg.sdk.module.ActivityHelloBindingModule
import com.apicloud.pkg.sdk.mvp.ui.base.BaseActivity
import com.apicloud.pkg.sdk.mvp.presenter.HelloPresenter
import com.apicloud.pkg.sdk.mvp.contract.HelloContract
import com.apicloud.pkg.sdk.component.AppComponent
import com.apicloud.pkg.sdk.component.DaggerHelloComponent
import com.apicloud.pkg.sdk.databinding.ActivityHelloBinding
import com.apicloud.pkg.sdk.R
import android.databinding.DataBindingUtil

class HelloActivity : BaseActivity<HelloPresenter, HelloContract.View>(), HelloContract.View {

    override fun setActivityComponent(appComponent: AppComponent) {
        DaggerHelloComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .activityHelloBindingModule(ActivityHelloBindingModule(DataBindingUtil.setContentView(this, R.layout.activity_hello)))
                .build()
                .inject(this)
    }

    public override fun initView() {
        super.initView()
    }

    public override fun initData() {
        super.initData()
        mPresenter.attachView(this)
        mPresenter.toInit()
    }

    override fun complete(msg: String) {

    }

    override fun showError(msg: String) {

    }
}
