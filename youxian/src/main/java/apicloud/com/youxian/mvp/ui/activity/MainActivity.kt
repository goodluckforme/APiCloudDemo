package apicloud.com.youxian.mvp.ui.activity


import apicloud.com.youxian.mvp.ui.base.BaseActivity
import javax.inject.Inject
import apicloud.com.youxian.mvp.presenter.MainPresenter
import apicloud.com.youxian.mvp.contract.MainContract
import apicloud.com.youxian.component.AppComponent
import apicloud.com.youxian.component.DaggerActivityComponent
import apicloud.com.youxian.R


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
