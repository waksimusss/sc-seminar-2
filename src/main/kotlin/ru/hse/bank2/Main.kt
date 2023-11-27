package ru.hse.bank2

import ru.hse.bank2.dao.AccountDAO
import ru.hse.bank2.dao.RuntimeAccountDAO
import ru.hse.bank2.entity.AccountEntity

fun main() {
    val accountDAO: AccountDAO = RuntimeAccountDAO()

    accountDAO.createAccount(AccountEntity("Bob", 0))
    accountDAO.createAccount(AccountEntity("Alice", 10))

    accountDAO.updateByName("Bob", 20)
}
