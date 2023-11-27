package ru.hse.bank

data class Person(
    val name: String,
    var age: Int? = null
)

fun main() {

    val alice = Person(name = "Alice", age = 20)
    val bob = Person("bob", 22)
    val error = Person("error")

    val persons = arrayOf(alice, bob, error)

    bob.age?.let { println() }

    persons.maxBy { it.age ?: 0 }
}
