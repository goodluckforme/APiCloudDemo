package com.apicloud.pkg.sdk.component;

import com.apicloud.pkg.sdk.moudle.ActivityMainBindingModule;
import com.apicloud.pkg.sdk.mvp.ui.fragment.MeFragment;

import dagger.Component;

@Component(dependencies = AppComponent.class,modules = {ActivityMainBindingModule.class})
public interface FragmentComponent {
    void inject(MeFragment meFragment);
}