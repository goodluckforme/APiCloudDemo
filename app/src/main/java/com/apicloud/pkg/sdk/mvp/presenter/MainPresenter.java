package com.apicloud.pkg.sdk.mvp.presenter;


import android.content.Context;

import javax.inject.Inject;

import com.apicloud.pkg.sdk.api.AppApi;
import com.apicloud.pkg.sdk.common.RxPresenter;
import com.apicloud.pkg.sdk.mvp.contract.MainContract;
import com.apicloud.pkg.sdk.databinding.ActivityMainBinding;

public class MainPresenter extends RxPresenter<MainContract.View> implements MainContract.Presenter {

    private AppApi appApi;
    private Context context;
    private ActivityMainBinding binding;

    @Inject
    public MainPresenter(AppApi appApi, Context context, ActivityMainBinding binding) {
        super();
        this.appApi = appApi;
        this.context = context;
        this.binding = binding;
    }

    public void toInit() {
        binding.setMainModel(new MainModel());
    }

    public class MainModel {

    }

}
