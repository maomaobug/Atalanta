package me.hailin.atalanta

import android.util.Log

/**
 * Created by zhanghailin on 11/18/15.
 */
fun logV(msg: String = "", throwable: Throwable? = null) {
    Log.v(getTag(), msg, throwable)
}

fun logD(msg: String = "", throwable: Throwable? = null) {
    Log.d(getTag(), msg, throwable)
}

fun logI(msg: String = "", throwable: Throwable? = null) {
    Log.i(getTag(), msg, throwable)
}

fun logW(msg: String = "", throwable: Throwable? = null) {
    Log.w(getTag(), msg, throwable)
}

fun logE(msg: String = "", throwable: Throwable? = null) {
    Log.e(getTag(), msg, throwable)
}

fun logWtf(msg: String = "", throwable: Throwable? = null) {
    Log.wtf(getTag(), msg, throwable)
}

fun getTag(): String {
    val element = (Exception() as java.lang.Throwable).stackTrace[2]
    var  fileName = element.fileName
    val lineNumber = element.lineNumber
    return "$fileName#$lineNumber"
}
