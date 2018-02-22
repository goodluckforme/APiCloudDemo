package com.apicloud.pkg.sdk.component

import com.apicloud.pkg.sdk.mvp.ui.fragment.PageFragment

//import com.apicloud.pkg.sdk.module.FragmentPageBindingModule

import dagger.Component

@Component(dependencies = [(AppComponent::class)])
interface PageComponent {
    fun inject(fragment: PageFragment)
}