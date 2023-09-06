package com.example.springkotlinproject1.transformer

import com.example.springkotlinproject1.domain.Person
import com.example.springkotlinproject1.dto.AddPersonRequest
import org.springframework.stereotype.Component

@Component
class AddPersonRequestTransformer: Transformer<AddPersonRequest, Person> {
    override fun transform(source: AddPersonRequest): Person {
        return Person(
                name= source.name,
                lastName = source.lastName
        )
    }
}