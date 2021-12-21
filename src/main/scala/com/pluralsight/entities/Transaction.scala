package com.pluralsight.entities

case class Transaction(val user: User) {
  val userId: String = AppUser("Mary", "Janes").getId
  val total: Int = sum(1, 3)
}
