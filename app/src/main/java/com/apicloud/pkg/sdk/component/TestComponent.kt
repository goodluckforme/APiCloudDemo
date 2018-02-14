package com.apicloud.pkg.sdk.component

import com.apicloud.pkg.sdk.mvp.ui.activity.TestActivity

import com.apicloud.pkg.sdk.module.ActivityTestBindingModule

import dagger.Component

@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(ActivityTestBindingModule::class))
interface TestComponent {
    fun inject(activity: TestActivity)
}