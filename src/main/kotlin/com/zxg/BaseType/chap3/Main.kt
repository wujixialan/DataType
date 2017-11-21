package com.zxg.BaseType.chap3

/**
 * Created by zxg on 2017/11/17.
 */
/**
 * 编译器常量需要加 const
 */
const val FINAL_HELLO_WORLD: String = "hello world"
var helloWorld: String = "hello world"
val FINAL_HELLO = "hello"

fun main(args: Array<String>) {
    println(FINAL_HELLO_WORLD)
    println(helloWorld)
    println(FINAL_HELLO)
    println("Hello ${args[0]}")
    /**
     * ${sum(1, 2)} 是字符串模板
     */
    val args1 = 1
    val args2 = 2
    println("args: $args1 + $args2 = ${sum(args1, args2)}")

    println("${a(2)}")

    println("sum: ${sum(1, 9)}  -- ${sum.invoke(1, 9)}")

    println("遍历数组的方式")
    println("方式1")
    val array: IntArray = intArrayOf(1, 2, 3, 5)
    for (i in array) {
        println(i)
    }
    println("方式2")
//    array.forEach(::println)
    /*array.forEach { ele ->
        if (ele == 2) {
            println(ele)
        }
    }*/
    array.forEach foreach@ { ele ->
        if (ele == 2) return@foreach
        println(ele)
    }

}

/**
 * 当一个函数返回一个单值表达式时，函数可以如下方式写
 * 例如：fun sum(d1: Int, d2: Int) = d1 + d2
 */
//fun sum(d1: Int, d2: Int) = d1 + d2
val sum = { d1: Int, d2: Int ->
    println("$d1 + $d2 = ${d1 + d2}")
    d1 + d2
}

val printHello = {
    println("Hello")
}

/**
 * 当把一个函数赋给一个变量时，该函数可以没有函数名
 */
val a = fun(x: Int): Long {
    return x.toLong()
}