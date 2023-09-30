package ru.app.domain.entities

data class Fund(
    val fundId: Int,
    val name: String,
    val balance: Int,
    val tin: String,
    val tags: List<String>,
    val address: String,
    val phoneNumber: PhoneNumber
)