package chap02.section3

fun main() {
    var str1: String = "Hello Kotlin"
    // Null can not be a value of a non-null type String 오류 발생
//    str1 = null
    println("str1: $str1")
    var str2: String? = "Hello Kotlin"
    str2 = null
    println("str2: $str2")
    println("str1.length(): ${str1.length}")
    /* null을 허용한 변수의경우 세이프 콜(?) 또는 단정기호(!!)를 변수 명 뒤에 붙여서 호출해야 한다.
    * 기호를 사용하지 않고 조건문을 통해 null을 검사하는 로직을 추가해서 처리하는것도 가능하다 */
//    println("str2.length(): ${str2.length}")
//    println("str2.length(): ${str2!!.length}")
    println("str2.length(): ${str2?.length}")
    val len = if (str2 != null) str2.length else null
    println(len)




}