package com.zxg.BaseType.chap4

/**
 * Created by zxg on 2017/12/9.
 */
class House

class Flower

class CountYard {
    private val house = House()

    private val flower = Flower()
}

class ForbiddenCity {
    /**
     * internal 是模块内可见的
     */
    val houses = arrayOf(House(), House())

    val flowers = arrayOf(Flower(), Flower())
}

fun main(args: Array<String>) {
    val countYard = CountYard()
    val forbiddenCity = ForbiddenCity()
    println(forbiddenCity.houses)
    println(forbiddenCity.flowers)
}