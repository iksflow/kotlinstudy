package chap03.section3

import com.sun.org.apache.xpath.internal.operations.Bool

fun main() {
    val result = callByName(otherLambda)
    val result2 = callByName2(otherLambda2)
    println(result)
    println(result2)
}

fun callByName(b: () -> Boolean): Boolean {
    println("callByName function")
    return b()
}

fun callByName2(b: (a: Boolean) -> Boolean): Boolean {
    println("callByName2 function")
    return b(true)
}

val otherLambda: () -> Boolean = {
    println("otherLambda function")
    true
}


val otherLambda2: (a: Boolean) -> Boolean = {
    // a는 왜 사용하지 못하는걸까?
    println("otherLambda2 function: ")
    true
}