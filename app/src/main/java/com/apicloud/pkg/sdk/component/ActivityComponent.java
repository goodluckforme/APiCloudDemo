package com.apicloud.pkg.sdk.component;

import com.apicloud.pkg.sdk.mvp.ui.activity.MainActivity;   

import dagger.Component;
@Component(dependencies = AppComponent.class)
public interface ActivityComponent {
    void inject(MainActivity activity);
}