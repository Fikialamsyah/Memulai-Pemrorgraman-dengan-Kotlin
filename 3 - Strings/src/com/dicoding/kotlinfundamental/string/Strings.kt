package com.dicoding.kotlinfundamental.string

fun main() {
    val text = "Kotlin"
    val firstChar = text[0]

    println("First character of $text is $firstChar")

    // melakukan iterasi pada text
    for (char in text) {
        println("$char")
    }

    //  escaped string
    val statement = "Kotlin is \"Awesome!\""

    // menambahkan unicode
    val name = "Unicode test: \u00A9"
    println(name)

    // rawstring
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    println(line)
}