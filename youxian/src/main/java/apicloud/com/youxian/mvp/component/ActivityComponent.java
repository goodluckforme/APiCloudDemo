package apicloud.com.youxian.mvp.component;

import apicloud.com.youxian.mvp.mvp.ui.activity.MainSSActivity;   

import dagger.Component;
@Component(dependencies = AppComponent.class)
public interface ActivityComponent {
    void inject(MainSSActivity activity);
}