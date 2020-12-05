package net.codeshow.matchDemoes

object MatchDemo01 {
  def main(args: Array[String]): Unit = {
    val operator = '-'
    val n1 = 20
    val n2 = 10
    var res = 0
    operator match {
      case '+' => res = n1 + n2
      case '-' => res = n1 - n2
      case '*' => res = n1 * n2
      case '/' => res = n1 / n2
      case _ => println("operator err")
    }
    println("res=" + res)

  }

}
