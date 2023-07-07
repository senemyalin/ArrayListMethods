package com.senemyalin.arraylistmethods

fun main() {
    val names = arrayListOf("Sinem", "Ali", "Hümeyra", "Cem", "Gizem")
    val sortedNames = getSortedNamesOfList(names)
    val uppercaseSortedNames = sortedNames.map { it.uppercase() }

    println("Please set 1 name:")
    var getName = readLine()

    if (!getName.isNullOrEmpty()) {
        getName = getName.uppercase()

        if (uppercaseSortedNames.contains(getName)) {
            println(getName.uppercase().reversed())
        }
    }
}

private fun getSortedNamesOfList(names: ArrayList<String>): List<String> {
    return names.sorted()
}