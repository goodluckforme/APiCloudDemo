package apicloud.com.youxian.di.component

import apicloud.com.youxian.di.module.MeModule
import apicloud.com.youxian.mvp.ui.activity.MeActivity
import com.jess.arms.di.component.AppComponent
import com.jess.arms.di.scope.ActivityScope
import dagger.Component

@ActivityScope
@Component(modules = arrayOf(MeModule::class), dependencies = arrayOf(AppComponent::class))
interface MeComponent {
    fun inject(activity: MeActivity)
}