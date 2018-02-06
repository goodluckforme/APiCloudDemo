package apicloud.com.youxian.component.component;

import apicloud.com.youxian.component.mvp.ui.activity.MainQAActivity;   

import dagger.Component;
@Component(dependencies = AppComponent.class)
public interface ActivityComponent {
    void inject(MainQAActivity activity);
}