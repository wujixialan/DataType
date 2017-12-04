package com.zxg.BaseType.chap3

import java.util.*

/**
 * Created by zxg on 2017/12/3.
 */
fun main(args: Array<String>) {
    for (arg in args) {
        println(arg)
    }

    for ((index, value) in args.withIndex()) {
        println("$index -> $value")
    }
    val list = MyIntList()
    list.add(1)
    list.add(3)
    list.add(2)
    list.add(89)

    for (i in list) {
        println(i)
    }
}

class MyIterator(val iterator: Iterator<Int>) {
    operator fun next(): Int {
        return iterator.next()
    }

    operator fun hasNext(): Boolean {
        return iterator.hasNext()
    }
}

class MyIntList {
    private val list = ArrayList<Int>()

    fun add(int: Int) {
        list.add(int)
    }

    fun remove(int: Int) {
        list.remove(int)
    }

    operator fun iterator(): MyIterator {
        return MyIterator(list.iterator())
    }
}