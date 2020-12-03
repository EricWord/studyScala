package net.codeshow.mapOperateDemoes

object HighOrderFuncDemo01 {
  def main(args: Array[String]): Unit = {
    //使用高阶函数
    val res = test(sum2 _, 3.5)
    println("res=" + res)
    //在scala中可以把一个函数直接赋给一个变量
    val f1 = myPrint _
    //执行
    f1()

  }

  //test就是一个高阶函数
  //f: Double => Double 表示一个函数，该函数可以接收一个Double,返回Double
  //n1:Double 普通参数
  //f(n1)在test函数中执行传入的函数
  def test(f: Double => Double, n1: Double): Double = {
    f(n1)
  }

  //普通的函数，该函数可以接收一个Double,返回Double
  def sum2(d: Double): Double = {
    d + d
  }

  def myPrint(): Unit = {
    println("Hello,world!")
  }

}
