package com.example.springkotlinproject1.transformer

import com.example.springkotlinproject1.domain.Person
import com.example.springkotlinproject1.dto.PersonResponse

fun Person?.toPersonResponse(): PersonResponse {
    return PersonResponse(
            id = this?.id ?: 1L,
            fullName = "$this?.lastName, ${this?.name}"
    )
}