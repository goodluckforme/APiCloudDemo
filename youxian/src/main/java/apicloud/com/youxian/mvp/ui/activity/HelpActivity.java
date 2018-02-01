package apicloud.com.youxian.mvp.ui.activity;


import apicloud.com.youxian.mvp.ui.activity.base.BaseActivity;

import javax.inject.Inject;

import apicloud.com.youxian.mvp.presenter.HelpPresenter;
import apicloud.com.youxian.mvp.contract.HelpContract;
import apicloud.com.youxian.component.AppComponent;
import apicloud.com.youxian.component.DaggerActivityComponent;
import apicloud.com.youxian.R;


public class HelpActivity extends BaseActivity implements HelpContract.View {

    public @Inject HelpPresenter helpPresenter;

    @Override
    public void setAppComponent(AppComponent appComponent) {
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
        helpPresenter.detachView();
    }

    @Override
    public int getLayoutRes() {
        return R.layout.activity_help;
    }

    @Override
    public void complete(String msg) {

    }

    @Override
    public void showError(String msg) {

    }
}
