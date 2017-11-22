package com.zxg.BaseType.chap3

/**
 * Created by zxg on 2017/11/22.
 */
class Complex(val real: Double, val imaginary: Double) {
    operator fun plus(other: Complex): Complex {
        return Complex(real + other.real, imaginary + other.imaginary)
    }

    override fun toString(): String {
        return "$real + ${imaginary}i"
    }

}

fun main(args: Array<String>) {
    val c1 = Complex(3.0, 5.55)
    val c2 = Complex(3.5, 4.3)
    println(c1 + c2)

    if ("-name" in args) {
        println(args[args.indexOf("-name") + 1])
    }

    if (Book() on Desk()) {

    }
}

class Book {
    /**
     * 中缀表达式
     */
    infix fun on(any: Any): Boolean {
        return false
    }
}

class Desk