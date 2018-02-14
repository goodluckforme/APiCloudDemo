package com.apicloud.pkg.sdk.mvp.ui.activity;

import com.apicloud.pkg.sdk.module.ActivityMainBindingModule;
import com.apicloud.pkg.sdk.mvp.ui.base.BaseActivity;
import com.apicloud.pkg.sdk.mvp.presenter.MainPresenter;
import com.apicloud.pkg.sdk.mvp.contract.MainContract;
import com.apicloud.pkg.sdk.component.AppComponent;
import com.apicloud.pkg.sdk.component.DaggerMainComponent;
import com.apicloud.pkg.sdk.databinding.ActivityMainBinding;
import com.apicloud.pkg.sdk.R;

import android.databinding.DataBindingUtil;

public class MainActivity extends BaseActivity<MainPresenter, MainContract.View> implements MainContract.View {

    @Override
    public void setActivityComponent(AppComponent appComponent) {
        DaggerMainComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .activityMainBindingModule(new ActivityMainBindingModule(DataBindingUtil.<ActivityMainBinding>setContentView(this, R.layout.activity_main)))
                .build()
                .inject(this);
    }


    @Override
    public void initView() {
        super.initView();

    }


    @Override
    public void initData() {
        super.initData();
    }

    @Override
    public void complete(String msg) {

    }

    @Override
    public void showError(String msg) {

    }
}
