package com.zxg.BaseType.chap3

import com.sun.corba.se.spi.extension.ZeroPortPolicy

/**
 * Created by zxg on 2017/12/4.
 */
fun main(args: Array<String>) {
    while (true) {
        print("请输入算式如 3 + 4：")
        try {
            var input1 = readLine()
            val splits = input1?.trim()
            var list: List<String>
            if (splits!!.length <= 3) {
                throw IllegalArgumentException("参数不够")
            } else {
                list = splits.split(" ")
            }
            var arg1 = list[0].toDouble()
            var op = list[1]
            var arg2 = list[2].toDouble()
            val result = Operator(op).apply(left = arg1, right = arg2)
            if (result == 0.0) {
                println("分母不能为零！")
            } else {
                println("$arg1 $op $arg2 = $result")
            }
        } catch (e: NumberFormatException) {
            println("您确定输入的数字吗？")
        } catch (e: IllegalArgumentException) {
            println(e.message)
        } catch (e: Exception) {
            println(e.message)
        }
        print("还要继续进行吗？y/n: ")
        val cmd = readLine()
        if (cmd == null || cmd.toLowerCase() != "y") {
            break
        }
    }
}

class Operator(op: String) {
    private val opFun: (left: Double, right: Double) -> Double

    init {
        opFun = when (op) {
            "+" -> { l, r -> l + r }
            "-" -> { l, r -> l - r }
            "*" -> { l, r -> l * r }
            "/" -> { l, r ->
                if (r == 0.0) {
                    throw Exception("除 0 异常")
                } else {
                    l / r
                }
            }
            "%" -> { l, r -> l % r }
            else -> {
                throw UnsupportedOperationException(op)
            }
        }
    }

    fun apply(left: Double, right: Double): Double {
        return opFun(left, right)
    }
}