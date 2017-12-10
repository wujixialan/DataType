package com.zxg.BaseType.chap4

/**
 * Created by zxg on 2017/12/9.
 */
class Manager: Driver, Writer {
    override fun driving() {

    }

    override fun writer() {

    }
}


/**
 * by 是一种代理
 */
class SeniorManager(private val driver: Driver, private val writer: Writer):
        Driver by driver, Writer by writer

class CarDriver: Driver {
    override fun driving() {
        println("开车呢")
    }
}

class PPTWriter: Writer {
    override fun writer() {
        println("做 PPT 呢")
    }
}

interface Driver {
    fun driving()
}

interface Writer {
    fun writer()
}

fun main(args: Array<String>) {
    val driver = CarDriver()
    val writerPPT = PPTWriter()
    val seniorManager = SeniorManager(driver = driver, writer = writerPPT)
    seniorManager.driving()
    seniorManager.writer()

}