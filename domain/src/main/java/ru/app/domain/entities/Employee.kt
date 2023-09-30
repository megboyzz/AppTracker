package ru.app.domain.entities

data class Employee(
    val name: EmployeeName,
    val email: String,
    val isStuff: Boolean = false,
    val fund: Fund? = null,
    val department: Department,
)