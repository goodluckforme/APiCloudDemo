package com.apicloud.pkg.sdk.mvp.ui.activity

import com.apicloud.pkg.sdk.module.ActivityMainBindingModule
import com.apicloud.pkg.sdk.mvp.ui.base.BaseActivity
import com.apicloud.pkg.sdk.mvp.presenter.MainPresenter
import com.apicloud.pkg.sdk.mvp.contract.MainContract
import com.apicloud.pkg.sdk.component.AppComponent
import com.apicloud.pkg.sdk.component.DaggerMainComponent
import com.apicloud.pkg.sdk.databinding.ActivityMainBinding
import com.apicloud.pkg.sdk.R
import android.databinding.DataBindingUtil

class MainActivity : BaseActivity<MainPresenter, MainContract.View>(), MainContract.View {

    override fun setActivityComponent(appComponent: AppComponent) {
        DaggerMainComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                //.activityMainBindingModule(
                //          ActivityMainBindingModule()
                //                  .apply {
                //                      viewDataBinding = DataBindingUtil
                //                              .setContentView(this@MainActivity, R.layout.activity_main)
                //                  })
                .build()
                .inject(this)
        DataBindingUtil.setContentView<ActivityMainBinding>(this@MainActivity, R.layout.activity_main)
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
