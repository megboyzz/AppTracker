package ru.app.domain.usecases

import ru.app.domain.repositories.AuthEmployeeRepository

class SignInEmployeeUseCase(
    private val authEmployeeRepository: AuthEmployeeRepository
) {

    suspend operator fun invoke(email: String, password: String) =
        authEmployeeRepository.signIn(email, password)

}