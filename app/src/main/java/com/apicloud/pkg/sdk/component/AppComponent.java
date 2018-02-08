package com.apicloud.pkg.sdk.component;

import android.content.Context;

import com.apicloud.pkg.sdk.api.AppApi;
import com.apicloud.pkg.sdk.moudle.ApiModule;
import com.apicloud.pkg.sdk.moudle.AppModule;

import dagger.Component;

@Component(modules = {AppModule.class, ApiModule.class})
public interface AppComponent {
    Context getContext();

    AppApi getShopApi();
}