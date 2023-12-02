package ru.hse.bank.entity

import com.fasterxml.jackson.annotation.JsonProperty

data class AccountEntity(
    val name: String,
    var sum: Long = 0
)
