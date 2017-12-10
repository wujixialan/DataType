package com.zxg.BaseType.chap5.build

/**
 * Created by zxg on 2017/12/10.
 */
fun main(args: Array<String>) {
    val list = listOf(
            1..20,
            2..5,
            100..120
    )

    val flatList = list.flatMap {
        it.map {
            "No. $it"
        }
    }
    flatList.forEach(::println)
}