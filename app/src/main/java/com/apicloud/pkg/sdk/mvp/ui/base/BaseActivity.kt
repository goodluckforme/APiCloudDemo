package com.apicloud.pkg.sdk.mvp.ui.base

import android.os.Bundle
import android.content.pm.ActivityInfo
import android.support.v7.app.AppCompatActivity
import com.apicloud.pkg.sdk.App
import com.apicloud.pkg.sdk.component.AppComponent
import com.apicloud.pkg.sdk.common.BaseContract
import com.apicloud.pkg.sdk.common.RxPresenter
import javax.inject.Inject

abstract class BaseActivity<T : RxPresenter<V>, V : BaseContract.BaseView> : AppCompatActivity(), BaseContract.BaseView {
    var isFirst: Boolean = false
    @Inject lateinit var mPresenter: T
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //QMUIStatusBarHelper.translucent(this, Color.parseColor("#ffffff"))
        //竖屏设置
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        setActivityComponent(App.instance.appComponent)
        initView()
    }


    abstract fun setActivityComponent(appComponent: AppComponent)

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus && !isFirst) {
            isFirst = true
            initData()
        }
    }

    protected open fun initView() {

    }

    protected open fun initData() {
    }


    override fun onDestroy() {
        super.onDestroy()
        mPresenter.detachView()
    }

}