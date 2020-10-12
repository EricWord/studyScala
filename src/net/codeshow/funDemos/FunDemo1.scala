package net.codeshow.funDemos

object FunDemo1 {

  def main(args: Array[String]): Unit = {

    val n1 = 10
    val n2 = 20
    println("res=" + getRes(n2, n1, ')'))
  }

  //  定义函数/方法
  def getRes(n1: Int, n2: Int, oper: Char): Any = {
    if (oper == '+') {
      n1 + n2
    } else if (oper == '-') {
      n1 - n2
    } else {
      null
    }
  }

}
