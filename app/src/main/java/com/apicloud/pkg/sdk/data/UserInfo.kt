package com.apicloud.pkg.sdk.data

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.apicloud.pkg.sdk.BR

/**
 * Created by MaQi on 2018/2/22.
 */
class UserInfo(name: String, age: String, higeht: String) : BaseObservable() {

    @Bindable
    var name: String = name
        set(value) {
            field = value
            notifyPropertyChanged(BR.name)
        }
    @Bindable
    var age: String = age
        set(value) {
            field = value
            notifyPropertyChanged(BR.age)
        }
    @Bindable
    var higeht: String = higeht
        set(value) {
            field = value
            notifyPropertyChanged(BR.higeht)
        }

}