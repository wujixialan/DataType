package com.zxg.BaseType.chap4

/**
 * Created by zxg on 2017/12/5.
 */
abstract class Diff {
    var i = 0

    /**
     * 在抽象类中，如果某个方法被 open 了，则在其子类中可以复写，
     * 如果没有被 open 修饰，则在其子类中不能被复写
     */
    open fun hello() {
        println("hello")
    }
}

interface A {
    /**
     * 在接口中，变量不能被初始化
     */
    var a: Int

    fun hello1()
}

class D: Diff() {
    override fun hello() {
        super.hello()
    }
}