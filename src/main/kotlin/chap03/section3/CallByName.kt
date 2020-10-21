package chap03.section3

import com.sun.org.apache.xpath.internal.operations.Bool

fun main() {
    val result = callByName(otherLambda)
    println(result)
}

fun callByName(b: () -> Boolean): Boolean {
    println("callByName function")
    return b()
}

val otherLambda: () -> Boolean = {
    println("otherLambda function")
    true
}
