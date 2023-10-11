package com.example.springkotlinproject1.dto

import java.time.LocalDateTime

data class ErrorResponse(val title: String = "Bad request", val message:String, val dateTime: LocalDateTime = LocalDateTime.now() )
