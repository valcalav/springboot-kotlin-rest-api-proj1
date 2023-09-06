package com.example.springkotlinproject1.dao

import com.example.springkotlinproject1.domain.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

// JpaRepository is part of Spring Data JPA, which simplifies database access and reduces boilerplate
// code when working with relational databases.

// PersonDao is defined as an interface because Spring Data JPA will automatically provide the implementation for you
// based on the method signatures defined in the interface.
//Parameters taken: 1) entity type that you want to perform CRUD operations on, and 2) the type of the primary key for your Person entity.

//The @Repository annotation is a Spring stereotype annotation that indicates that the class
// (or interface in this case) is a repository, which is a component responsible for encapsulating
// the interaction with a data source (in this case, a database).
@Repository
interface PersonDao: JpaRepository<Person, Long>