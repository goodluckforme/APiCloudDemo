package apicloud.com.youxian.mvp.ui.fragment

import javax.inject.Inject
import apicloud.com.youxian.mvp.presenter.HEHEPresenter
import apicloud.com.youxian.mvp.contract.HEHEContract
import apicloud.com.youxian.component.AppComponent
import apicloud.com.youxian.component.DaggerActivityComponent
import apicloud.com.youxian.mvp.ui.base.BaseFragment
import apicloud.com.youxian.R

class HEHEFragment : BaseFragment(), HEHEContract.View {

    @Inject lateinit var hEHEPresenter: HEHEPresenter

    companion object {
        fun newInstance(): HEHEFragment {
            return HEHEFragment()
        }
    }

    override fun setFragmentComponent(appComponent: AppComponent) {
        DaggerActivityComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .build()
                .inject(this)
    }


    override fun attachView() {

    }


    public override fun initData() {

    }

    override fun getLayoutRes(): Int = R.layout.fragment_hehe


    override fun complete(msg: String) {

    }

    override fun showError(msg: String) {

    }

    override fun detachView() {
        hEHEPresenter.detachView()
    }
}
