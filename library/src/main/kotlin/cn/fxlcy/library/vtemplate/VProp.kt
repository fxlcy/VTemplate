package cn.fxlcy.library.vtemplate

import android.view.ViewGroup

/**
 * Created by fxlcy on 2017/6/3.
 */
var ViewGroup.padLeft: Int
    get() = paddingLeft
    set(value) = setPadding(value, paddingTop, paddingRight, paddingBottom)

var ViewGroup.padTop: Int
    get() = paddingTop
    set(value) = setPadding(paddingLeft, value, paddingRight, paddingBottom)

var ViewGroup.padRight: Int
    get() = paddingRight
    set(value) = setPadding(paddingLeft, paddingTop, value, paddingBottom)

var ViewGroup.padBottom: Int
    get() = paddingBottom
    set(value) = setPadding(paddingLeft, paddingTop, paddingRight, value)