package com.apicloud.pkg.sdk.component;

import com.apicloud.pkg.sdk.moudle.ActivityMainBindingModule;
import com.apicloud.pkg.sdk.mvp.ui.activity.MainActivity;

import dagger.Component;
@Component(dependencies = AppComponent.class,modules = {ActivityMainBindingModule.class})
public interface ActivityMainComponent {
    void inject(MainActivity mainActivity);
}