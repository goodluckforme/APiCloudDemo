package apicloud.com.youxian.component.mvp.presenter;


import android.content.Context;

import javax.inject.Inject;

import apicloud.com.youxian.component.api.AppApi;
import apicloud.com.youxian.component.common.RxPresenter;
import apicloud.com.youxian.component.mvp.contract.MainQAContract;

public class MainQAPresenter extends RxPresenter<MainQAContract.View> implements MainQAContract.Presenter {

    private AppApi appApi;
    private Context context;

    @Inject
    public MainQAPresenter(AppApi app, Context context) {
        super();
        this.appApi = appApi;
        this.context = context;
    }

}
