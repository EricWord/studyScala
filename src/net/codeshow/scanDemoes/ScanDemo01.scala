package net.codeshow.scanDemoes

object ScanDemo01 {
  def main(args: Array[String]): Unit = {
    //普通函数
    def minus(num1: Int, num2: Int): Int = {
      num1 - num2
    }

    val i = (1 to 5).scanLeft(5)(minus)
    println("i=" + i)

    def add(num1: Int, num2: Int): Int = {
      num1 + num2

    }

    val i2 = (1 to 5).scanLeft(5)(add)
    println("i2=" + i2)

  }

}
