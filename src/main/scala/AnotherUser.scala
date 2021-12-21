package com {
  package pluralsight {
    package entities {   // This is known as nested package statement
      case class AnotherUser(f: String, l: String)
    }
  }
}

package main {
  import com.pluralsight.entities.AnotherUser
  object Runner extends App {
    val u: AnotherUser = AnotherUser("Tim", "Cook")
    println(u)
  }
}


