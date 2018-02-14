package com.apicloud.pkg.sdk.mvp.presenter


import android.content.Context
import javax.inject.Inject
import com.apicloud.pkg.sdk.api.AppApi
import com.apicloud.pkg.sdk.common.RxPresenter
import com.apicloud.pkg.sdk.mvp.contract.TestContract
import com.apicloud.pkg.sdk.databinding.ActivityTestBinding

class TestPresenter @Inject constructor(private val appApi: AppApi,private  val context: Context,private  val binding: ActivityTestBinding) : RxPresenter<TestContract.View>(), TestContract.Presenter {

    fun toInit() {
        binding.testModel = TestModel()
    }

    inner class TestModel

}
