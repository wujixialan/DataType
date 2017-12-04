package com.zxg.BaseType.chap3

/**
 * Created by zxg on 2017/11/23.
 */
fun main(args: Array<String>) {
    val x = 5
    /**
     * when 是一个表达式,具有表达式，并且返回最后一条语句
     */
    when (x) {
        is Int -> println("Hello $x")
        in 1..100 -> println("$x in 1..100")
        !in 1..100 -> println("$x not in 1..100")
        args[0].toInt() -> println("x == args[0]")
    }

    val mode = when {
        args.isNotEmpty() && args[0] == "1" -> 1
        else -> 0
    }
}