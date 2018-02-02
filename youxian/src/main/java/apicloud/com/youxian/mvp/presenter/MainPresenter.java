package apicloud.com.youxian.mvp.presenter;


import android.content.Context;

import javax.inject.Inject;

import apicloud.com.youxian.App;
import apicloud.com.youxian.common.RxPresenter;
import apicloud.com.youxian.mvp.contract.MainContract;

public class MainPresenter extends RxPresenter<MainContract.View> implements MainContract.Presenter {

    private App app;
    private Context context;

    @Inject
    public MainPresenter(App app, Context context) {
        super();
        this.app = app;
        this.context = context;
    }

}
