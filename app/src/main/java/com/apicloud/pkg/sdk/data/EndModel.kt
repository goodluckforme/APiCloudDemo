package com.apicloud.pkg.sdk.data

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.databinding.ObservableBoolean
import com.apicloud.pkg.sdk.BR

/**
 * Created by MaQi on 2018/2/22.
 */
class EndModel : BaseObservable {

    var showView: ObservableBoolean

    constructor(time: Long, result: String, showRed: Boolean, showView: ObservableBoolean = ObservableBoolean(false)) : super() {
        this.showView = showView
        this.time = time
        this.result = result
        this.showRed = showRed
    }

    @Bindable
    var time: Long
        set(value) {
            field = value
            notifyPropertyChanged(BR.time)
        }
    @Bindable
    var result: String
        set(value) {
            field = value
            notifyPropertyChanged(BR.result)
        }

    @Bindable
    var showRed: Boolean
        set(value) {
            field = value
            notifyPropertyChanged(BR.showRed)
        }
}