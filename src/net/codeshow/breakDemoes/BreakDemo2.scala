package net.codeshow.breakDemoes

object BreakDemo2 {
  def main(args: Array[String]): Unit = {

  }

  def sumToMax(arr: Array[Int], limit: Int): Int = {
    var sum = 0
    for (i <- arr) {
      sum += i
      if (sum > limit) return limit
    }
    sum
  }

  val a = Array.range(0, 10)
  println(sumToMax(a, 10))

  import scala.annotation.tailrec

  def factorial(n: Int): Int = {
    @tailrec def factorialAcc(acc: Int, n: Int): Int = {
      if (n <= 1) acc
      else factorialAcc(n * acc, n - 1)
    }
    factorialAcc(1, n)
  }

  

}
