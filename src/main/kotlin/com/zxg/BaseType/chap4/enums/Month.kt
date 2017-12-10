package com.zxg.BaseType.chap4.enums

/**
 * Created by zxg on 2017/12/10.
 */
enum class Month {
    January, February, March, April, May, June,
    July, August, September, October, November, December;
    fun a1() {
        println("a1")
    }
}

fun main(args: Array<String>) {
    println(Month.January)
}