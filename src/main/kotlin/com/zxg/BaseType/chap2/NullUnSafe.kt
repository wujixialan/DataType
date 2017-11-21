package com.zxg.BaseType.chap2

/**
 * Created by zxg on 2017/11/16.
 */

/**
 * getName() 是不允许返回 null
 */
fun getName():String {
    return "侠岚"
}

/**
 * getId() 允许返回 null
 * 若需要返回 null 时，需要在返回的类型后面加上 String?
 */
fun getId():String? {
    return null
}

fun main(args: Array<String>) {
    val value: String? = "HelloWorld"
    println("value: " + value!!.length)

    println("getName: " + getName().length)
    println("getId: " + getId()?.length)
    val name: String  = getId() ?: return
    println("name: " + name.length)

}