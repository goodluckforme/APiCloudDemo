package com.apicloud.pkg.sdk.mvp.ui.activity

import android.databinding.DataBindingUtil
import com.apicloud.pkg.sdk.R
import com.apicloud.pkg.sdk.component.AppComponent
import com.apicloud.pkg.sdk.component.DaggerMainComponent
import com.apicloud.pkg.sdk.databinding.ActivityMainBinding
import com.apicloud.pkg.sdk.mvp.contract.MainContract
import com.apicloud.pkg.sdk.mvp.presenter.MainPresenter
import com.apicloud.pkg.sdk.mvp.ui.base.BaseActivity
import com.apicloud.pkg.sdk.mvp.ui.fragment.PageFragment

class MainActivity : BaseActivity<MainPresenter, MainContract.View, ActivityMainBinding>(), MainContract.View {

    override fun setActivityComponent(appComponent: AppComponent) {
        DaggerMainComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .build()
                .inject(this)
    }

    public override fun initView() {
        super.initView()
        mPresenter.getLayoutRes(DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main))
        supportFragmentManager.beginTransaction().replace(R.id.main_container, PageFragment.newInstance()).commit()
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
