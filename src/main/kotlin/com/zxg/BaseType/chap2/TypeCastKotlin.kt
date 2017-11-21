package com.zxg.BaseType.chap2

/**
 * Created by zxg on 2017/11/16.
 */

class MathClassBook1(): Book1() {
    fun getName(): String {
        return "侠岚"
    }
}

open class Book1 {
    init {
        println("pppp")
    }
}

fun main(args: Array<String>) {
    val boo1: Book1 = MathClassBook1()

    if (boo1 is MathClassBook1) {
        println(boo1.getName())
    }

    val string1: String? = "Hello"
    if (string1 != null) {
        println(string1.length)
    }


    val book2: Book1 = Book1()
    /**
     * as 后面不加 ?, 可能发生 类转换异常
     */
    val math: MathClassBook1? = book2 as? MathClassBook1
    println(math)
}