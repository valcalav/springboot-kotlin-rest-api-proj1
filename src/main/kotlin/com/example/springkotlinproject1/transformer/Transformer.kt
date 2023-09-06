package com.example.springkotlinproject1.transformer

interface Transformer <A, B> {
    fun transform(source: A): B
}