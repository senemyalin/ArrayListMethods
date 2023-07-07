package com.senemyalin.arraylistmethods

fun main() {

    val students = arrayListOf(
        Student("Ahmet", 20, "Üniversite A"),
        Student("Ayşe", 27, "Üniversite B"),
        Student("Mehmet", 22, "Üniversite C"),
        Student("Fatma", 28, "Üniversite A"),
        Student("Ali", 29, "Üniversite B"),
        Student("Feyza", 24, "Üniversite A"),
        Student("Berkay", 22, "Üniversite B"),
        Student("Caner", 26, "Üniversite A")
    )

    val maxAge = students.maxBy { it.age }
    val maxAgeIndex = students.indexOf(maxAge)
    println("Max age of the students: $maxAge")
    println("Index: $maxAgeIndex")

    val minAge = students.minBy { it.age }
    val minAgeIndex = students.indexOf(minAge)

    println("Min age of the students: $minAge")
    println("Index: $minAgeIndex")

    val studentsUniversityA = students.filter { it.school == "Üniversite A" }

    println("UniversityA Students who are bigger than 25: ${studentsUniversityA.filter { it.age > 25 }}")
    println("UniversityA Students who are less than 25 ${studentsUniversityA.filter { it.age < 25 }}")

}

data class Student(val name: String, val age: Int, val school: String)
