package com.apicloud.pkg.sdk.utils

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.bumptech.glide.Glide

/**
 * Created by MaQi on 2018/2/23.
 */
@BindingAdapter("bind:image")
fun ImageView.imageLoader(url: String) {
    Glide.with(context).load(url).into(this)
}

//@BindingConversion
//fun convertDate(date: Date): String {
//    return SimpleDateFormat("yyyy-MM-dd").format(date)
//}

