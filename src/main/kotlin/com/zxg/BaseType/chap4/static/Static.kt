package com.zxg.BaseType.chap4.static

import com.zxg.BaseType.chap4.static.Latitude.Companion.ofDouble

/**
 * Created by zxg on 2017/12/9.
 */
fun main(args: Array<String>) {
    val a = ofDouble(6.3)
    val b = Latitude.ofLatitude(a)
    println(a)
    println(b)
    println(Latitude.TAG)
}

class Latitude private constructor(val value: Double){
    /**
     * 类似于静态方法
     */
    companion object {
        fun ofDouble(double: Double): Latitude {
            return Latitude(double)
        }

        fun ofLatitude(latitude: Latitude): Latitude {
            return Latitude(latitude.value)
        }

        val TAG: String = "Latitude"
    }
}