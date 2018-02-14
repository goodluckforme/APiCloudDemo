package com.apicloud.pkg.sdk.component;

import com.apicloud.pkg.sdk.mvp.ui.activity.MainActivity;   

import com.apicloud.pkg.sdk.module.ActivityMainBindingModule;

import dagger.Component;
@Component(dependencies = AppComponent.class,modules = {ActivityMainBindingModule.class})
public interface MainComponent {
    void inject(MainActivity activity);
}