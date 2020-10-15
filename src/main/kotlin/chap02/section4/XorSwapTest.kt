package chap02.section4

import java.sql.SQLOutput

fun main() {
    var number1 = 12
    var number2 = 25

    number1 = number1 xor number2
    number2 = number1 xor number2
    number1 = number1 xor number2
    println("number1 = $number1")
    println("number2 = $number2")
    println((((12 xor 25) xor 25) xor (12 xor 25)))
    println(25 xor 0)
    /*
    * a ^ b ^ b ^ a ^ b
    * 자기자신과 xor 연산을 하면 0이 된다.
    * 0과 xor연산은 자기자신이 나온다.
    * 위 식은 결국 a^a^b^b^b
    * 맨 마지막 b의 앞에 0으로 결과가 나오므로 연산결과는 b가 된다.*/
    println(0.inv())
}