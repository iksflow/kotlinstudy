package chap03.section3

fun main() {
    twoLambda({ a, b -> "First $a $b" }, { "Second $it" })
    twoLambda({ a, b -> "First $a $b" }) { "Second $it" }
    threeLambda({ a, b -> "First $a $b"}, { "Second $it" }, { "Third no it" })
    threeLambda({ a, b -> "First $a $b"},  { "Second $it" }) { "Third no it" }
}

fun twoLambda(first: (String, String) -> String, second: (String) -> String) {
    println(first("OneParam", "TwoParam"))
    println(second("OneParam"))
}

fun threeLambda(first: (String, String) -> String, second: (String) -> String, third: () -> String ) {
    println(first("OneParam", "TwoParam"))
    println(second("OneParam"))
    println(third())
}
