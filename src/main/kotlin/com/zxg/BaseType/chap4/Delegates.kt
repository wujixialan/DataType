package com.zxg.BaseType.chap4

import kotlin.reflect.KProperty

/**
 * Created by zxg on 2017/12/10.
 */
class Delegates {
    /**
     * hello by lazy: 只有访问到 hello 时，才会把值赋为 HelloWorld
     */
    val hello: String by lazy {
        "HelloWorld"
    }

    val hello1 by XX()

    var hello2 by XX()
}

class XX {
    private var value1: String? = null

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println("getValue: $thisRef -> ${property.name}")
        return value1 ?: ""
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("setValue: $thisRef -> ${property.name} -> $value")
        this.value1 = value
    }
}

fun main(args: Array<String>) {
    val delegates = Delegates()
    println(delegates.hello1)
    println(delegates.hello2)
    delegates.hello2 = "ffff"
    println(delegates.hello2)
}