package com.apicloud.pkg.sdk.component;

import com.apicloud.pkg.sdk.moudle.AppModule;
import com.apicloud.pkg.sdk.moudle.ApiModule;

import dagger.Component;

import android.content.Context;

import com.apicloud.pkg.sdk.api.AppApi;

@Component(modules = {AppModule.class, ApiModule.class})
public interface AppComponent {
    Context getContext();

    AppApi getShopApi();
}