package ru.hse.bank.dao

import ru.hse.bank.entity.AccountEntity

interface AccountDAO {

    fun findAccountByName(name: String): AccountEntity

    fun increaseAccountSumByName(name: String, sum: Long): AccountEntity

    fun saveAccount(accountEntity: AccountEntity): Boolean
}
