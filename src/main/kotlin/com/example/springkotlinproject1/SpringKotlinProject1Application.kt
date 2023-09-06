package com.example.springkotlinproject1

import com.example.springkotlinproject1.domain.Person
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class SpringKotlinProject1Application {

	@GetMapping
	fun hi(): Person {
		return Person(lastName = "The Monster", name = "Frankenstein")
	}
}

fun main(args: Array<String>) {
	runApplication<SpringKotlinProject1Application>(*args)
}
