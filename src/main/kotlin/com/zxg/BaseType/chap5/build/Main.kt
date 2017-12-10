package com.zxg.BaseType.chap5.build

/**
 * Created by zxg on 2017/12/10.
 */
fun main(args: Array<String>) {
    val list = listOf<Int>(2, 5, 3, 1, 8)
    val newList = list.map {
        it * 2 + 3
    }
    newList.forEach(::println)
}