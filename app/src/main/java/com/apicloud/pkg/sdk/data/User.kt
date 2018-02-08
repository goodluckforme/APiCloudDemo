package com.apicloud.pkg.sdk.data

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.apicloud.pkg.sdk.BR

/**
 * Created by MaQi on 2018/2/8.
 */
data class User(var hight: String, var age: Int) : BaseObservable() {
    @Bindable
    var name = "马齐"
        set(value) {
            field = value
            notifyPropertyChanged(BR.name)
        }

    override fun toString(): String {
        return "User(hight='$hight', age=$age, name='$name')"
    }
}