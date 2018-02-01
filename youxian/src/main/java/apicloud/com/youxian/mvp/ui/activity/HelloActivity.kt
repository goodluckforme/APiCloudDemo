package apicloud.com.youxian.mvp.ui.activity


import apicloud.com.youxian.mvp.ui.activity.base.BaseActivity

import javax.inject.Inject

import apicloud.com.youxian.mvp.presenter.HelloPresenter
import apicloud.com.youxian.mvp.contract.HelloContract
import apicloud.com.youxian.component.AppComponent
import apicloud.com.youxian.component.DaggerActivityComponent
import apicloud.com.youxian.R


class HelloActivity : BaseActivity(), HelloContract.View {

    @Inject
    lateinit var helloPresenter: HelloPresenter

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
        helloPresenter.detachView()
    }

    override fun getLayoutRes(): Int {
        return R.layout.activity_hello
    }

    override fun complete(msg: String) {

    }

    override fun showError(msg: String) {

    }
}
