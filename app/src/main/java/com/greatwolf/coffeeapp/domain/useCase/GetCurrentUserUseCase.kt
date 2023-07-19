package com.greatwolf.coffeeapp.domain.useCase

import com.greatwolf.coffeeapp.domain.repository.Repository
import javax.inject.Inject

class GetCurrentUserUseCase @Inject constructor(
    private val repository: Repository
) {
    suspend operator fun invoke() = repository.getCurrentUser()
}