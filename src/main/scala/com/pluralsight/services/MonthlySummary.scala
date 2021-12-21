package com.pluralsight.services

import com.pluralsight.entities.{AppUser, Budget, Transaction, sum}

case class MonthlySummary(val budget: Budget,
                          val ts: Array[Transaction]) {
  val userId: String = AppUser("Nick", "James").getId
  val total: Int = sum(2, 3)
}