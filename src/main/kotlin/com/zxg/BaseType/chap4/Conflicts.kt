package com.zxg.BaseType.chap4

/**
 * Created by zxg on 2017/12/9.
 */
interface B {
    fun x(): Int = 1
}

interface C {
    fun x(): Int = 0
}

open class A1() {
    open fun x(): Int = 5
}

class D1(private val y: Int): A1(), B, C {
    override fun x(): Int {
        println("call x(): Int in D")
        return if (y > 0) {
            y
        } else if (y < -100) {
            super<B>.x()
        } else if (y >= -100 && y <= -50) {
            super<C>.x()
        } else {
            super<A1>.x()
        }
    }
}

fun main(args: Array<String>) {
    val d = D1(-500)
    println(d.x())
}