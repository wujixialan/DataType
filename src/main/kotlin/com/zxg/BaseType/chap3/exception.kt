package com.zxg.BaseType.chap3

/**
 * Created by zxg on 2017/12/3.
 */
fun main(args: Array<String>) {
    val result = try {
        val a1 = args[0].toInt()
        val a2 = args[1].toInt()
        println("$a1 + $a2 = ${a1 / a2}")
    } catch (e: NumberFormatException) {
        println("你确定输入的是整数吗?")
    } catch (e: Exception) {
       0
    }

    println("$result")
}