package com.iksflow.study.chap02.section1

import com.iksflow.study.Person as User

fun main() {
    val user1 = User("Kildong", 30)
    val user2 = Person("A123", "Kildong")

    println(user1.name)
    println(user1.age)

    println(user2.id)
    println(user2.name)
}

class Person(val id: String, val name: String)