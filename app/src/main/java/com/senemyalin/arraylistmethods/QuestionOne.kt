package com.senemyalin.arraylistmethods

fun main() {
    val nameList = arrayListOf("Senem", "Aleyna", "Mahmut", "Oguz", "Eren")

    println("Please set 3 names by separating them with commas:")
    val getNames = readLine()

    if (!getNames.isNullOrEmpty()) {
        val userInputNames = getNames?.split(",")?.toList()

        if (!userInputNames.isNullOrEmpty()) {
            nameList.addAll(userInputNames)
        }
    }

    print("User input names are $nameList")
}