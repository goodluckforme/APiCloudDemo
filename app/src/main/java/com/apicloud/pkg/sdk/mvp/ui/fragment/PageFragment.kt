package com.apicloud.pkg.sdk.mvp.ui.fragment

import com.apicloud.pkg.sdk.R
import com.apicloud.pkg.sdk.component.AppComponent
import com.apicloud.pkg.sdk.component.DaggerPageComponent
import com.apicloud.pkg.sdk.databinding.FragmentPageBinding
import com.apicloud.pkg.sdk.mvp.contract.PageContract
import com.apicloud.pkg.sdk.mvp.presenter.PagePresenter
import com.apicloud.pkg.sdk.mvp.ui.base.BaseFragment

class PageFragment : BaseFragment<PagePresenter, PageContract.View, FragmentPageBinding>(), PageContract.View {

    companion object {
        fun newInstance(): PageFragment {
            return PageFragment()
        }
    }

    override fun setFragmentComponent(appComponent: AppComponent) {
        DaggerPageComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .build()
                .inject(this)
    }


    override fun attachView() {
        mPresenter.attachView(this)
        mPresenter.getLayoutRes(mDataBinding ?: return)
    }


    override fun initData() {
        mPresenter.toInit()
    }

    override fun getLayoutRes(): Int = R.layout.fragment_page


    override fun complete(msg: String) {

    }

    override fun showError(msg: String) {

    }

    override fun detachView() {
        mPresenter.detachView()
    }
}
