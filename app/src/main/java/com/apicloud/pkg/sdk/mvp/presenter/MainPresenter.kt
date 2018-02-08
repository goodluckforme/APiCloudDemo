package com.apicloud.pkg.sdk.mvp.presenter


import android.content.Context
import android.view.View
import com.apicloud.pkg.sdk.api.AppApi
import com.apicloud.pkg.sdk.common.RxPresenter
import com.apicloud.pkg.sdk.data.User
import com.apicloud.pkg.sdk.databinding.ActivityMainBinding
import com.apicloud.pkg.sdk.mvp.contract.MainContract
import org.jetbrains.anko.toast
import javax.inject.Inject

class MainPresenter @Inject
constructor(private val appApi: AppApi, private val context: Context, private val binding: ActivityMainBinding) : RxPresenter<MainContract.View>(), MainContract.Presenter {

    fun toInit() {
        binding.mainModel = MainModel()
        binding.user = User("Liang", 27)
    }

    var i: Int = 0

    inner class MainModel {
        fun changeValue(view: View) {
            binding.user.name = "哈哈+${i++}"
        }

        fun show(view: View) {
            context.toast("${binding.user}")
        }

        fun textChange(sequence: CharSequence, start: Int, before: Int, count: Int) {
            binding.user.name = sequence.toString()
        }
    }
}
