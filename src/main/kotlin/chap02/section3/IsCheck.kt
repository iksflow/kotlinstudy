package chap02.section3

fun main() {
    val num = 256
    var num2: Any
    if (num is Int) {
        print(num)
    } else if (num !is Int) {
        print("Not a Int")
    }
}