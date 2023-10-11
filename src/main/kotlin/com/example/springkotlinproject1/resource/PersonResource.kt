package com.example.springkotlinproject1.resource

import com.example.springkotlinproject1.domain.Person
import com.example.springkotlinproject1.dto.AddPersonRequest
import com.example.springkotlinproject1.dto.PersonResponse
import com.example.springkotlinproject1.dto.UpdatePersonRequest
import org.springframework.http.ResponseEntity

interface PersonResource {
    fun findById(id:Long): ResponseEntity<PersonResponse>
    fun findAll(): ResponseEntity<List<PersonResponse>>
    fun save(addPersonRequest: AddPersonRequest): ResponseEntity<PersonResponse>
    fun update(updatePersonRequest: UpdatePersonRequest): ResponseEntity<PersonResponse>
    fun deleteById(id:Long): ResponseEntity<Unit>
}