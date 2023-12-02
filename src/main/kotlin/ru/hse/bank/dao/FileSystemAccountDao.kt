package ru.hse.bank.dao

import ru.hse.bank.entity.AccountEntity
import java.nio.charset.Charset
import kotlin.io.path.Path

class FileSystemAccountDao : AccountDao {

    companion object {
        private val DIR_WITH_ACCOUNTS = "accounts"
    }

    override fun findAccountByName(name: String): AccountEntity {
        TODO("Not yet implemented")
    }

    override fun increaseAccountSumByName(name: String, sum: Long): AccountEntity {
        TODO("Not yet implemented")
    }

    override fun saveAccount(accountEntity: AccountEntity): Boolean {
        val file = Path(DIR_WITH_ACCOUNTS, accountEntity.name).toFile()

        if (file.exists()) {
            file.delete()
        }

        file.writeText("${accountEntity.sum}", Charset.defaultCharset())

        return file.exists()
    }
}
