package com.apicloud.pkg.sdk.mvp.presenter


import android.content.Context
import com.apicloud.pkg.sdk.api.AppApi
import com.apicloud.pkg.sdk.common.RxPresenter
import com.apicloud.pkg.sdk.data.EndModel
import com.apicloud.pkg.sdk.databinding.FragmentPageBinding
import com.apicloud.pkg.sdk.mvp.contract.PageContract
import org.jetbrains.anko.sdk25.coroutines.onClick
import java.util.*
import javax.inject.Inject

class PagePresenter @Inject constructor(private val appApi: AppApi, private val context: Context) :
        RxPresenter<PageContract.View, FragmentPageBinding>(), PageContract.Presenter {

    fun toInit() {
        mContentView.pageModel = PageModel()
        mContentView.endModel = EndModel(Calendar.getInstance().timeInMillis, "点我有惊喜")
        mContentView.changeTime.onClick {
            mContentView.endModel.time = Calendar.getInstance().timeInMillis
        }
    }

    inner class PageModel

}
