package com.apicloud.pkg.sdk.mvp.ui.base

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.apicloud.pkg.sdk.App
import com.apicloud.pkg.sdk.common.BaseContract
import com.apicloud.pkg.sdk.common.RxPresenter
import com.apicloud.pkg.sdk.component.AppComponent
import javax.inject.Inject

abstract class BaseFragment<T : RxPresenter<V, M>, V : BaseContract.BaseView, M : ViewDataBinding> : Fragment() {

    var isViewPrepared: Boolean = false
    var hasFetchData: Boolean = false
    @Inject lateinit var mPresenter: T
    protected var mDataBinding: M? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        if (null == mDataBinding) {
            mDataBinding = DataBindingUtil.inflate(inflater, getLayoutRes(), container, false)
        }
        return mDataBinding?.root
    }

    protected abstract fun getLayoutRes(): Int

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.i("test", "=============onViewCreated=============" + this)
        super.onViewCreated(view, savedInstanceState)
        setFragmentComponent(App.instance.appComponent)
        attachView()
        isViewPrepared = true
        lazyFetchDataIfPrepared()
    }

    abstract fun attachView()

    abstract fun detachView()

    abstract fun setFragmentComponent(appComponent: AppComponent)

    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        super.setUserVisibleHint(isVisibleToUser)
        if (isVisibleToUser) {
            lazyFetchDataIfPrepared()
        }
    }

    private fun lazyFetchDataIfPrepared() {
        // 用户可见fragment && 没有加载过数据 && 视图已经准备完毕
        Log.i("test", "userVisibleHint=============" + userVisibleHint + "======hasFetchData======" + hasFetchData + "======" + "isViewPrepared=============" + isViewPrepared + this::class.java.simpleName)
        if (userVisibleHint && !hasFetchData && isViewPrepared) {
            hasFetchData = true
            initData()
        }
    }

    /**
     * 初始化方法
     */
    protected open fun initData() {}

    override fun onDestroyView() {
        super.onDestroyView()
        detachView()
//        hasFetchData = false
//        isViewPrepared = false
    }

    /**
     * 只有show 和 hide 才会调用
     */
    override fun onHiddenChanged(hidden: Boolean) {
        super.onHiddenChanged(hidden)
        Log.i("onHiddenChanged", "onHiddenChanged========" + this + hidden)
    }
}
