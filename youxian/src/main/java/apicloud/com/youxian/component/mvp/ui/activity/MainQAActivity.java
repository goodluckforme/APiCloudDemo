package apicloud.com.youxian.component.mvp.ui.activity;


import apicloud.com.youxian.component.mvp.ui.base.BaseActivity;

import javax.inject.Inject;

import apicloud.com.youxian.component.mvp.presenter.MainQAPresenter;
import apicloud.com.youxian.component.mvp.contract.MainQAContract;
import apicloud.com.youxian.component.component.AppComponent;
import apicloud.com.youxian.component.component.DaggerActivityComponent;
import apicloud.com.youxian.component.R;


public class MainQAActivity extends BaseActivity implements MainQAContract.View {

    public @Inject
    MainQAPresenter mainQAPresenter;

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
        mainQAPresenter.detachView();
    }

    @Override
    public int getLayoutRes() {
        return R.layout.activity_main_q;
    }

    @Override
    public void complete(String msg) {

    }

    @Override
    public void showError(String msg) {

    }
}
