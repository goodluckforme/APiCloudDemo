package apicloud.com.youxian.data

data class HttpResult<T>(val result: Int, val datas: T, val msg: String)