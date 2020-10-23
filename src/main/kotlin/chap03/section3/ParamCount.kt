package chap03.section3

fun main() {
    // 매개변수가 없는 람다식
    noParam({"Hello World!"})
    noParam {"Hello World!"}

    // 매개변수가 1개 있는 람다식
    oneParam({ a -> "Hello World! $a" })
    oneParam { a -> "Hello World! $a" }
    oneParam { "Hello World! $it" }

    // 매개변수가 2개 이상인 람다식
    moreParam({ s: String, s1: String -> "Hello WOrld! $s $s1"})
    moreParam { s: String, s1: String -> "Hello WOrld! $s $s1"}
}


fun noParam(out: () -> String) = println(out())
fun oneParam(out: (String) -> String) {
    println(out("OneParam"))
}

fun moreParam(out: (String, String) -> String) {
    println(out("OneParam", "TwoParam"))
}