package cn.fxlcy.library.vtemplate

import android.content.Context
import android.support.v7.widget.*
import android.view.View
import android.view.ViewGroup
import android.widget.*

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


fun Context.linearLayout(init: LinearLayout.() -> Unit) = v(this, init)
fun ViewGroup.linearLayout(init: LinearLayout.() -> Unit) = v(this, init)

fun Context.relativeLayout(init: RelativeLayout.() -> Unit) = v(this, init)
fun ViewGroup.relativeLayout(init: RelativeLayout.() -> Unit) = v(this, init)

fun Context.frameLayout(init: FrameLayout.() -> Unit) = v(this, init)
fun ViewGroup.frameLayout(init: FrameLayout.() -> Unit) = v(this, init)

fun Context.gridLayout(init: GridLayout.() -> Unit) = v(this, init)
fun ViewGroup.gridLayout(init: GridLayout.() -> Unit) = v(this, init)

fun Context.scrollView(init: ScrollView.() -> Unit) = v(this, init)
fun ViewGroup.scrollView(init: ScrollView.() -> Unit) = v(this, init)

fun Context.tableLayout(init: TableLayout.() -> Unit) = v(this, init)
fun ViewGroup.tableLayout(init: TableLayout.() -> Unit) = v(this, init)

fun Context.listView(init: ListView.() -> Unit) = v(this, init)
fun ViewGroup.listView(init: ListView.() -> Unit) = v(this, init)

fun Context.recyclerView(init: RecyclerView.() -> Unit) = v(this, init)
fun ViewGroup.recyclerView(init: RecyclerView.() -> Unit) = v(this, init)

fun Context.textView(init: AppCompatTextView.() -> Unit) = v(this, init)
fun ViewGroup.textView(init: AppCompatTextView.() -> Unit) = v(this, init)

fun Context.button(init: AppCompatButton.() -> Unit) = v(this, init)
fun ViewGroup.button(init: AppCompatButton.() -> Unit) = v(this, init)

fun Context.editText(init: AppCompatEditText.() -> Unit) = v(this, init)
fun ViewGroup.editText(init: AppCompatEditText.() -> Unit) = v(this, init)

fun Context.imageView(init: AppCompatImageView.() -> Unit) = v(this, init)
fun ViewGroup.imageView(init: AppCompatImageView.() -> Unit) = v(this, init)

fun Context.imageButton(init: AppCompatImageButton.() -> Unit) = v(this, init)
fun ViewGroup.imageButton(init: AppCompatImageButton.() -> Unit) = v(this, init)

fun Context.checkBox(init: AppCompatCheckBox.() -> Unit) = v(this, init)
fun ViewGroup.checkBox(init: AppCompatCheckBox.() -> Unit) = v(this, init)

fun Context.radioButton(init: AppCompatRadioButton.() -> Unit) = v(this, init)
fun ViewGroup.radioButton(init: AppCompatRadioButton.() -> Unit) = v(this, init)

fun Context.seekBar(init: AppCompatSeekBar.() -> Unit) = v(this, init)
fun ViewGroup.seekBar(init: AppCompatSeekBar.() -> Unit) = v(this, init)

fun Context.switch(init: SwitchCompat.() -> Unit) = v(this, init)
fun ViewGroup.switch(init: SwitchCompat.() -> Unit) = v(this, init)
