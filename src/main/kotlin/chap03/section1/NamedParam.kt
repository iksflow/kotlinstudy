package chap03.section1

fun main() {
    // 파라미터 이름과 대입연산자를 통해 직접 값을 매핑할 수 있다.
    namedParam(x = 200, z = 100)
    namedParam(z = 150)
}

fun namedParam(x: Int = 100, y: Int = 200, z: Int) {
    println(x + y + z)
}
