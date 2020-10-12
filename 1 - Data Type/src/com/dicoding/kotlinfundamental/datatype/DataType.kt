package com.dicoding.kotlinfundamental.datatype

fun main() {
    // var identifier : type = initialization
    // var = mutable
    var company : String = "Dicoding"
    company = "Dicoding Academy"

    // val = immutable
    val name : String = "Fiki"
    // name = "Dika" // val cannot be reagsined

    // menggunakan operator +
    val firstWord = "Dicoding"
    val lastWord = "Academy"
    print(firstWord + lastWord)

    val valueA : Int = 10
    val valueB : Int = 20
    print(valueA + valueB)
}
