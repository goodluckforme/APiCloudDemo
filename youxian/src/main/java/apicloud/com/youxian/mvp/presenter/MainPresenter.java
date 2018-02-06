package apicloud.com.youxian.mvp.presenter;


import android.content.Context;

import javax.inject.Inject;

import apicloud.com.youxian.api.AppApi;
import apicloud.com.youxian.common.RxPresenter;
import apicloud.com.youxian.mvp.contract.MainContract;

public class MainPresenter extends RxPresenter<MainContract.View> implements MainContract.Presenter {

    private AppApi appApi;
    private Context context;

    @Inject
    public MainPresenter(AppApi app, Context context) {
        super();
        this.appApi = appApi;
        this.context = context;
    }

}
