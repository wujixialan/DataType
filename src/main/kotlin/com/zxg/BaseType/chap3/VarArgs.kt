package com.zxg.BaseType.chap3

/**
 * Created by zxg on 2017/12/4.
 */
fun main(vararg args: String) {
    for (arg in args) {
        println(arg)
    }
    println("---------------------------")
    /**
     * str="hello function" 使用了具名参数的方法进行传参
     * 变长参数可以在参数列表的任意位置
     */
    var array = intArrayOf(1, 5, 52, 43, 4545)
    var list = arrayListOf(1, 5, 52, 43, 4545)
    /**
     * *array : * 代表把数组进行展开，然后传入参数
     * hello(s = "vararg", arr = *array, str ="hello function"): 使用具名参数传参
     */
    hello(s = "vararg", arr = *array, str ="hello function")
}

fun hello(s: String, vararg arr: Int, str: String) {
    /***
     * vararg 代表变长参数
     */
    arr.forEach(::println)
    println(str)
}