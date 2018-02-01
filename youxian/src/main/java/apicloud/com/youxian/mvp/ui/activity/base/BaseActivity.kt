package apicloud.com.youxian.mvp.ui.activity.base

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import apicloud.com.youxian.App
import apicloud.com.youxian.component.AppComponent


/**
 * Created by Administrator on 2017/11/21.
 */
abstract class BaseActivity : AppCompatActivity() {
    var isFirst: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutRes())
        //竖屏设置
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        setAppComponent(App.instance.appComponent)
        initView()
    }

    /**
     * 设置标题
     *
     * @param title
     */
    fun setTitleId(stringId: Int) {

    }

    abstract fun setAppComponent(appComponent: AppComponent)

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus && !isFirst) {
            isFirst = true
            initData()
        }
    }

    protected open fun initView() {

    }

    protected open fun initData() {
    }


    abstract fun getLayoutRes(): Int
}