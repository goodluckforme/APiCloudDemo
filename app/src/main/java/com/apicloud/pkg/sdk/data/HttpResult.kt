package com.apicloud.pkg.sdk.data

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.apicloud.pkg.sdk.BR

data class HttpResult<T>(val result: Int, val datas: T, val msg: String)


data class User_(var name: String, var hight: String, var age: Int) : BaseObservable()
data class UserInfo(var member_id: String, var member_type: String, var member_money: String) : BaseObservable() {

    @Bindable
    var member_name = "马齐"
        set(value) {
            field = value
            notifyPropertyChanged(BR.member_name)
        }
}