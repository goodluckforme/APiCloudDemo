package apicloud.com.youxian.mvp.presenter;


import android.content.Context;

import javax.inject.Inject;

import apicloud.com.youxian.App;
import apicloud.com.youxian.common.RxPresenter;
import apicloud.com.youxian.mvp.contract.HelpContract;

public class HelpPresenter extends RxPresenter<HelpContract.View> implements HelpContract.Presenter {

    private App app;
    private Context context;

    @Inject
    public HelpPresenter(App app, Context context) {
        super();
        this.app = app;
        this.context = context;
    }

}
