package com.zxg.BaseType.chap4.sealeds

/**
 * Created by zxg on 2017/12/10.
 */
/**
 * sealed class 在 1.1 之后可以写在同一个文件内，也可以写在 sealed class PlayerCmd 之内
 */
sealed class PlayerCmd {
//    class Play(url: String, val position: Long = 0) : PlayerCmd()
//
//    class Seek(val position: Long) : PlayerCmd()
//
//    object Pause : PlayerCmd()
//
//    object Resume : PlayerCmd()
//
//    object Stop : PlayerCmd()
}

class Play(url: String, val position: Long = 0) : PlayerCmd()

class Seek(val position: Long) : PlayerCmd()

object Pause : PlayerCmd()

object Resume : PlayerCmd()

object Stop : PlayerCmd()