package com.senemyalin.arraylistmethods

fun main() {
    val workers = arrayListOf(
        Workers("Ahmet Yılmaz", 15000.0),
        Workers("Ayşe Kaya", 32000.0),
        Workers("Mehmet Demir", 29000.0),
        Workers("Fatma Şahin", 18500.0)
    )

    val newWorkers = workers.map {
        Workers(
            name = it.name,
            salary = it.salary * 1.35
        )
    }

    val shuffledWorkers = newWorkers.shuffled()
    val sortedShuffledWorkers = shuffledWorkers.sortedBy { it.salary }

    val maxSalaryOfWorker = sortedShuffledWorkers.maxBy { it.salary }
    println("Max salary of Worker List: $maxSalaryOfWorker")

    val minSalaryOfWorker = sortedShuffledWorkers.minBy { it.salary }
    println("Min salary of Worker List: $minSalaryOfWorker")

    val averageSalary = sortedShuffledWorkers.sumOf { it.salary / sortedShuffledWorkers.size }
    println("Average salary of Worker List: $averageSalary")
}

data class Workers(val name: String, val salary: Double)
