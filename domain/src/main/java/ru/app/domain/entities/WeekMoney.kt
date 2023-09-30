package ru.app.domain.entities

data class WeekMoney(
    val weekId: Int,
    val department: Department,
    val balance: Int
)
