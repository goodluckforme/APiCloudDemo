package com.apicloud.pkg.sdk.mvp.ui.activity


import android.databinding.DataBindingUtil
import com.apicloud.pkg.sdk.R
import com.apicloud.pkg.sdk.component.AppComponent
import com.apicloud.pkg.sdk.component.DaggerActivityMainComponent
import com.apicloud.pkg.sdk.moudle.ActivityMainBindingModule
import com.apicloud.pkg.sdk.mvp.contract.MainContract
import com.apicloud.pkg.sdk.mvp.presenter.MainPresenter
import com.apicloud.pkg.sdk.mvp.ui.base.BaseActivity
import com.apicloud.pkg.sdk.mvp.ui.fragment.MeFragment


class MainActivity : BaseActivity<MainPresenter, MainContract.View>(), MainContract.View {

    override fun setActivityComponent(appComponent: AppComponent) {
        DaggerActivityMainComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .activityMainBindingModule(ActivityMainBindingModule(DataBindingUtil.setContentView(this, R.layout.activity_main)))
                .build()
                .inject(this)
    }

    public override fun initData() {
        mPresenter.attachView(this)
        mPresenter.toInit()
        supportFragmentManager.beginTransaction().replace(R.id.container, MeFragment.newInstance()).commit()
    }

    override fun complete(msg: String) {

    }

    override fun showError(msg: String) {

    }
}
