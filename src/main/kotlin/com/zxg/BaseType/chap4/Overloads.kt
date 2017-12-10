package com.zxg.BaseType.chap4

/**
 * Created by zxg on 2017/12/10.
 */
class Overloads {
    fun a(value: Int = 0): Int {
        return value
    }
}

fun main(args: Array<String>) {
    val overload = Overloads()
    println(overload.a())
}