package ru.app.domain.entities

data class PhoneNumber(
    val number: String
){
    override fun toString(): String {
        val digitsOnly = number.filter { it.isDigit() }

        return if (digitsOnly.length == 11 && digitsOnly.endsWith("7"))
            "+7 (${digitsOnly.substring(1, 4)}) ${digitsOnly.substring(4, 7)}-${digitsOnly.substring(7)}"
        else number
    }
}
