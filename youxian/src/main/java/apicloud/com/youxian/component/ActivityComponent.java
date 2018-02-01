package apicloud.com.youxian.component;

import apicloud.com.youxian.mvp.ui.activity.MainActivity;

import dagger.Component;

@Component(dependencies = AppComponent.class)
public interface ActivityComponent {
    void inject(MainActivity activity);
}