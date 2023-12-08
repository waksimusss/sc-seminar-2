package ru.hse.bank

import ru.hse.bank.dao.FileSystemAccountDao
import ru.hse.bank.entity.AccountEntity
import java.awt.Frame

fun main() {

    var accountDao = FileSystemAccountDao()
    val alice = AccountEntity(name = "Alice", sum = 300)
    val bob = AccountEntity(name = "Bob", sum = 1000)
    val dobby = AccountEntity(name = "Dobby", sum = 30000)

    accountDao.saveAccount(alice)
    accountDao.saveAccount(bob)
    accountDao.saveAccount(dobby)

    accountDao.increaseAccountSumByName("Alice", 200)

    accountDao.transfer("Dobby", "Bob", 3000)
    accountDao.transfer("Dobby", "Alice", 500)
//
//    accountDao.saveAccount(alice)
//    accountDao.increaseAccountSumByName("Alice", 100)
//
//    var acc = accountDao.findAccountByName("Alice")
//    println(acc.sum)
}
