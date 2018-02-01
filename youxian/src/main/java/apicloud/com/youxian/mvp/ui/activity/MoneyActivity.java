package apicloud.com.youxian.mvp.ui.activity;


import apicloud.com.youxian.mvp.ui.activity.base.BaseActivity;

import javax.inject.Inject;

import apicloud.com.youxian.mvp.presenter.MoneyPresenter;
import apicloud.com.youxian.mvp.contract.MoneyContract;
import apicloud.com.youxian.component.AppComponent;
import apicloud.com.youxian.component.DaggerActivityComponent;
import apicloud.com.youxian.R;


public class MoneyActivity extends BaseActivity implements MoneyContract.View {

    public @Inject
    MoneyPresenter moneyPresenter;

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
        moneyPresenter.detachView();
    }

    @Override
    public int getLayoutRes() {
        return R.layout.activity_money;
    }

    @Override
    public void complete(String msg) {

    }

    @Override
    public void showError(String msg) {

    }
}
