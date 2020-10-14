package com.dicoding.kotlinfundamental.ifexpressions

fun main() {
    val openHours = 7
    val now = 20
    val office : String
    office = if (now > openHours){
        "Office Already Open"
    } else if (now == openHours) {
        "Wait a minute, office will be open"
    } else{
        "Office is closed"
    }
    println(office)
}