package com.apicloud.pkg.sdk.data

data class HttpResult<T>(val result: Int, val datas: T, val msg: String)