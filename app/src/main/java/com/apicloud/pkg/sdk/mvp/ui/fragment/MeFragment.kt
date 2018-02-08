package com.apicloud.pkg.sdk.mvp.ui.fragment

import com.apicloud.pkg.sdk.R
import com.apicloud.pkg.sdk.component.AppComponent
import com.apicloud.pkg.sdk.component.DaggerFragmentComponent
import com.apicloud.pkg.sdk.data.UserInfo
import com.apicloud.pkg.sdk.databinding.FragmentMeBinding
import com.apicloud.pkg.sdk.mvp.contract.MeContract
import com.apicloud.pkg.sdk.mvp.presenter.MePresenter
import com.apicloud.pkg.sdk.mvp.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_me.*
import org.jetbrains.anko.sdk25.coroutines.onClick
import javax.inject.Inject


class MeFragment : BaseFragment<FragmentMeBinding>(), MeContract.View {

    @Inject lateinit var mePresenter: MePresenter

    override fun setFragmentComponent(appComponent: AppComponent) {
        DaggerFragmentComponent//如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .build()
                .inject(this)
    }

    val userInfo = UserInfo("430074", "TYPE_MAN", "500W")

    override fun attachView() {
        binding?.userInfo = userInfo
        changeValue.onClick {
            userInfo.member_name = "改变了值哦!!"
        }
    }

    public override fun initData() {

    }

    public override fun getLayoutRes(): Int {
        return R.layout.fragment_me
    }

    override fun complete(msg: String) {

    }

    override fun showError(msg: String) {

    }


    override fun detachView() {
        mePresenter!!.detachView()
    }

    companion object {
        fun newInstance(): MeFragment {
            return MeFragment()
        }
    }
}
