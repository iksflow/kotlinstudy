package chap02.section3

fun main() {
    val byte01: Byte = 10
    val short01: Short = 20
    val int01: Int = 30
    val long01: Long = 40
    val float01: Float = 1.11f
    val double01: Double = 2.22
    val char01: Char = 'C'

    var int02 = byte01 + long01
    var char02 = (int01 + 40).toChar()
    println(char01)
    println(char02)
}