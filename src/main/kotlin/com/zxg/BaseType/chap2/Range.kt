package com.zxg.BaseType.chap2

/**
 * Created by zxg on 2017/11/16.
 */

val range: IntRange = 0..1024
val range1: IntRange = 0 until 1024

val empty: IntRange = 0..-1

fun main(args: Array<String>) {
    println(empty.isEmpty())

    for (i in range) {
        println("$i")
    }
}