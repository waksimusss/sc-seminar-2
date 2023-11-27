package ru.hse.bank2.dao

import ru.hse.bank2.entity.AccountEntity

class RuntimeAccountDAO : AccountDAO {

    var accountEntities = mutableListOf<AccountEntity>()

    override fun updateByName(name: String, sum: Long) {
        val accountEntity = accountEntities.find { it.name == name }
            ?: throw RuntimeException("Account not found")

        accountEntity.sum = sum
    }

    override fun createAccount(accountEntity: AccountEntity) {
        accountEntities.add(accountEntity)
    }

}
