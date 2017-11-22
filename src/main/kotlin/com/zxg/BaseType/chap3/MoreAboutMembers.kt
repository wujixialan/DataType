package com.zxg.BaseType.chap3

/**
 * Created by zxg on 2017/11/22.
 */
class A {
    var b = 0
        /**
         * 重写 get()
         */
        get() {
            println("get()")
            return field
        }
        /**
         * 重写 set()
         */
        set(value) {
            field = value
            println("set()")
        }
}

class B {
    private var c = 0
        /**
         * 重写 get()
         */
        private get
        /**
         * 重写 set()
         */
        private set
}

class X

class C {
    var d = 0
    lateinit var e: String
    lateinit var x: X
    val y: X by lazy {
        println("lazy y")
        X()
    }
}

fun main(args: Array<String>) {
    val c = C()
    println(c.d)
    println(c.y)
}