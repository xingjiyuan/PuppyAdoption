package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R

data class Dog(
    val animalId: String,
    val intakeType: String,
    val inDate: String,
    val name: String,
    val type: String,
    val age: String,
    val size: String,
    val breed: String,
    val sex: String,
    val link: String,
    val crossing: String,
    val color: String,
    val resId: Int = R.drawable.dog_default,
)