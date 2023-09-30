package ru.app.domain.entities

data class Activity(
    val employee: Employee,
    val activityType: ActivityType,
    val duration: Int,
    val money: Int
)
