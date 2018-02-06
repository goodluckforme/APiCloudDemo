package apicloud.com.youxian.mvp.mvp.ui.activity;


import apicloud.com.youxian.mvp.mvp.ui.base.BaseActivity;

import javax.inject.Inject;

import apicloud.com.youxian.mvp.mvp.presenter.MainSSPresenter;
import apicloud.com.youxian.mvp.mvp.contract.MainSSContract;
import apicloud.com.youxian.mvp.component.AppComponent;
import apicloud.com.youxian.mvp.component.DaggerActivityComponent;
import apicloud.com.youxian.mvp.R;


public class MainSSActivity extends BaseActivity implements MainSSContract.View {

    public @Inject
    MainSSPresenter mainSSPresenter;

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
        mainSSPresenter.detachView();
    }

    @Override
    public int getLayoutRes() {
        return R.layout.activity_main_ss;
    }

    @Override
    public void complete(String msg) {

    }

    @Override
    public void showError(String msg) {

    }
}
