package chap03.section1

// 1. 완전하게 정의한 함수 형태
//fun sum(a: Int, b: Int): Int {
//    var sum = a + b
//    return sum
//}
// 2. 인자로 들어온 값을 바로 더해서 반환하는 형태
//fun sum(a: Int, b: Int): Int {
//    return a + b
//}
// 3. 대입연산자를 사용한 형태 (본문이 1줄일 경우만 가능)
//fun sum(a: Int, b: Int): Int = a + b
// 4. 반환형을 생략한 형태 (Int형끼리의 연산이므로 반환형도 Int라고 추론가능하니 생략할 수 있다!)
fun sum(a: Int, b: Int) = a + b

fun main() {
    val result1 = sum(3, 2)
    val result2 = sum(6, 7)

    println(result1)
    println(result2)
}