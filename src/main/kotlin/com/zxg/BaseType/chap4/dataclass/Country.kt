package com.zxg.BaseType.chap4.dataclass

import com.zxg.BaseType.chap4.annotations.Pokot
import kotlin.properties.Delegates

/**
 * Created by zxg on 2017/12/10.
 */
/**
 * 在 class 前面加上 data 以后，就不需要在重写 toString() 了
 */
@Pokot
data class Country(val id: Int, val name: String)

class City(val id: Int, val name: String)

fun main(args: Array<String>) {
    val china = Country(86, "中国")
    val city = City(61, "铜川")
    println(china)
    println(china.component1())
    println(china.component2())
    println(city)
    val user = Pe()
    println(user)
}

class Pe {
    var name: String by Delegates.vetoable("<nomalName>") { prop, old, new ->
        println("want modify $old -> $new")
        false
    }
}