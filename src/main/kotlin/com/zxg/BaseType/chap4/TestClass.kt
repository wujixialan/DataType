package com.zxg.BaseType.chap4

import java.security.PrivateKey

/**
 * Created by zxg on 2017/12/10.
 */
class Per {
    /**
     * 在 kotlin 中，当有多个构造器时，构造器必须写在类的大括号的里面。
     */
    constructor() {
        println("Per")
    }
    constructor(int: Int = 0) {
        println("${int}")
    }
}

fun main(args: Array<String>) {
    println(Per(1))
}