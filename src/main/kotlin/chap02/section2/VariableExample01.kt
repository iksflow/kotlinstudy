package chap02.section2

fun main() {
    /*
    * 변수명에 대고 Ctrl + Shift + P 를 누르면 추론한 타입을 보여준다.
    * 양수만 표현하는 Unsigned 타입이 존재한다. Unsigned 타입은 Unsigned끼리만 연산이 가능하다.
    * 값 뒤에 u를 붙이면 Unsigned 타입으로 변수를 생성한다.
    * UByte, UShort, UInt, ULong
    * */
    val int01 = 1000u
    val int02: UInt = 10000u
    val int03 = 2147483647
    val int04 = 2147483647 + 1
    val int05 = 2147483648 - 1
    val long01 = 2147483648
    val long02 = 4294967295u
    val long03 = 4294967296u
    val number01 = 1_000_000
    val double01 = 3.14
    val float01 = 3.14f
    val float02 = 3.14F
    val exp01 = 3.14E-2
    val exp02 = 3.14e-2
    val exp03 = 3.14e2

    println(int01)
    println(int02)
    println(int03)
    println(int04)
    println(int05)
    println(int05)
    println(long01)
    println(long02)
    println(long03)
    println(number01)
    println(double01)
    println(float01)
    println(float02)
    println(float01 == float02)
    println(exp01)
    println(exp02)
    println(exp03)
}