package apicloud.com.youxian.di.component

import com.jess.arms.di.scope.ActivityScope

import dagger.Component

import com.jess.arms.di.component.AppComponent

import apicloud.com.youxian.di.module.MainModule

import apicloud.com.youxian.mvp.ui.fragment.MainFragment

@ActivityScope
@Component(modules = arrayOf(MainModule::class), dependencies = arrayOf(AppComponent::class))
interface MainComponent {
    fun inject(fragment: MainFragment)
}