package chap03.section3

fun main() {
    var result: Int
    var multi = {x: Int, y: Int -> x * y}
    result = multi(10, 20)
    println(result)
    // OK
    val perfectFormat: (Int, Int) -> Int = {x: Int, y: Int -> x * y}
    val shortFormat1: (Int, Int) -> Int = {x, y -> x * y}
    val shortFormat2 = {x: Int, y: Int -> x * y}
    val shortFormat3 = {x: Int, y: Int ->
        println("x : $x, y: $y")
        x * y}

    println(perfectFormat(3, 3))
    println(shortFormat1(3, 3))
    println(shortFormat2(3, 3))
    println(shortFormat3(3, 3))

    // 반환자료형이 없거나 매개변수가 하나라면?

    // 반환자료형이 없을 경우 - (Unit) 매개변수 파트와 화살표를 생략할 수 있다!
    val greet: () -> Unit = {println("Hello World")}
    // 반환자료형이 없으니 아예 람다식 자료형 선언부분을 생략하는것도 가능!
    val greet2 = { println("Hello World")}
    // 매개변수가 1개인경우 - 매개변수 파트에서 반환
    val square: (Int) -> Int = {x -> x * x}

    val nestedLambda: () -> () -> Unit = {
        { println("nested")}
    }
    nestedLambda()()

}