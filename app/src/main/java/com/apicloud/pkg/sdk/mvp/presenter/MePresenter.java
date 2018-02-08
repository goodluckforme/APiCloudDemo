package com.apicloud.pkg.sdk.mvp.presenter;


import android.content.Context;

import com.apicloud.pkg.sdk.api.AppApi;
import com.apicloud.pkg.sdk.common.RxPresenter;
import com.apicloud.pkg.sdk.mvp.contract.MeContract;

import javax.inject.Inject;

public class MePresenter extends RxPresenter<MeContract.View> implements MeContract.Presenter {

    private AppApi appApi;
    private Context context;

    @Inject
    public MePresenter(AppApi appApi, Context context) {
        super();
        this.appApi = appApi;
        this.context = context;
    }

}
