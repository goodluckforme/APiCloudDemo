package com.apicloud.pkg.sdk.mvp.ui.activity

import com.apicloud.pkg.sdk.module.ActivityTestBindingModule
import com.apicloud.pkg.sdk.mvp.ui.base.BaseActivity
import com.apicloud.pkg.sdk.mvp.presenter.TestPresenter
import com.apicloud.pkg.sdk.mvp.contract.TestContract
import com.apicloud.pkg.sdk.component.AppComponent
import com.apicloud.pkg.sdk.component.DaggerTestComponent
import com.apicloud.pkg.sdk.databinding.ActivityTestBinding
import com.apicloud.pkg.sdk.R
import android.databinding.DataBindingUtil

class TestActivity : BaseActivity<TestPresenter, TestContract.View>(), TestContract.View {

    override fun setActivityComponent(appComponent: AppComponent) {
        DaggerTestComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .activityTestBindingModule(ActivityTestBindingModule(DataBindingUtil.setContentView(this, R.layout.activity_test)))
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
