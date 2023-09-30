package ru.app.domain.entities

data class EmployeeName(
    val firstName: String,
    val lastName: String,
    val patronymic: String
){
    override fun toString(): String {
        return "$lastName ${firstName.first()}.${lastName.first()}."

    }
}
