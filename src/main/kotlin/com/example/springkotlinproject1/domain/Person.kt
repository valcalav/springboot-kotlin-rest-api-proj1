package com.example.springkotlinproject1.domain

import jakarta.persistence.*

//With @Entity each table in the database will represent and entity

//@Id and @SequenceGenerator are annotations used for defining the primary key of an entity and specifying how that primary key's values should be generated in a database
//The @Id annotation is used to mark a field in an entity class as the primary key for the corresponding database table.
//The @SequenceGenerator annotation is used to specify how the values for the primary key (in this case, the id field) should be generated.
//Parameters of @SequenceGenerator:
//name: Specifies a unique name for the generator, which can be referenced elsewhere in the code.
//sequenceName: Specifies the name of the database sequence from which values should be generated.
//initialValue: Specifies the initial value for the sequence.
//allocationSize: Specifies how many values should be pre-allocated in advance from the sequence.
@Entity
data class Person (
        @Id
        @SequenceGenerator(name = PERSON_SEQUENCE, sequenceName = PERSON_SEQUENCE, initialValue = 1, allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = PERSON_SEQUENCE)
        val id:Long = 1,
        var name:String = "",
        var lastName:String? = null) {
    companion object {
        const val PERSON_SEQUENCE: String = "PERSON_SEQUENCE"
    }
}


