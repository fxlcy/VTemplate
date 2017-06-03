package cn.fxlcy.library.vtemplate

import android.content.Context
import android.view.View

/**
 * Created by Fxlcy on 2017/6/4.
 */
fun Context.dp_i(dp: Float): Int {
    val density = this.resources.displayMetrics.density
    return (dp * density + 0.5f).toInt()
}

fun View.dp_i(dp: Float): Int {
    return this.context.dp_i(dp)
}

