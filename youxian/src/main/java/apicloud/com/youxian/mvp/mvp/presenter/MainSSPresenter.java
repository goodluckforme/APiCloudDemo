package apicloud.com.youxian.mvp.mvp.presenter;


import android.content.Context;

import javax.inject.Inject;

import apicloud.com.youxian.mvp.api.AppApi;
import apicloud.com.youxian.mvp.common.RxPresenter;
import apicloud.com.youxian.mvp.mvp.contract.MainSSContract;

public class MainSSPresenter extends RxPresenter<MainSSContract.View> implements MainSSContract.Presenter {

    private AppApi appApi;
    private Context context;

    @Inject
    public MainSSPresenter(AppApi app, Context context) {
        super();
        this.appApi = appApi;
        this.context = context;
    }

}
