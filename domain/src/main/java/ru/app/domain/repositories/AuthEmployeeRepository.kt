package ru.app.domain.repositories

import ru.app.domain.entities.Employee

interface AuthEmployeeRepository {

    suspend fun signIn(email: String, password: String): Result<Employee>

    suspend fun signUp(employee: Employee, password: String): Result<Employee>

}