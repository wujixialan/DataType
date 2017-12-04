package com.zxg.BaseType.chap3

/**
 * Created by zxg on 2017/12/3.
 */
fun main(args: Array<String>) {
    var x = 5
    while (x > 0) {
        println(x)
        x -= 1
    }

    do {
        x -= 1
    } while (x > 0)
}