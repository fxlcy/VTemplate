package cn.fxlcy.vtemplate

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.LinearLayout
import cn.fxlcy.library.vtemplate.linearLayout
import cn.fxlcy.library.vtemplate.textView

/**
 * Created by fxlcy on 2017/6/3.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val rootView = linearLayout {
            orientation = LinearLayout.VERTICAL
            layoutParams = ViewGroup.LayoutParams(MATCH_PARENT, MATCH_PARENT)
            gravity = Gravity.CENTER

            setBackgroundResource(R.mipmap.ic_launcher)

            textView {
                text = "哈哈哈哈"
                setTextColor(Color.BLACK)
                layoutParams = LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
            }

            textView {
                text = "哈哈哈哈"
                setTextColor(Color.BLACK)
                layoutParams = LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
            }

            textView {
                text = "哈哈哈哈"
                setTextColor(Color.BLACK)
                layoutParams = LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
            }

            textView {
                text = "哈哈哈哈"
                setTextColor(Color.BLACK)
                layoutParams = LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
            }
        }



        setContentView(rootView)


    }
}