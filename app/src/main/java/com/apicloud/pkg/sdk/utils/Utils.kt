package com.apicloud.pkg.sdk.utils

import java.text.SimpleDateFormat
import java.util.*


/**
 * Created by MaQi on 2018/2/23.
 */

fun string2Data(data: String): String = SimpleDateFormat("yyyy-MM-dd").format(Date(data.toLong()))
fun long2Data(data: Long): String = SimpleDateFormat("yyyy-MM-dd").format(Date(data))

