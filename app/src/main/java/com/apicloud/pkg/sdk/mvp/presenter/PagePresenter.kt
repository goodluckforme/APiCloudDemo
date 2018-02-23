package com.apicloud.pkg.sdk.mvp.presenter


import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import com.apicloud.pkg.sdk.R
import com.apicloud.pkg.sdk.api.AppApi
import com.apicloud.pkg.sdk.common.RxPresenter
import com.apicloud.pkg.sdk.data.EndModel
import com.apicloud.pkg.sdk.databinding.FragmentPageBinding
import com.apicloud.pkg.sdk.mvp.contract.PageContract
import com.aspsine.irecyclerview.universaladapter.ViewHolderHelper
import com.aspsine.irecyclerview.universaladapter.recyclerview.CommonRecycleViewAdapter
import org.jetbrains.anko.sdk25.coroutines.onClick
import java.util.*
import javax.inject.Inject

class PagePresenter @Inject constructor(private val appApi: AppApi, private val context: Context) :
        RxPresenter<PageContract.View, FragmentPageBinding>(), PageContract.Presenter {

    fun toInit() {
        mContentView.pageModel = PageModel()
        mContentView.endModel = EndModel(Calendar.getInstance().timeInMillis,
                "点我有惊喜", false)
        mContentView.imageUrl = "http://images.csdn.net/20150810/Blog-Image%E5%89%AF%E6%9C%AC.jpg"
        mContentView.changeTime.onClick {
            mContentView.endModel.time = Calendar.getInstance().timeInMillis
            mContentView.endModel.showRed = !mContentView.endModel.showRed
            mContentView.endModel.showView.set(!mContentView.endModel.showView.get())
        }
        mContentView.layoutManager = LinearLayoutManager(context)
        val baseReclyerViewAdapter = object : CommonRecycleViewAdapter<PageModel>(context, R.layout.item_page) {
            override fun convert(helper: ViewHolderHelper?, t: PageModel?, position: Int) {

            }
        }
        mContentView.adapter = baseReclyerViewAdapter
        for (i in 1..10) {
            baseReclyerViewAdapter.add(PageModel())
        }
    }

    inner class PageModel

}
