package chap02.section3

fun main() {
    val a: Int = 128
    val b = a
    println(a === b)

    val c: Int? = a
    val d: Int? = a
    val e: Int? = c
    println(c == d)
    println(c === d)
    println(c === e)


    // -128 ~ 127의 범위를 넘어가면 스택에 저장함
    val t: Int = 128
    val t01: Int? = t
    val t02: Int? = t
    println("t01 == t02 : ${t01 == t02}")
    println("t01 === t02 : ${t01 === t02}")
    println("t01 === t02 : ${t01 === t02}")


    // -128 ~ 127의 범위안의 값은 캐시에 저장함 즉 캐시의 주소를 가지고있음.
    val z: Int = 12
    val z01: Int? = z
    val z02: Int? = z
    println("z01 == z02 : ${z01 == z02}")
    println("z01 === z02 : ${z01 === z02}")
    println("z01 === z02 : ${z01 === z02}")

}