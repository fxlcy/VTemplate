package cn.fxlcy.vtemplate

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.LinearLayout
import cn.fxlcy.library.vtemplate.v

/**
 * Created by fxlcy on 2017/6/3.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        v<LinearLayout>(this, {

        })
    }
}