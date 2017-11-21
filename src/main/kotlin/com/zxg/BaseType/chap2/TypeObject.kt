package com.zxg.BaseType.chap2

/**
 * Created by zxg on 2017/11/16.
 */
/***
 *  构造方法
 *  class MathClassBook (isbn: String, bookName: String, author: String)
 *  (isbn: String, bookName: String, author: String) 这个就代表构造方法
 */
class MathClassBook(isbn: String, bookName: String, author: String): Book(isbn, bookName, author)

/**
 * 要让类能够继承，必须在别继承类的前面加上 open
 * 当构造方法只有一个时候，constructor 可以省略
 */
open class Book constructor(private var isbn: String, private var bookName: String, private var author: String) {
    init {
        println("$isbn, $bookName, $author")
    }
}

fun main(args: Array<String>) {
    var mathBook: MathClassBook = MathClassBook("946-6567-6565", "侠岚", "赵小刚")
    println(mathBook is Book)
}