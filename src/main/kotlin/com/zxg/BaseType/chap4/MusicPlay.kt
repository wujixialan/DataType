package com.zxg.BaseType.chap4

/**
 * Created by zxg on 2017/12/9.
 */
interface OnExternalDriverMountListener {
    fun onMount(driver1: Driver1)

    fun onUnMount(driver1: Driver1)
}

class Driver1 {

}

abstract class Player

object MusicPlayer: Player(), OnExternalDriverMountListener {
    override fun onMount(driver1: Driver1) {

    }

    override fun onUnMount(driver1: Driver1) {
    }

    val state: Int = 1



    fun play(url: String) {

    }

    fun stop() {

    }
}