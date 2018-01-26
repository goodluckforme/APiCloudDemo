package apicloud.com.youxian.mvp.ui.activity


import android.content.Intent
import android.os.Bundle
import apicloud.com.youxian.R
import apicloud.com.youxian.di.component.DaggerMeComponent
import apicloud.com.youxian.di.module.MeModule
import apicloud.com.youxian.mvp.contract.MeContract
import apicloud.com.youxian.mvp.presenter.MePresenter
import com.jess.arms.base.BaseActivity
import com.jess.arms.di.component.AppComponent
import com.jess.arms.utils.ArmsUtils
import com.jess.arms.utils.Preconditions.checkNotNull


class MeActivity : BaseActivity<MePresenter>(), MeContract.View {

    override fun setupActivityComponent(appComponent: AppComponent) {
        DaggerMeComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .meModule(MeModule(this))
                .build()
                .inject(this)
    }

    override fun initView(savedInstanceState: Bundle): Int {
        return R.layout.activity_me //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    override fun initData(savedInstanceState: Bundle?) {
        mPresenter?.showDatas()
    }


    override fun showLoading() {

    }

    override fun hideLoading() {
        ArmsUtils.snackbarText("哈哈你来追我啊！")
    }

    override fun showMessage(message: String) {
        checkNotNull(message)
        ArmsUtils.snackbarText(message)
    }

    override fun launchActivity(intent: Intent) {
        checkNotNull(intent)
        ArmsUtils.startActivity(intent)
    }

    override fun killMyself() {
        finish()
    }
}
