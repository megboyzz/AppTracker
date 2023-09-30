package ru.app.domain.repositories

import ru.app.domain.entities.Fund

interface FundRepository {

    suspend fun signUpFund(fund: Fund): Result<Any>

    suspend fun setNewFundToCurUser(fund: Fund): Result<Any>

}