package com.zxg.BaseType.chap4

import com.zxg.BaseType.chap2.getName
import java.awt.event.MouseAdapter

/**
 * Created by zxg on 2017/12/5.
 */
interface InputDevice {
    fun input(event: Any)
}

interface USBInputDevice: InputDevice

interface BLEInputDevice: InputDevice

interface OpticalMouse

class Computer {
    private fun addUSBInputDevice(inputDevice: USBInputDevice) {
//        插入输入设备
        println("add USB Input Device: $inputDevice")
    }

    private fun addBLEInputDevice(inputDevice: BLEInputDevice) {
//        插入蓝牙输入设备
        println("add BLE Input Device: $inputDevice")
    }

    fun addInputDevice(inputDevice: InputDevice) {
        when (inputDevice) {
            is USBInputDevice -> {
                addUSBInputDevice(inputDevice = inputDevice)
            }
            is BLEInputDevice -> {
                addBLEInputDevice(inputDevice = inputDevice)
            }
            else -> {
                throw IllegalArgumentException("不支持此接口的设备") as Throwable
            }
        }
    }
}

abstract class USBMouse(private val name: String): USBInputDevice, OpticalMouse {
    override fun input(event: Any) {

    }

    override fun toString(): String {
        return name
    }
}

class LogitechMouse(private val name: String): USBMouse(name = name) {

}

fun main(args: Array<String>) {
    val computer: Computer = Computer()
    val mouse: LogitechMouse = LogitechMouse("罗技鼠标")
    computer.addInputDevice(mouse)
}