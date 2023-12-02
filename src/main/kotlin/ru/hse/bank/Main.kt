package ru.hse.bank

import ru.hse.bank.dao.FileSystemAccountDao
import ru.hse.bank.entity.AccountEntity

fun main() {

    var accountDao = FileSystemAccountDao()
    val alice = AccountEntity(name = "Alice", sum = 200)

    accountDao.saveAccount(alice)
}
