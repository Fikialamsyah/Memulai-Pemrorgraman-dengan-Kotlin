package com.dicoding.koltinfundamental.boolean

fun main() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20


    // conjuction atau AND (&&)
    val isOpen = now >= officeOpen && now <= officeClosed
    println("Office is open : $isOpen")

    // disjunction atau OR (||)
    val isClosed = now < officeOpen || now > officeClosed

    println("office is closed : $isClosed")

    // negation or NOT (!)
    val isOpen2 = now > officeOpen

    if (!isOpen) {
        println("Office is closed")
    } else {
        println("Office is open")
    }
}