trait User {
  def getFirst: String
  def getLast: String
}

trait Transaction {
  this: User =>
  def printAmountWithTransaction(amount: Double): Unit = {
    val fullCustomerName = this.getFirst + " " + this.getLast
    val tax = amount * 0.10 // 10%
    println(s"$fullCustomerName paid $tax on amount of $amount")
  }
}
class DebitTransaction(val first: String, val last: String) extends User with Transaction {
  override def getFirst: String = first

  override def getLast: String = last
}

object TransactionRunner extends App {
  val transaction = new DebitTransaction("Tony", "Stark")
  transaction.printAmountWithTransaction(999)
}


