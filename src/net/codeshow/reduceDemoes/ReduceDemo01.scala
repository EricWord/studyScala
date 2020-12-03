package net.codeshow.reduceDemoes

object ReduceDemo01 {
  def main(args: Array[String]): Unit = {
    //使用化简的方式计算list集合的和
    val list = List(1, 20, 30, 4, 5)
    val res = list.reduceLeft(sum)
    println("res=" + res)

  }

  def sum(n1: Int, n2: Int): Int = {
    n1 + n2
  }

}
