package apicloud.com.youxian.component.component;

import apicloud.com.youxian.moudle.AppModule;
import apicloud.com.youxian.moudle.ApiModule;
import dagger.Component;

import android.content.Context;

import apicloud.com.youxian.component.api.AppApi;

@Component(modules = {AppModule.class, ApiModule.class})
public interface AppComponent {
    Context getContext();

    AppApi getShopApi();
}