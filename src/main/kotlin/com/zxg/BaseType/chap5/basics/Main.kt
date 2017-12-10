package com.zxg.BaseType.chap5.basics

/**
 * Created by zxg on 2017/12/10.
 */
class Hello {
    fun world() {
        println("Hello World")
    }
}

fun main(args: Array<String>) {
    val helloWorld = Hello::world
    var list = arrayListOf("", "hello", "zxg")
    list.filter(String::isNotBlank).forEach(::println)
}