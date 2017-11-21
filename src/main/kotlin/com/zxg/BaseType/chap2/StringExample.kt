package com.zxg.BaseType.chap2

/**
 * Created by zxg on 2017/11/16.
 */

val str: String = "hel"
val fromChar: String = String(charArrayOf('h', 'e', 'l'))

fun main(args: Array<String>) {
    println(str == fromChar)
    println(str === fromChar)

    val aInt: Int = 1
    val bInt: Int = 0

    println("" + aInt + " + " + bInt + " = " + (aInt + bInt))
    println("$aInt + $bInt = ${aInt + bInt}")

    val sayHello: String = "Hello \"Huang\""
    println(sayHello)

    val salary: Int = 10001
    println("$salary")

    val s: String = """
        \t
        \n
        \b
        \\\\\$$$ salary
    """
    println(s.length)


}