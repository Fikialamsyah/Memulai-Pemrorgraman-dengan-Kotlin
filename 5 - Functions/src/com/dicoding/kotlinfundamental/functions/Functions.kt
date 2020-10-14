package com.dicoding.kotlinfundamental.functions

fun main() {
    val user = setUser("Fiki", 19)
    println(user)

    printUser("Fiki")
}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String){
    println("Your name is $name")
}