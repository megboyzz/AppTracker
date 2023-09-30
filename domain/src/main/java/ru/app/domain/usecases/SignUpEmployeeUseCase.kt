package ru.app.domain.usecases

import ru.app.domain.entities.Employee
import ru.app.domain.repositories.AuthEmployeeRepository

class SignUpEmployeeUseCase(
    private val authEmployeeRepository: AuthEmployeeRepository
) {

    suspend operator fun invoke(employee: Employee, password: String) =
        authEmployeeRepository.signUp(employee, password)

}