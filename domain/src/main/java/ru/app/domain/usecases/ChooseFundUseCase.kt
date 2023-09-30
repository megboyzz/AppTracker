package ru.app.domain.usecases

import ru.app.domain.entities.Fund
import ru.app.domain.repositories.FundRepository

class ChooseFundUseCase(
    private val fundRepository: FundRepository
) {

    suspend operator fun invoke(fund: Fund) =
        fundRepository.setNewFundToCurUser(fund)

}