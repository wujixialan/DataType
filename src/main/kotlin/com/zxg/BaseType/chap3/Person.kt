package com.zxg.BaseType.chap3

/**
 * Created by zxg on 2017/11/22.
 */

class Person(var name: String, var age: Int) {
    fun singer(singerName: String) {
        println("$singerName")
    }

    fun paint(paintTypeName: String) {
        println("$paintTypeName")
    }
}

fun main(args: Array<String>) {
    var person: Person = Person("zxg", 22)
    person.singer("nihao")
    person.paint("油画")
}