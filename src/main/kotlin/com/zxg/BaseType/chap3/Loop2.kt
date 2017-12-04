package com.zxg.BaseType.chap3

import java.util.*

/**
 * Created by zxg on 2017/12/3.
 */
class Student() {
    var x = 0
        get() {
            return field
        }
        set(value) {
            field = value
        }

    fun isNoTClothedProperly(): Boolean {
        return true
    }
}

fun main(args: Array<String>) {
    val students = ArrayList<Student>()
    val stu = Student()
    stu.x = 1
    students.add(stu)
    val stu1 = Student()
    stu1.x = 54
    students.add(stu1)
    val stu2 = Student()
    stu2.x = 545
    students.add(stu2)
    val you = Student()
    you.x = 54
    for (student in students) {
        if (student.x == you.x) {
            break
        } else if (student.isNoTClothedProperly()) {
            println(student.x)
            continue
        }
    }
}