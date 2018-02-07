package com.apicloud.pkg.sdk.mvp.presenter;


import android.content.Context;

import javax.inject.Inject;

import com.apicloud.pkg.sdk.api.AppApi;
import com.apicloud.pkg.sdk.common.RxPresenter;
import com.apicloud.pkg.sdk.mvp.contract.MainContract;

public class MainPresenter extends RxPresenter<MainContract.View> implements MainContract.Presenter {

    private AppApi appApi;
    private Context context;

    @Inject
    public MainPresenter(AppApi appApi, Context context) {
        super();
        this.appApi = appApi;
        this.context = context;
    }

}
