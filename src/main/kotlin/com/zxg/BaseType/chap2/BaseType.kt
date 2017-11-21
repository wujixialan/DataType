package com.zxg.BaseType.chap2

/**
 * Created by zxg on 2017/11/16.
 */

val aBoolean: Boolean = true
val anotherBoolean : Boolean = false

val aInt: Int = 3
val anotherInt: Int = 0xFF
val moreInt: Int = 0b00000011
val maxInt: Int = Int.MAX_VALUE
val minInt: Int = Int.MIN_VALUE

val aLong: Long = 145445654654654564
val anotherLong: Long = 123
val maxLong: Long = Long.MAX_VALUE
val minLong: Long = Long.MIN_VALUE

val aFloat: Float = 2.0F
val anotherFloat: Float = 1E3F

val aDouble: Double = 3.0
val anotherDouble: Double = 3.1415926

val aByte: Byte = 127
val maxByte: Byte = Byte.MAX_VALUE
val minByte: Byte = Byte.MIN_VALUE

fun main(args: Array<String>) {
    println("打印 Boolean")
    println(aBoolean)
    println(anotherBoolean)

    println("打印 Int")
    println(aInt)
    println(anotherInt)
    println(moreInt)
    println(maxInt)
    println(minInt)

    println("打印 Long")
    println(aLong)
    println(anotherLong)
    println(maxLong)
    println(minLong)

    println("打印 Float")
    println(aFloat)
    println(anotherFloat)
    println(Float.MAX_VALUE)
    println(-Float.MIN_VALUE)
    println(Float.POSITIVE_INFINITY)
    println(Float.NEGATIVE_INFINITY)

    println("打印 Double")
    println(aDouble)
    println(anotherDouble)

    println("打印 Byte")
    println(aByte)
    println(maxByte)
    println(minByte)
}