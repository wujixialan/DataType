package com.zxg.BaseType.chap4

import com.zxg.BaseType.chap3.a

/**
 * Created by zxg on 2017/12/10.
 */
fun main(args: Array<String>) {
    println("abc" * 2)
    println("abc".a)
}

operator fun String.times(int: Int): String {
    val stringBuilder = StringBuilder()
    for (i in 0 until int) {
        stringBuilder.append(this)
    }
    return stringBuilder.toString()
}

var String.a: Int
    set(value) {
        value + 1
    }
    get() = 5