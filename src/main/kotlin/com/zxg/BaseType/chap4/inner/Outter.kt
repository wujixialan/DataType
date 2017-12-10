package com.zxg.BaseType.chap4.inner

/**
 * Created by zxg on 2017/12/10.
 */
open class Outter {
    val a: Int = 1
    /**
     * 当 内部类 没有被 inner 修饰，则是静态内部类
     * 当 内部类 被 inner 修饰，则是非静态内部类
     */
    inner class Inner {
        fun inner() {
            println("inner")
            println(this@Outter.a)
        }
    }


    fun outter() {
        println("outter")
    }
}

interface OnClickListener {
    fun onClick()
}

class View {
    var onClickListener: OnClickListener? = null
}

fun main(args: Array<String>) {
    val outter = Outter()
    val inner = outter.Inner()
    outter.outter()
    inner.inner()

    val view = View()
    view.onClickListener = object: Outter(), OnClickListener {
        override fun onClick() {

        }
    }
}