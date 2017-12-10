package com.zxg.BaseType.chap4

/**
 * Created by zxg on 2017/12/9.
 */
abstract class Person(open val age: Int) {
    open fun work() {

    }
}

class MaNong(age: Int): Person(age = age) {
    override val age: Int
    get() = 0

    override fun work() {
        super.work()
        println("我是码农")
    }
}

class Doctor(override val age: Int): Person(age = age) {
    override fun work() {
        super.work()
        println("我在看病")
    }
}

fun main(args: Array<String>) {
    val person = MaNong(24)
    person.work()
    println(person.age)

    val person1 = Doctor(39)
    person1.work()
    println(person1.age)
}