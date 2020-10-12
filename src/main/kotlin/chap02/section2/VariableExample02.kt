package chap02.section2

fun main() {
    val ch01 = 'c'
    val ch02: Char
    var ch03: Char
    ch02 = 'b'
//    ch02 = 'c'  // val cannot be reassigned 오류 발생
    ch03 = 'd'
    ch03 = 'e'
    println(ch01)
    println(ch02)
    println(ch03)
}