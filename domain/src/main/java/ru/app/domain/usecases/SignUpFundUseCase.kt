package ru.app.domain.usecases

import ru.app.domain.entities.Fund
import ru.app.domain.repositories.FundRepository

class SignUpFundUseCase(
    private val fundRepository: FundRepository
) {

    suspend operator fun invoke(fund: Fund) =
        fundRepository.signUpFund(fund)

}