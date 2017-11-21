package com.zxg.BaseType.chap2

import com.zxg.BaseType.chap2.市委书记.北京.市委书记

/**
 * Created by zxg on 2017/11/16.
 */

val inArray: IntArray = intArrayOf(1, 2, 3, 5)
val charArray: CharArray = charArrayOf('h', 'e', 'l', 'l', 'o')
val stringArray: Array<String> = arrayOf("我是程序员", "你也是", "他也是")
val arrayOfObject: Array<市委书记> = arrayOf(市委书记("李"), 市委书记("赵"), 市委书记("张"))

fun main(args: Array<String>) {
    println("inArray: " + inArray.size)
    println("charArray: " + charArray.size)
    println("stringArray: " + stringArray.size)
    println("arrayOfObject: " + arrayOfObject.size)

    for (i in stringArray) {
        println("$i")
    }

    println(arrayOfObject[2])

    /**
     * joinToString 可以将 char 类型的数组进行连接
     */
    println(charArray.joinToString(""))

    /**
     * inArray 对数组进行切片，相当于 java 中的 subString 方法
     */
    println(inArray.slice(1..3))
}