package net.codeshow.lazyFunc

object lazyFunc01 {
  def main(args: Array[String]): Unit = {
    lazy val res = sum(10, 20)
    println("----------------")
//    println("res=" + res) //在要使用res前才执行

  }

  def sum(n1: Int, n2: Int): Int = {
    println("sum函数执行了...")
    n1 + n2

  }

}
