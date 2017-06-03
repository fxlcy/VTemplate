package cn.fxlcy.library.vtemplate

import android.content.Context
import android.view.View
import android.view.ViewGroup

/**
 * Created by fxlcy on 2017/6/3.
 */

inline fun <reified V : View> v(context: Context, init: V.() -> Unit): V {
    val clazz = V::class.java.getConstructor(Context::class.java)
    val view = clazz.newInstance(context)
    init(view)

    return view
}

inline fun <reified V : View> v(parent: ViewGroup, init: V.() -> Unit): V {
    val view = v(parent.context, init)
    parent.addView(view)

    return view
}


fun Context.dp_i(dp: Float): Int {
    val density = this.resources.displayMetrics.density
    return (dp * density + 0.5f).toInt()
}

fun View.dp_i(dp: Float): Int {
    return this.context.dp_i(dp)
}

