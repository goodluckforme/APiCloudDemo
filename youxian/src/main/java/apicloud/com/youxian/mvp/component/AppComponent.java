package apicloud.com.youxian.mvp.component;

import apicloud.com.youxian.moudle.AppModule;
import apicloud.com.youxian.moudle.ApiModule;
import dagger.Component;

import android.content.Context;

import apicloud.com.youxian.mvp.api.AppApi;

@Component(modules = {AppModule.class, ApiModule.class})
public interface AppComponent {
    Context getContext();

    AppApi getShopApi();
}