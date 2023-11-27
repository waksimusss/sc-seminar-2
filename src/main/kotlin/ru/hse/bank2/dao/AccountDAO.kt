package ru.hse.bank2.dao

import ru.hse.bank2.entity.AccountEntity

interface AccountDAO {

    fun updateByName(name: String, sum: Long)

    fun createAccount(accountEntity: AccountEntity)
}