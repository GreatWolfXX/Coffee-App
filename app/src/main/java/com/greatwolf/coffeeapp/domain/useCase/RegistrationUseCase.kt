package com.greatwolf.coffeeapp.domain.useCase

import com.greatwolf.coffeeapp.domain.repository.CoffeeRepository
import javax.inject.Inject

class RegistrationUseCase @Inject constructor(
    private val coffeeRepository: CoffeeRepository
) {
    suspend operator fun invoke(email: String, password: String) = coffeeRepository.registrationUser(email, password)
}