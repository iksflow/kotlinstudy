package chap02.section2

fun main() {
    /*
    * 다중문자열의 들여쓰기는 space로 이루어져있다.
    * 흔히 쓰는 count변수는 당연하게도 값이 변하는곳에 쓰이기 때문에 val로 선언하면 오류가 발생한다.
    * */
    val num = 10
    val formatttedString = """
        var a = 6
        var b = "Kotlin"
        println(a + num)
    """
    println(formatttedString)
    var count = 0
    for (i in 1 until formatttedString.length - 1) {
        if (formatttedString.get(i) == ' ') {
            println("true")
            count++
        }
    }
    println(count)

}