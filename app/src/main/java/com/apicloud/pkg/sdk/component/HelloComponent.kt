package com.apicloud.pkg.sdk.component

import com.apicloud.pkg.sdk.mvp.ui.activity.HelloActivity

import com.apicloud.pkg.sdk.module.ActivityHelloBindingModule

import dagger.Component

@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(ActivityHelloBindingModule::class))
interface HelloComponent {
    fun inject(activity: HelloActivity)
}