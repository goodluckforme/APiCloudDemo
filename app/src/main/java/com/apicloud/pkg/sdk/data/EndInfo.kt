package com.apicloud.pkg.sdk.data

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.apicloud.pkg.sdk.BR

/**
 * Created by MaQi on 2018/2/22.
 */
class EndInfo(time: Long, result: String) : BaseObservable() {

    @Bindable
    var time: Long = time
        set(value) {
            field = value
            notifyPropertyChanged(BR.time)
        }
    @Bindable
    var result: String = result
        set(value) {
            field = value
            notifyPropertyChanged(BR.result)
        }
}