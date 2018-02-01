package apicloud.com.youxian.component;

import apicloud.com.youxian.mvp.ui.activity.BeautyActivity;
import apicloud.com.youxian.mvp.ui.activity.HelloActivity;
import apicloud.com.youxian.mvp.ui.activity.HelpActivity;
import apicloud.com.youxian.mvp.ui.activity.HiActivity;
import apicloud.com.youxian.mvp.ui.activity.MainActivity;

import apicloud.com.youxian.mvp.ui.activity.MoneyActivity;
import dagger.Component;

@Component(dependencies = AppComponent.class)
public interface ActivityComponent {
    void inject(MainActivity activity);

    void inject(HelloActivity activity);

    void inject(HiActivity activity);

    void inject(BeautyActivity activity);

    void inject(HelpActivity activity);

    void inject(MoneyActivity activity);
}