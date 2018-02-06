package apicloud.com.youxian.mvp.ui.activity;


import apicloud.com.youxian.mvp.ui.base.BaseActivity;

import javax.inject.Inject;

import apicloud.com.youxian.mvp.presenter.MainPresenter;
import apicloud.com.youxian.mvp.contract.MainContract;
import apicloud.com.youxian.component.AppComponent;
import apicloud.com.youxian.component.DaggerActivityComponent;
import apicloud.com.youxian.R;


public class MainActivity extends BaseActivity implements MainContract.View {

    public @Inject
    MainPresenter mainPresenter;

    @Override
    public void setActivityComponent(AppComponent appComponent) {
        DaggerActivityComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .build()
                .inject(this);
    }


    @Override
    public void initView() {
        super.initView();

    }


    @Override
    public void initData() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mainPresenter.detachView();
    }

    @Override
    public int getLayoutRes() {
        return R.layout.activity_main;
    }

    @Override
    public void complete(String msg) {

    }

    @Override
    public void showError(String msg) {

    }
}
