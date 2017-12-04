package com.zxg.BaseType.chap3

/**
 * Created by zxg on 2017/11/23.
 */
private const val USERNAME = "zxg"
private const val PASSWORD = "031209"

private const val ADMIN_USER = "admin"
private const val ADMIN_PASSWORD = "admin"

private const val DEBUG = 1
private const val USER = 0

fun main(args: Array<String>) {
    val mode = if (args.isNotEmpty() && args[0] == "1") {
        DEBUG
    } else {
        USER
    }

    print("请输入用户名: ")
    val username = readLine()
    print("请输入密码: ")
    val password = readLine()

    if (mode == DEBUG && username == ADMIN_USER && password == ADMIN_PASSWORD) {
        println("管理员登录成功")
    } else if (username == USERNAME && password == PASSWORD) {
        println("登录成功")
    } else {
        println("登录失败")
    }
}