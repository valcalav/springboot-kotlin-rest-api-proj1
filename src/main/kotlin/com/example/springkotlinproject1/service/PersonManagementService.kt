package com.example.springkotlinproject1.service

import com.example.springkotlinproject1.dto.AddPersonRequest
import com.example.springkotlinproject1.dto.PersonResponse
import com.example.springkotlinproject1.dto.UpdatePersonRequest

interface PersonManagementService {
    fun findById(id:Long): PersonResponse?
    fun findAll(): List<PersonResponse>
    fun save(addPersonRequest: AddPersonRequest): PersonResponse
    fun update(updatePersonRequest: UpdatePersonRequest): PersonResponse
    fun deleteById(id:Long)
}