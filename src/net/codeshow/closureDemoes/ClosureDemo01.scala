package net.codeshow.closureDemoes

object ClosureDemo01 {
  def main(args: Array[String]): Unit = {
    def minusxy(x: Int) = (y: Int) => x - y

    //f函数就是闭包
    val f = minusxy(20)
    println("f(1)=" + f(1))
    println("f(2)=" + f(2))
  }

}
